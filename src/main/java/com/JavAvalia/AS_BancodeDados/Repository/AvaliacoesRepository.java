package com.JavAvalia.AS_BancodeDados.Repository;

import com.JavAvalia.AS_BancodeDados.Model.Avaliacoes;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvaliacoesRepository  extends MongoRepository<Avaliacoes, ObjectId> {
}
