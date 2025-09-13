package com.JavAvalia.AS_BancodeDados.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "categorias")
public class Categorias {
    @Id
    private ObjectId id;
    private String nome;
    private String descricao;

    public Categorias() {

    }

    public Categorias(String descricao, String nome, ObjectId id) {
        this.descricao = descricao;
        this.nome = nome;
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
