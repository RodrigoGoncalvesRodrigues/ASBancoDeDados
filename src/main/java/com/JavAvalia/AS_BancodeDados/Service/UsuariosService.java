package com.JavAvalia.AS_BancodeDados.Service;

import com.JavAvalia.AS_BancodeDados.Model.Usuarios;
import com.JavAvalia.AS_BancodeDados.Repository.UsuariosRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuariosService {
    private UsuariosRepository usuariosRepository;

    public UsuariosService(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    public Usuarios save(Usuarios usuarios) {
        return this.usuariosRepository.save(usuarios);
    }

    public List<Usuarios> findAll() {
        return this.usuariosRepository.findAll();
    }

    public Optional<Usuarios> findById(ObjectId id) {
        return this.usuariosRepository.findById(id);

    }

    public void deleteById(ObjectId id) {
        usuariosRepository.deleteById(id);
    }
}
