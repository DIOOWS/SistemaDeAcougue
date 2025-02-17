package org.example;

public class Atendente extends  Funcionario {


    public Atendente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDados() {
        System.out.println("Dados do atendente: ");
        super.exibirDados();
    }
}
