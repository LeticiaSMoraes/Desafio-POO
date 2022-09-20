package modelo;

import Interfaces.Imposto;

public class Livro extends Produto implements Imposto{
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	
	public Livro(String nome, double preco, int qtd) {
		super(nome, preco, qtd);
	}


	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}


	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}


	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}


	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (this.getTema()=="Educativo") {
			System.out.println("Tipo do produto: Livro");
			System.out.println("Nome: " + getNome());
			System.out.println("Tema: " + getTema());
			System.out.println("Imposto: R$ " + imposto);
			System.out.println("Livros Educativos não tem imposto.");
			System.out.println("------------------------------------------");
			System.out.println("");
			
		} else { imposto = getPreco()*0.1;
		System.out.println("Tipo do produto: Livro");
		System.out.println("Nome: " + getNome());
		System.out.println("Tema: " + getTema());
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("------------------------------------------");
		System.out.println("");
		}		return 0;
	}



	
	
}
