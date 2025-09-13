package com.JavAvalia.AS_BancodeDados.Repository;

import com.JavAvalia.AS_BancodeDados.Model.Categorias;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriasRepository extends MongoRepository<Categorias, ObjectId> {
}
