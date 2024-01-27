package br.com.nadyne.produtos;

import br.com.nadyne.produtos.model.Categoria;
import br.com.nadyne.produtos.model.Produto;
import br.com.nadyne.produtos.model.repositorio.ColecaoCategoriaRepositorio;
import br.com.nadyne.produtos.model.repositorio.ColecaoProdutoRepositorio;
import br.com.nadyne.produtos.view.CategoriaView;
import br.com.nadyne.produtos.view.Opcao;
import br.com.nadyne.produtos.view.OpcaoView;
import br.com.nadyne.produtos.view.ProdutoView;

import javax.swing.*;
import java.util.List;

import static br.com.nadyne.produtos.view.CategoriaView.form;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Opcao opcao = null;

        do{
            opcao = OpcaoView.select();
            switch (opcao){
                case cadastrarCATEGORIA ->  cadastrarCategoria();
                case cadastrarPRODUTO -> cadastrarProduto();
                case alterarPRODUTO -> alterarProduto();
                case consultarPRODUTOID -> consultarProdutoPorID();
                case consultarPRODUTOPORCATEGORIA -> consultarProdutoPorCategoria();
                case encerrarSISTEMA -> encerrarSistema();
            }
        }while (opcao != Opcao.encerrarSISTEMA);
        


//        Categoria categoria = new Categoria();
//        categoria.setNome("Informática");
//
//        Categoria categoriaSalva = ColecaoCategoriaRepositorio.save(categoria);
//        System.out.println("Categoria: "+ categoriaSalva);

//        Produto produto = new Produto();
//        produto
//                .setNome("Kindle")
//                .setDescricao("e-reader")
//                .setData(LocalDateTime.now())
//                .setPreco(BigDecimal.valueOf(1000));
//
//       Produto produto1 = ColecaoProdutoRepositorio.save(produto);
//       System.out.println("ID:" + produto1.getId() + "Nome do produto: " + produto1.getNome());
    }

    private static void consultarProdutoPorID() {
        Long id = 0l;
        do {
            try {
                id = Long.parseLong(JOptionPane.showInputDialog("Informe o id do produto"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Id inválido!");
            }
        } while (id <= 0);

        Produto p = ColecaoProdutoRepositorio.findById(id);
        if (p != null) {
            ProdutoView.show(p);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    private static void alterarProduto() {
        Produto produto = ProdutoView.select();
        ProdutoView.update(produto);
    }

    public static void cadastrarCategoria() {
        CategoriaView view = new CategoriaView();
        Categoria categoria = form(new Categoria());
        ColecaoCategoriaRepositorio.save(categoria);
        CategoriaView Categoriaview;
        view.sucesso(categoria);
    }

    private static void cadastrarProduto(){
        Produto produto = ProdutoView.form(new Produto());
        ColecaoProdutoRepositorio.save(produto);
        ProdutoView.sucesso(produto);
    }

    private static void alterarproduto() {
        Produto produto = ProdutoView.select();
        ProdutoView.update(produto);
    }
    private static void consultarProdutoPorCategoria(){
        Categoria categoria = CategoriaView.select(null);
        List<Produto> produtos = ColecaoProdutoRepositorio.findByIdCategoria(categoria);

        if(produtos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não encontramos produtos com a categoria" + categoria.getNome());
        }else{
            produtos.forEach(ProdutoView::show);
            produtos.forEach(System.out::println);
        }

    }

    private static void encerrarSistema(){
        System.exit(0);
    }
}