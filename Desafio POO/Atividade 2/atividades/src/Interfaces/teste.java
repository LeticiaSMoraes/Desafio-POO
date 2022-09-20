package Interfaces;

import java.util.ArrayList;
import java.util.List;

import modelo.Livro;
import modelo.Loja;
import modelo.videogame;

public class teste {

	public static void main(String[] args) {
		videogame ps4 = new videogame("PS4", 1800, 100, "Sony", "Slim", false);
		videogame ps4Usado = new videogame("PS4", 1000, 7, "Sony", "Slim", true);
		videogame xbox = new videogame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<videogame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		

		
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("Java POO", 20, 50, "Gft", "Eaducativo", 500);
		
		List<Livro>livros= new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		Loja americanas = new Loja("Americanas", "12345678", livros, games);
		System.out.println();
		
		americanas.listaVideoGames();
		americanas.listaLivros();
		
		americanas.calculapatrimônio();
		
		ps4.calcularImposto();
		ps4Usado.calcularImposto();
		xbox.calcularImposto();
		
		l1.calcularImposto();
		l2.calcularImposto();
		l3.calcularImposto();
	}


}
