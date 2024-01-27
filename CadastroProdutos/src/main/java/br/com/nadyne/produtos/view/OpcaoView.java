package br.com.nadyne.produtos.view;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class OpcaoView {

    public static Opcao select() {

        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, // componente pai. Como não temos será null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                Opcao.values(), // Número da opção
                Opcao.cadastrarPRODUTO);

        return ret != null ? ret : Opcao.encerrarSISTEMA;

    }
}