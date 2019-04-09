package br.com.digitalhouse;

public class Gerente extends Funcionario {


    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
    }

    @Override
    public void calculaImposto(float novoCalculaImposto) {
        super.calculaImposto(novoCalculaImposto);
       novoCalculaImposto = (getSalario()* novoCalculaImposto)/100;
        System.out.println(novoCalculaImposto);
    }

    public Gerente(String nome, Data data, float salario, String area) {
        super(nome, data, salario);
        this.area = area;
    }
}
