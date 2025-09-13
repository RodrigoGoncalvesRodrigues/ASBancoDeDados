package com.JavAvalia.AS_BancodeDados.Service;

import com.JavAvalia.AS_BancodeDados.Model.Avaliacoes;
import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import com.JavAvalia.AS_BancodeDados.Repository.AvaliacoesRepository;
import com.JavAvalia.AS_BancodeDados.Repository.CategoriasRepository;
import com.JavAvalia.AS_BancodeDados.Repository.UsuariosRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AvaliacoesService {
    private AvaliacoesRepository avaliacoesRepository;

    public AvaliacoesService(AvaliacoesRepository avaliacoesRepository) {
        this.avaliacoesRepository = avaliacoesRepository;
    }

    public Avaliacoes save(Avaliacoes avaliacoes) {
        return this.avaliacoesRepository.save(avaliacoes);
    }

    public List<Avaliacoes> findAll() {
        return this.avaliacoesRepository.findAll();
    }

    public Optional<Avaliacoes> findById(ObjectId id) {
        return this.avaliacoesRepository.findById(id);
    }

    public void deleteById(ObjectId id) {
        avaliacoesRepository.deleteById(id);
    }

}
