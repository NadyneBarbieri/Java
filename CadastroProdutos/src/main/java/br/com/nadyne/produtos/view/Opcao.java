package br.com.nadyne.produtos.view;

public enum Opcao {
    cadastrarCATEGORIA(1,"Cadastrar categoria"),
    cadastrarPRODUTO(2,"Cadastrar produto"),
    alterarPRODUTO(3,"Alterar produto"),
    consultarPRODUTOID(4,"Consultar produto por Id"),
    consultarPRODUTOPORCATEGORIA(5,"Consultar produto por categoria"),
    encerrarSISTEMA(6,"Encerrar o sistema");

    int id;
    String nome;

    Opcao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public Opcao setId(int id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Opcao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
