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


// CAMISETA

package br.com.fiapride.main;
import br.com.fiapride.model.Camiseta;
public class SistemaPrincipal {
	public static void main(String[] args) {
		Camiseta camiseta1 = new Camiseta();
		camiseta1.cor = "Azul";
		camiseta1.tipo = "Polo";
		camiseta1.material = "Algodão";
		
		Camiseta camiseta2 = new Camiseta();
		camiseta2.cor = "Verde";
		camiseta2.tipo = "Camiseta de Botão";
		camiseta2.material = "Linho";
		
		System.out.println("As caracteristicas da camiseta " + camiseta1.cor + " são: | Tipo: " + camiseta1.tipo + " | Material: " + camiseta1.material);
		System.out.println("As caracteristicas da camiseta " + camiseta2.cor + " são: | Tipo: " + camiseta2.tipo + " | Material: " + camiseta2.material);
	}
}