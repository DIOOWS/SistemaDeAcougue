package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto picahna = new Produto("Picahna", 79.90);
        Produto costela = new Produto("Costela", 29.90);

        Atendente atendente = new Atendente("Joana", 1000);
        Acogueiro acogueiro = new Acogueiro("Carlos", 2500);

        Pedido pedido = new Pedido();
        pedido.adicionarProdutos(picahna, 1.5);
        pedido.adicionarProdutos(costela, 2.8);

        System.out.println("Dados dos funcionarios");
        atendente.exibirDados();
        acogueiro.exibirDados();

        System.out.println("*-----------------------------------*");

        pedido.exibirPedido();
    }
}