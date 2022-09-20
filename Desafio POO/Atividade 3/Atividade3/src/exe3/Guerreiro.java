package exe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Guerreiro extends Personagem{
private List<String>Habilidade;
	
	public List<String> getHabilidade() {
		return Habilidade;
	}
	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}

	Scanner entrada = new Scanner(System.in);
	
	@Override
	public void lvlUp() {
		if (this.isGuerreiro()== true) {
			setXp(getXp()+500);
		if (getXp() == 1000) {
			setXp(0);
			setLevel(getLevel()+1);
			setMana(getMana()+5);
			setInteligencia(getInteligencia()+5);
			setForca(getForca()+10);
			setVida(getVida()+10);
			
			System.out.println("Seu Personagem subiu de Nível!!");
			System.out.println("Nome: " + getNome());
			System.out.println("Nivel atual: " + getLevel());
			System.out.println("Força atual: " + getForca());
			System.out.println("Vida atual: " + getVida());
			System.out.println("Inteligência atual: " + getInteligencia());
			System.out.println("Mana atual: " + getMana());
			
			AprenderHablidade();
		}
		
		System.out.println("O personagem " + getNome() + "recebeu 500 de XP");
	}
		super.lvlUp();
	}
	
	
	public void attack() {
		Random aleatorio = new Random();
		System.out.println("Ataque: " + aleatorio.nextInt(getForca()*getLevel() + 300)+ 0);
	}
	
	public void AprenderHablidade() {
		if (isGuerreiro() == true) {
		
		ArrayList<String>Habilidade = new ArrayList<>();
		
		
		System.out.println("Qual habilidade deseja aprender? ");
		System.out.println("1 - Espada");
		System.out.println("2 - Lança");
		System.out.println("3 - Espadão");
		System.out.println("4 - Arqueiro");
		System.out.println("5 - Escudo");
		System.out.println("6 - Kunai");
		System.out.println("7 - Shuriken");
		
		int addHabilidade = entrada.nextInt();
		
		if (addHabilidade == 1 ) {
			if (Habilidade.contains("Espada")== false){
				System.out.print("Habilidade adicionada.");
				Habilidade.add("Espada");
			}System.out.print("Habilidade já aprendida.");
			
			
		}if (addHabilidade == 2 ) {
			if (Habilidade.contains("Lança")== false) {
				Habilidade.add("Lança");
			System.out.print("Habilidade adicionada.");
			}System.out.print("Habilidade já aprendida.");
			
		}if (addHabilidade == 3 ) {
			if (Habilidade.contains("Espadão")== false) {
				Habilidade.add("Espadão");
				System.out.print("Habilidade adicionada.");	
			}System.out.print("Habilidade já aprendida.");
			
		}if (addHabilidade == 4 ) {
			if (Habilidade.contains("Arqueiro")== false) {
				Habilidade.add("Arqueiro");
			 System.out.print("Habilidade adicionada.");
			}System.out.print("Habilidade já aprendida.");
			
		}if (addHabilidade == 5 ) {
			if (Habilidade.contains("Escudo")== false) {
				Habilidade.add("Escudo");
				System.out.print("Habilidade adicionada.");
			}System.out.print("Habilidade já aprendida.");
			
		}if (addHabilidade == 6 ) {
			if (Habilidade.contains("Kunai")== false) {
				Habilidade.add("Kunai");
				System.out.print("Habilidade adicionada.");
			}System.out.print("Habilidade já aprendida.");
			
			
		}if (addHabilidade == 7 ) {
			if (Habilidade.contains("Shuriken")== false) {
				Habilidade.add("Shuriken");
				System.out.print("Habilidade adicionada.");
			}System.out.print("Habilidade já aprendida.");
			
		} else {
			System.out.println("Valor Incorreto!");
		}
    	} 	
	}
}
