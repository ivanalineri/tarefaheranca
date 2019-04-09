package br.com.digitalhouse;


import java.util.List;

public class CadastroPessoa  {

    private List<Pessoa> list;

    public void setList(List<Pessoa> novaList) {
        list = novaList;
    }

    private int  qtdAtual;

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int novaQtdAtual) {
        qtdAtual = novaQtdAtual +1;

    }

    public void cadastraPessoa(Pessoa pessoa) {


    }

    public void imprimiCadastro() {


    }

}
