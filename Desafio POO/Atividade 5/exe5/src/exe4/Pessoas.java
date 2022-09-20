package exe4;


import java.util.ArrayList;
import java.util.List;

public class Pessoas {

	public static void main(String[] args) {
		cadastro p1 = new cadastro("João", 15);
		cadastro p2 = new cadastro("Leandro", 21);
		cadastro p3 = new cadastro("Paulo", 17);
		cadastro p4 = new cadastro("Jessica", 18);

		List <cadastro>Pessoas = new ArrayList<>();
		Pessoas.add(p1);
		Pessoas.add(p2);
		Pessoas.add(p3);
		Pessoas.add(p4);
		
		//int maior = 0;
		
		//for (int i = 0; i < Pessoas.size();) {
			//if (Pessoas.get(i).getIdade()> maior)
			// maior = Pessoas.get(i).getIdade();
			// i++;
			//}
		//for (int a = 0; a <Pessoas.size();) {
			//if (maior == Pessoas.get(a).getIdade()) {
				//System.out.println("Nome da Pessoa mais velha: " + Pessoas.get(a).getNome());
				//System.out.println("Idade: " + maior);
			//}
		///a++;
		System.out.println("Quantidade de pessoas na lista: " + Pessoas.size());
		for (int a = 0; a <Pessoas.size();) {
			if (18 > Pessoas.get(a).getIdade()) {
				Pessoas.remove(a);
			}
			
		a++;}
		System.out.println("Quantidade de pessoas na lista "
				+ "com idade inferior s): " + Pessoas.size());
		
	
	}
}
