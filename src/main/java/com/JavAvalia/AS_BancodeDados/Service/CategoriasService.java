package com.JavAvalia.AS_BancodeDados.Service;

import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import com.JavAvalia.AS_BancodeDados.Model.Usuarios;
import com.JavAvalia.AS_BancodeDados.Repository.CategoriasRepository;
import com.JavAvalia.AS_BancodeDados.Repository.UsuariosRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoriasService {
    private CategoriasRepository categoriasRepository;

    public CategoriasService(CategoriasRepository categoriasRepository) {
        this.categoriasRepository = categoriasRepository;
    }

    public Categorias save(Categorias categorias) {
        return this.categoriasRepository.save(categorias);
    }

    public List<Categorias> findAll() {
        return this.categoriasRepository.findAll();
    }

    public Optional<Categorias> findById(ObjectId id) {
        return this.categoriasRepository.findById(id);
    }

    public void deleteById(ObjectId id) {
        categoriasRepository.deleteById(id);
    }


}
