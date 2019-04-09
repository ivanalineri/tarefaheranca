package br.com.digitalhouse;

public class TestaCadastro {

    public static void main(String[] args) {
        Data data = new Data(12,02,2010);
        Data data2 = new Data(25,12,2003);
        Data data3 = new Data(13,02,2017);
        Cliente cliente = new Cliente("Sergio", data,12);
        Funcionario funcionario = new Funcionario("Adriana", data2, 2500);
        Gerente gerente = new Gerente("Cristian",data3,5500,"Marketing");


    }
}
