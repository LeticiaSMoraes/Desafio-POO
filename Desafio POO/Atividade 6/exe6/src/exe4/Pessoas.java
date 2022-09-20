package exe4;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Pessoas {

	public static void main(String[] args) {
		cadastro joao = new cadastro("João", 15);
		cadastro leandro = new cadastro("Leandro", 21);
		cadastro paulo = new cadastro("Paulo", 17);
		cadastro jessica = new cadastro("Jessica", 18);

		List <cadastro>Pessoas = new ArrayList<>();
		Pessoas.add(joao);
		Pessoas.add(leandro);
		Pessoas.add(paulo);
		Pessoas.add(jessica);
		
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
				+ "com idade inferior a 18 anos): " + Pessoas.size());
		
		
		//System.out.println(Pessoas.contains());
		
		for (int i = 0; i < Pessoas.size();) {
			
			if (Pessoas.get(i).getNome().equals("Jessica")) {
				System.out.println("Nome Jessica está presente na lista? " + true);
				System.out.println("Idade: " + Pessoas.get(i).getIdade());
			}else {
				System.out.println("Nome Jessica está presente na lista? " + false);
	
			}
			i++;
		}
	}
}
