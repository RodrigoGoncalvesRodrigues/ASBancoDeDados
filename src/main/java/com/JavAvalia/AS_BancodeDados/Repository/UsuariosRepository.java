package com.JavAvalia.AS_BancodeDados.Repository;

import com.JavAvalia.AS_BancodeDados.Model.Usuarios;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuariosRepository extends MongoRepository<Usuarios, ObjectId> {
}
