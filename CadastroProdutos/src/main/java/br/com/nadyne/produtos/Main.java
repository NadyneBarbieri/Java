package br.com.nadyne.produtos;

import br.com.nadyne.produtos.model.Categoria;
import br.com.nadyne.produtos.model.Produto;
import br.com.nadyne.produtos.model.repositorio.ColecaoCategoriaRepositorio;
import br.com.nadyne.produtos.model.repositorio.ColecaoProdutoRepositorio;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Categoria categoria = new Categoria();
//        categoria.setNome("Informática");
//
//        Categoria categoriaSalva = ColecaoCategoriaRepositorio.save(categoria);
//        System.out.println("Categoria: "+ categoriaSalva);

        Produto produto = new Produto();
        produto
                .setNome("Kindle")
                .setDescricao("e-reader")
                .setData(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(1000));

       Produto produto1 = ColecaoProdutoRepositorio.save(produto);
       System.out.println("ID:" + produto1.getId() + "Nome do produto: " + produto1.getNome());
    }
}