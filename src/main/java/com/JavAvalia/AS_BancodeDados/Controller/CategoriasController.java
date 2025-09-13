package com.JavAvalia.AS_BancodeDados.Controller;

import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import com.JavAvalia.AS_BancodeDados.Service.CategoriasService;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriasController {
    private CategoriasService categoriasService;
    public CategoriasController(CategoriasService categoriasService) {
        this.categoriasService = categoriasService;
    }
    @PostMapping
    public ResponseEntity<Categorias> criarCategoria(@RequestBody Categorias categoriaRequest) {
        Categorias categorias = this.categoriasService.save(categoriaRequest);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(categorias.getId()).toUri();
        return ResponseEntity.created(uri).body(categorias);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categorias> listarCategoriasPorId(@PathVariable ObjectId id) {
        return categoriasService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public ResponseEntity<List<Categorias>> listarCategorias() {
        return ResponseEntity.ok().body(categoriasService.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCategoria(@PathVariable ObjectId id) {
        boolean existe = categoriasService.findById(id).isPresent();

        if (!existe) {
            return ResponseEntity.notFound().build();
        }

        categoriasService.deleteById(id);
        return ResponseEntity.noContent().build(); // HTTP 204
    }

}
