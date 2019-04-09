package br.com.digitalhouse;

public class Funcionario extends Pessoa {

    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float novoSalario) {
        salario = novoSalario;
    }

    @Override
    public void imprimirDados() {

    }

    public void calculaImposto(float novoCalculaImposto){

        novoCalculaImposto = (getSalario()* novoCalculaImposto)/100;
        System.out.println(novoCalculaImposto);

    }

    public Funcionario(String nome, Data data, float salario) {
        super(nome, data);
        this.salario = salario;


    }


}
