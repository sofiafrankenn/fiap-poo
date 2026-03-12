package br.com.CP1_poo.model;
 
public class Veiculos {
	
	private String individuo;
	private String placa;
	private double gas;
	
	public Veiculos(String individuo, String placa) {
		this.individuo = individuo;
		this.placa = placa;
		this.gas = 0; // começa com 0
	}
	
	// adicionando combustivel
	public void adicionar(double v) {
		gas = gas + v;
	
	}
	
	// gastando combustivel
	public void gastar(double v) {
		if (v <= gas) {
			gas = gas - v;
			System.out.println("Viagem realizada com sucesso!");
		} else {
			System.out.println("Erro! gasolina insuficiente.");
			System.out.println("| Saldo: " + gas + " | Tentativa de uso: " + v);
		}
	}
	
	public String getIndividuo() {
		return individuo;
	}
	
	public void setIndividuo(String individuo) {
		this.individuo = individuo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
}