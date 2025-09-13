package com.JavAvalia.AS_BancodeDados.Controller;

import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import com.JavAvalia.AS_BancodeDados.Model.Usuarios;
import com.JavAvalia.AS_BancodeDados.Service.CategoriasService;
import com.JavAvalia.AS_BancodeDados.Service.UsuariosService;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    private UsuariosService usuariosService;
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }
    @PostMapping
    public ResponseEntity<Usuarios> criarUsuario(@RequestBody Usuarios usuarioRequest) {
        Usuarios usuarios = this.usuariosService.save(usuarioRequest);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuarios.getId()).toUri();
        return ResponseEntity.created(uri).body(usuarios);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuarios> listarUsuariosPorId(@PathVariable ObjectId id) {
        return usuariosService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public ResponseEntity<List<Usuarios>> listarUsuarios() {
        return ResponseEntity.ok().body(usuariosService.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable ObjectId id) {
        boolean existe = usuariosService.findById(id).isPresent();

        if (!existe) {
            return ResponseEntity.notFound().build();
        }

        usuariosService.deleteById(id);
        return ResponseEntity.noContent().build(); // HTTP 204
    }
}
