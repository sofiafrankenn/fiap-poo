// PASSAGEIRO
//
//package br.com.fiapride.main;
//
//import br.com.fiapride.model.Passageiro;
//
//public class SistemaPrincipal {
//
//	public static void main(String[] args) {
//		Passageiro passageiro1 = new Passageiro();
//		passageiro1.nome = "Ana Silva";
//		passageiro1.saldo = 50.0;
//		
//		
//		Passageiro passageiro2 = new Passageiro();
//		passageiro2.nome = "Carlos Souza";
//		passageiro2.saldo = 12.50;
//		
//		
//		System.out.println("--- Sistema Fiapride ---");
//		System.out.println("Passageiro: " + passageiro1.nome + "| Saldo: R$" + passageiro1.saldo);
//		System.out.println("Passageiro: " + passageiro2.nome + "| Saldo: R$" + passageiro2.saldo);
//
//	}
//
//}

/*
 * PASSAGEIRO 2.0
 * 
 * package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
        System.out.println("Regarga passageiro 1");
        passageiro1.adicionarSaldo(50.0);

        // Criando o segundo passageiro (Objeto 2)
        Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
        System.out.println("Regarga passageiro 2");
        passageiro2.adicionarSaldo(12.5);

        System.out.println("--- Sistema FiapRide ---");
        System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
        System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
        
        System.out.println("Pagando viagem do passageiro 1");
        passageiro1.pagarViagem(20);
        System.out.println("Pagando viagem do passageiro 2");
        passageiro2.pagarViagem(20);

    }
}
 */

package br.com.fiapride.main;

import br.com.fiapride.model.Camiseta;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Camiseta camiseta1 = new Camiseta("Azul", "Polo", "Algodão");
        System.out.println("Adicionando estoque camiseta 1");
        camiseta1.adicionarEstoque(10);

        Camiseta camiseta2 = new Camiseta("Verde", "Social", "Linho");
        System.out.println("Adicionando estoque camiseta 2");
        camiseta2.adicionarEstoque(3);

        System.out.println("--- Sistema Loja ---");
        System.out.println("Camiseta: " + camiseta1.cor + 
                           " | Tipo: " + camiseta1.tipo + 
                           " | Material: " + camiseta1.material + 
                           " | Estoque: " + camiseta1.estoque);

        System.out.println("Camiseta: " + camiseta2.cor + 
                           " | Tipo: " + camiseta2.tipo + 
                           " | Material: " + camiseta2.material + 
                           " | Estoque: " + camiseta2.estoque);

        System.out.println("Vendendo 2 camisetas da camiseta 1");
        camiseta1.venderCamiseta(2);

        System.out.println("Vendendo 5 camisetas da camiseta 2");
        camiseta2.venderCamiseta(5);

        System.out.println("--- Após vendas ---");
        System.out.println("Camiseta: " + camiseta1.cor + 
                           " | Estoque: " + camiseta1.estoque);

        System.out.println("Camiseta: " + camiseta2.cor + 
                           " | Estoque: " + camiseta2.estoque);
    }
}