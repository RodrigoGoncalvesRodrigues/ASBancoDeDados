package com.JavAvalia.AS_BancodeDados.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Document(collection = "usuarios")
public class Usuarios {
    @Id
    private ObjectId id;
    private String nome;
    private String email;

    public Usuarios() {
    }

    public Usuarios(ObjectId id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
