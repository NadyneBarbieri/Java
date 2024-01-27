package br.com.nadyne.produtos.model.repositorio;
import br.com.nadyne.produtos.model.Categoria;
import br.com.nadyne.produtos.model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class ColecaoProdutoRepositorio {
    private static List<Produto> produtos;

    static {
        produtos = new Vector<>();

        Produto Kindle = new Produto();
        Kindle.setCategoria(ColecaoCategoriaRepositorio.findById(1L))
                .setNome("Kindle")
                .setDescricao("e-reader")
                .setData(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(1000));

    Produto samsung = new Produto();
    samsung.setCategoria(ColecaoCategoriaRepositorio.findById(2L))
            .setNome("galaxy s24+")
            .setDescricao("Aparelho celular de ultima geração da Samsung")
            .setData(LocalDateTime.now())
            .setPreco(BigDecimal.valueOf(9000));
        Arrays.asList(Kindle,samsung).forEach(ColecaoProdutoRepositorio::save);
    }

    public static Produto save(Produto produto){
        if(!produtos.contains(produto)){
            produto.setId((long) produtos.size() + 1);
            produtos.add(produto);
            return produto;
        }else{
            JOptionPane.showMessageDialog(null, "Já existe um produto cadastrado com esse nome");
            return null;
        }
    }

    public static Produto findById(Long id){
        return produtos.stream()
                .filter(p->p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public static List<Produto> findByCategorias(Categoria categoria){
        return produtos.stream()
                .filter(p->p.getCategoria().equals(categoria))
                .toList();
    }

    public static List<Produto> findAll() {
        return produtos;
    }

    public static List<Produto> findByIdCategoria(Categoria categoria) {
        return produtos.stream().filter(p->p.getCategoria().equals(categoria)).toList();

    }
}
