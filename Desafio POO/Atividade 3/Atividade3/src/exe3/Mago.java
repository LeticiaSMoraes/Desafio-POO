package exe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mago extends Personagem {
	private List<String>Magia;
	
	Scanner entrada = new Scanner(System.in);
	public Mago() {
		super();
	}

	public List<String> getMagia() {
		return Magia;
	}
	public void setMagia(List<String> magia) {
		Magia = magia;
	}
	@Override
	public void lvlUp() {
		if (this.isMago()== true) {
			setXp(getXp()+500);
		if (getXp() == 1000) {
			setXp(0);
			setLevel(getLevel()+1);
			setMana(getMana()+10);
			setInteligencia(getInteligencia()+10);
			setForca(getForca()+5);
			setVida(getVida()+5);
			
			System.out.println("Seu Personagem subiu de Nível!!");
			System.out.println("Nome: " + getNome());
			System.out.println("Nivel atual: " + getLevel());
			System.out.println("Força atual: " + getForca());
			System.out.println("Vida atual: " + getVida());
			System.out.println("Inteligência atual: " + getInteligencia());
			System.out.println("Mana atual: " + getMana());
			
			AprenderMagia();
		}
		
		System.out.println("O personagem " + getNome() + "recebeu 500 de XP");
	}
		super.lvlUp();
	}
	
	public void attack() {
		Random aleatorio = new Random();
		System.out.println("Ataque: " + aleatorio.nextInt(getInteligencia()*getLevel() + 300)+ 0);
	}
	
	public void AprenderMagia() {

		ArrayList<String>Magia = new ArrayList<>();
		
		System.out.println("Qual magia deseja aprender? ");
		System.out.println("1 - Vento");
		System.out.println("2 - Terra");
		System.out.println("3 - Eletricidade");
		System.out.println("4 - Planta");
		System.out.println("5 - Água");
		System.out.println("6 - Fogo");
		System.out.println("7 - Gelo");
		
		int addMagia = entrada.nextInt();
		
		if (addMagia == 1 ) {
			if (Magia.contains("Vento")== false){
				System.out.println("Magia adicionada.");
				Magia.add("Vento");
			}System.out.println("Magia já aprendida.");
			
			
		}if (addMagia == 2 ) {
			if (Magia.contains("terra")== false) {
			Magia.add("terra");
			System.out.println("Magia adicionada.");
			}System.out.println("Magia já aprendida.");
			
		}if (addMagia == 3 ) {
			if (Magia.contains("Eletricidade")== false) {
				Magia.add("Eletricidade");
				System.out.println("Magia adicionada.");	
			}System.out.println("Magia já aprendida.");
			
		}if (addMagia == 4 ) {
			if (Magia.contains("Planta")== false) {
			 Magia.add("Planta");
			 System.out.println("Magia adicionada.");
			}System.out.println("Magia já aprendida.");
			
		}if (addMagia == 5 ) {
			if (Magia.contains("Água")== false) {
				Magia.add("Água");
				System.out.println("Magia adicionada.");
			}System.out.println("Magia já aprendida.");
			
		}if (addMagia == 6 ) {
			if (Magia.contains("Fogo")== false) {
				Magia.add("Fogo");
				System.out.println("Magia adicionada.");
			}System.out.println("Magia já aprendida.");
			
			
		}if (addMagia == 7 ) {
			if (Magia.contains("Gelo")== false) {
				Magia.add("Gelo");
				System.out.println("Magia adicionada.");
			}System.out.println("Magia já aprendida.");
			
		} else {
			System.out.println("Valor Incorreto!");
		}
	
	}
}
