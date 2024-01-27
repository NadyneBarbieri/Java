package br.com.nadyne.produtos.view;

import br.com.nadyne.produtos.model.Categoria;
import br.com.nadyne.produtos.model.repositorio.ColecaoCategoriaRepositorio;

import javax.swing.*;

public class CategoriaView {
    static ColecaoCategoriaRepositorio repositorio;

    public static Categoria select(Categoria categoria) {

        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null, // componente pai. como não temos será null
                "Selecione uma categoria",
                "menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                repositorio.findAll().toArray(), // número da opção
                categoria == null ? 1 : categoria);
        return ret;
    }

    public void sucesso() {
        JOptionPane.showMessageDialog(null, "Categoria salva com sucesso!");
    }
    public void sucesso(Categoria categoria) {
        System.out.println(categoria);
        JOptionPane.showMessageDialog(null, "Categoria " + categoria.getNome().toUpperCase() + " salva com sucesso!");
    }

    public static Categoria form() {
        String nome = JOptionPane.showInputDialog("Informe o nome da Categoria");
        return new Categoria(nome);
    }
}
