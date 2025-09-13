package com.JavAvalia.AS_BancodeDados.Controller;

import com.JavAvalia.AS_BancodeDados.Model.Avaliacoes;
import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import com.JavAvalia.AS_BancodeDados.Service.AvaliacoesService;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/avaliacoes")
public class AvaliacoesController {
    private AvaliacoesService avaliacoesService;
    public AvaliacoesController(AvaliacoesService avaliacoesService) {
        this.avaliacoesService = avaliacoesService;
    }
    @PostMapping
    public ResponseEntity<Avaliacoes> criarAvaliacao(@RequestBody Avaliacoes avaliacaoRequest) {
        Avaliacoes avaliacoes = this.avaliacoesService.save(avaliacaoRequest);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(avaliacoes.getId()).toUri();
        return ResponseEntity.created(uri).body(avaliacoes);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Avaliacoes> listarAvaliacoesPorId(@PathVariable ObjectId id) {
        return avaliacoesService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public ResponseEntity<List<Avaliacoes>> listarAvaliacoes() {
        return ResponseEntity.ok().body(avaliacoesService.findAll());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAvaliacao(@PathVariable ObjectId id) {
        boolean existe = avaliacoesService.findById(id).isPresent();

        if (!existe) {
            return ResponseEntity.notFound().build();
        }

        avaliacoesService.deleteById(id);
        return ResponseEntity.noContent().build(); // HTTP 204
    }
}
