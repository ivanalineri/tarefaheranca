package br.com.digitalhouse;


public abstract class Pessoa {
    private String nome;
    private Data nacimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return nacimento;
    }

    public void setData(Data novaData) {
        nacimento = novaData;
    }

    public Pessoa(){

    }

    public Pessoa(String nome, Data data) {
        nome = nome;
        nacimento = data;
    }

    public abstract void imprimirDados();
}
