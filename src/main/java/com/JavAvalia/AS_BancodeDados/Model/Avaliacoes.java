package com.JavAvalia.AS_BancodeDados.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "avaliacoes")
public class Avaliacoes {
    @Id
    private ObjectId id;
    private ObjectId usuario_id;
    private ObjectId categoria_id;
    private String item_avaliado;
    private Integer nota;
    private String comentario;
    private Date data_avaliacao;
    private Localizacao localizacao;

    public Avaliacoes() {

    }

    public Avaliacoes(ObjectId id, ObjectId usuario_id, ObjectId categoria_id, String item_avaliado, Integer nota, String comentario, Date data_avaliacao, Localizacao localizacao) {
        this.id = id;
        this.usuario_id = usuario_id;
        this.categoria_id = categoria_id;
        this.item_avaliado = item_avaliado;
        this.nota = nota;
        this.comentario = comentario;
        this.data_avaliacao = data_avaliacao;
        this.localizacao = localizacao;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(ObjectId usuario_id) {
        this.usuario_id = usuario_id;
    }

    public ObjectId getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(ObjectId categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getItem_avaliado() {
        return item_avaliado;
    }

    public void setItem_avaliado(String item_avaliado) {
        this.item_avaliado = item_avaliado;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getData_avaliacao() {
        return data_avaliacao;
    }

    public void setData_avaliacao(Date data_avaliacao) {
        this.data_avaliacao = data_avaliacao;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
