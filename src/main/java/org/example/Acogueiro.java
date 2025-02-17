package org.example;

public class Acogueiro extends Funcionario {
    public Acogueiro(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirDados() {
        System.out.println("Dados do açogueiro: ");
        super.exibirDados();
    }
}
