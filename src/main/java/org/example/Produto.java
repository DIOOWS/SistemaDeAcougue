package org.example;

public class Produto {

    private String nome;
    private double precoPorKg;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoPorKg() {
        return precoPorKg;
    }

    public void setPrecoPorKg(double precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    public Produto(String nome, double precoPorKg){
     this.nome = nome;
     this.precoPorKg = precoPorKg;

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoPorKg=" + precoPorKg +
                '}';
    }

    public double calacularPreco(double quantidadekg){
        return precoPorKg * quantidadekg;
    }
}
