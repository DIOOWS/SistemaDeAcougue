package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List <Produto> produtos = new ArrayList<>();
    private List <Double> quantidades = new ArrayList<>();

    public Pedido(){
        this.produtos = new ArrayList<>();
        this.quantidades = new ArrayList<>();
    }

    public void adicionarProdutos(Produto produto, double quantidadeKg){
        produtos.add(produto);
        quantidades.add(quantidadeKg);
    }

    public double calcularTotal(){
        double total =0;

        for (int i = 0; i<produtos.size(); i++){
            total += produtos.get(i).calacularPreco(quantidades.get(i));
        }
        return total;
    }

    public void exibirPedido(){
        double total = 0;

        for (int i = 0; i<quantidades.size(); i++){
            System.out.println(produtos.get(i).getNome()+" - "
                    + quantidades.get(i)+" Kg - R$ "
                    + produtos.get(i).calacularPreco(quantidades.get(i)));
        }
        System.out.println("Total em: R$ "+ calcularTotal());
    }
}

