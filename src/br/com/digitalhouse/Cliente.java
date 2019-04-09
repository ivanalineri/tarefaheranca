package br.com.digitalhouse;

public class Cliente extends Pessoa {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void imprimirDados() {

    }

    public Cliente(String nome, Data nacimento, int codigo) {
        super(nome, nacimento);
        this.codigo = codigo;
    }
}
