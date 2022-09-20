package modelo;

import Interfaces.Imposto;

abstract class Produto implements Imposto {
	private String nome;
	private double preco;
	private int qtd_p;
	
	
	public Produto(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd_p = qtd;
	}


	public Produto() {
		super();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQtd() {
		return qtd_p;
	}
	public void setQtd(int qtd) {
		this.qtd_p = qtd;
	}
	

}
