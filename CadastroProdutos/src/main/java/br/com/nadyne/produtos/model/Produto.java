package br.com.nadyne.produtos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private LocalDateTime data;
    private Categoria categoria;
    public Produto() {
    }

    public Produto(String nome, String descricao, BigDecimal preco, LocalDateTime data, Categoria categoria) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setData(data);
        this.setCategoria(categoria);
    }

    public Produto(Long id, String nome, String descricao, BigDecimal preco, LocalDateTime data, Categoria categoria) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setPreco(preco);
        this.setData(data);
        this.setCategoria(categoria);
    }

    public Long getId() {
        return id;
    }

    public Produto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Produto setPreco(BigDecimal preco) {
        this.preco = preco;
        return this;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Produto setData(LocalDateTime data) {
        this.data = data;
        return this;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Produto setCategoria(Categoria categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getId(), produto.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
