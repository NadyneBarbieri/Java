package br.com.nadyne.produtos;

import br.com.nadyne.produtos.model.Categoria;
import br.com.nadyne.produtos.model.Produto;
import br.com.nadyne.produtos.model.repositorio.ColecaoCategoriaRepositorio;
import br.com.nadyne.produtos.model.repositorio.ColecaoProdutoRepositorio;
import br.com.nadyne.produtos.view.CategoriaView;
import br.com.nadyne.produtos.view.Opcao;
import br.com.nadyne.produtos.view.OpcaoView;
import br.com.nadyne.produtos.view.ProdutoView;

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
                case consultarPRODUTOID -> consultarProduto();
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

    private static void alterarProduto(){

    }

    private static void consultarProduto(){

    }

    private static void consultarProdutoPorCategoria(){

    }

    private static void encerrarSistema(){
        System.exit(0);
    }
}