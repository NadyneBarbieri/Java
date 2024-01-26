package br.com.nadyne.produtos.model;

import java.util.Objects;

public class Categoria {
    private Long id;
    private String nome;

    public Categoria() {
    }

    public Categoria(Long id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    public Categoria(String nome) {
        this.setNome(nome);
    }

    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria categoria)) return false;
        return Objects.equals(getId(), categoria.getId()) && Objects.equals(getNome(), categoria.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
