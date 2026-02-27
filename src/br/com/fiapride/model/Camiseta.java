package br.com.fiapride.model;

public class Camiseta {

    public String cor;
    public String tipo;
    public String material;
    public int estoque;


    public Camiseta(String cor, String tipo, String material) {
        this.cor = cor;
        this.tipo = tipo;
        this.material = material;
        this.estoque = 0;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque adicionado com sucesso!");
        } else {
            System.out.println("Quantidade inválida para estoque.");
        }
    }

    public void venderCamiseta(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
        } else if (estoque >= quantidade) {
            estoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente para venda.");
        }
    }
}