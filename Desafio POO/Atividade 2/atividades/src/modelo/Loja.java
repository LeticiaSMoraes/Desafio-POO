package modelo;

import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro>livros;
	private List<videogame>videoGames;
	
	
	public Loja() {
		super();
	}


	public Loja(String nome, String cnpj, List<Livro> livros, List<videogame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


	public List<videogame> getVideoGames() {
		return videoGames;
	}
	public void setVideoGames(List<videogame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		
		if (livros.size() !=0) {
			for (int i = 0; i < livros.size();) {
				System.out.println("Tipo do produto: Livro");
				System.out.println("Nome: " + livros.get(i).getNome());
				System.out.println("Autor: " + livros.get(i).getAutor());
				System.out.println("Preço: " + livros.get(i).getPreco());
				System.out.println("Tema: " + livros.get(i).getTema());
				System.out.println("Quantidade: " + livros.get(i).getQtd());
				System.out.println("Quantidade de páginas: " +livros.get(i).getQtdPag());
				System.out.println("------------------------------------------");
				System.out.println("");
				
				i++;}
		}else {
			System.out.println("A loja não tem livros em seu estoque.");
			System.out.println("------------------------------------------");
			System.out.println("");
			}
		}
		

	
	public void listaVideoGames() {
		
		if (videoGames.size() != 0) {
			
			for (int i = 0; i < videoGames.size();) {
				System.out.println("Tipo do Produto: Video Game");
				System.out.println("Nome: " + videoGames.get(i).getNome());
				System.out.println("Marca: " + videoGames.get(i).getMarca());
				System.out.println("Modelo: " + videoGames.get(i).getModelo());
				System.out.println("Preço: " + videoGames.get(i).getPreco());
				System.out.println("Quantidade: " + videoGames.get(i).getQtd());
				System.out.println("É usado? " +videoGames.get(i).isUsado());
				System.out.println("------------------------------------------");
				System.out.println("");
				
				i++;
			}
		}else {
			System.out.println("A loja não tem video games em seu estoque.");
			System.out.println("------------------------------------------");
			System.out.println("");
		}
	}
	
	public void calculapatrimônio() {
		double patrimonio_livro = 0;
		double patrimonio_videogame = 0;
		double patrimonio_loja = 0;
		
		for (int i = 0; i< livros.size();) {
			patrimonio_livro = patrimonio_livro  + livros.get(i).getPreco() *livros.get(i).getQtd();
			i++;
		}
		for (int i = 0; i< videoGames.size();) {
			patrimonio_videogame = patrimonio_videogame  + videoGames.get(i).getPreco() *videoGames.get(i).getQtd();
			i++;
		}
		System.out.println("Patrimônio Livro: R$ " + patrimonio_livro);
		System.out.println("Patrimônio Video Game: R$ " + patrimonio_videogame);
		patrimonio_loja = patrimonio_livro + patrimonio_videogame;
		
		System.out.println("Patromônio total da loja: R$ " + patrimonio_loja);
		System.out.println("------------------------------------------");
		System.out.println("");
	}
}
