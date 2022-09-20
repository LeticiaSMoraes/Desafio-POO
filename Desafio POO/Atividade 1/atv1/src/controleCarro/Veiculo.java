package controleCarro;
import java.util.Scanner;

public class Veiculo {

	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private Double Preco;
	
	Scanner entrada = new Scanner(System.in);
	
	public void desligar(){
		if (isLigado() == true) {
			isLigado = false;
			System.out.println("O carro foi desligado!");
			System.out.println("----------------------------------");
		}else {
			System.out.print("O carro já está desligado!");
			System.out.println("----------------------------------");
		}
	}
	public void ligar() {
		if (isLigado() == false) {
			isLigado = true;
			System.out.println("O carro foi ligado!");
			if (getLitrosCombustivel() == 0) {
				desligar();
				abastecer();
				ligar();
			}
			litrosCombustivel= litrosCombustivel - 1;
			if (getLitrosCombustivel() < 0) {
				this.setLitrosCombustivel(0);
				if (getLitrosCombustivel() == 0) {
					desligar();
					abastecer();
					ligar();
				}
			}
		}else {
			System.out.println("O carro já está ligado!");
			System.out.println("----------------------------------");
		}
	}
	public void acelerar() {
		if (isLigado() == true) {
			this.setVelocidade(Velocidade + 20);
			this.setKm(Km + 5.0f);
			this.setLitrosCombustivel(litrosCombustivel - 2) ;
			System.out.println("Velocidade atual: " + getVelocidade() + "Km/h");
			System.out.println("----------------------------------");
			System.out.println("Distância percorrida: " + getKm() + "Km");
			System.out.println("----------------------------------");
			if (getLitrosCombustivel() == 0) {
				desligar();
				abastecer();
				ligar();
				
			}if (getLitrosCombustivel() < 0) {
				this.setLitrosCombustivel(0);
				if (getLitrosCombustivel() == 0) {
					desligar();
					abastecer();
					ligar();
				}
			}
		}
	}
	
	public void frear() {
		if((isLigado() == true) && (Velocidade != 0)) {
			this.setVelocidade(Velocidade - 20);
			System.out.println("Velocidade atual: " + getVelocidade() + "Km/h");
			System.out.println("----------------------------------");
		} 
	}
	
	public void abastecer() {

		if (getLitrosCombustivel() < 60) {
			System.out.println("Litros no tanque disponível: "+ litrosCombustivel);
			System.out.println("Limite máximo: 60 Litros");
			System.out.println("Quantos litros deseja abastecer? ");
			
			int litrosdisponiveis;
			litrosdisponiveis = 60 - litrosCombustivel;
			int combustivel = entrada.nextInt();
			litrosCombustivel = litrosCombustivel + combustivel;
			if (litrosCombustivel >60) {
				System.out.println(" Valor máximo que pode abastecer no momento é " + litrosdisponiveis);
				System.out.println("Total do tanque: 60 Litros");
				System.out.println("----------------------------------");
				this.setLitrosCombustivel(60);
			} else {
				System.out.println("Total do tanque: " + litrosCombustivel + " Litros");
				this.setLitrosCombustivel(litrosCombustivel);
				System.out.println("----------------------------------");
			}

			

			
		}
	}
	
	public void pintar() {
		System.out.println("A cor atual do carro é " + getCor());
		System.out.println("Selecione a nova cor do carro: ");
		System.out.println("1 - Rosa");
		System.out.println("2 - Preto");
		System.out.println("3 - Branco");
		System.out.println("4 - Laranja");
		System.out.println("5 - Manter a cor");
		int Mudacor = entrada.nextInt();
		
		if (Mudacor == 1) {
			System.out.println("A cor do seu carro mudou!");
			System.out.println("Cor atual: Rosa");
			System.out.println("----------------------------------");
			this.setCor("Rosa");
		} 		if (Mudacor == 2) {
			System.out.println("A cor do seu carro mudou!");
			System.out.println("Cor atual: Preto");
			System.out.println("----------------------------------");
			this.setCor("Preto");
		} 		if (Mudacor == 3) {
			System.out.println("A cor do seu carro mudou!");
			System.out.println("Cor atual: Branco");
			System.out.println("----------------------------------");
			this.setCor("Branco");
		} 		if (Mudacor == 4) {
			System.out.println("A cor do seu carro mudou!");
			System.out.println("Cor atual: Laranja");
			System.out.println("----------------------------------");
			this.setCor("Laranla");
		} 		if (Mudacor == 5) {
			System.out.println("A cor do seu carro se manteve!");
			System.out.println("Cor atual: "+ getCor());
			System.out.println("----------------------------------");

		} 		if (((((Mudacor != 1) && (Mudacor != 2) && (Mudacor != 3) && (Mudacor != 4)&&(Mudacor != 5)))))  {
			System.out.println("Valor incorreto");
			System.out.println("----------------------------------");
		}
		
	}
	
	

	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, Double preco,
			int litrosCombustivel, int velocidade, boolean isLigado) {
		super();
		this.Marca = marca;
		this.Modelo = modelo;
		this.Placa = placa;
		this.Cor = cor;
		this.Km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.Velocidade = velocidade;
		this.Preco = preco;
	}
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	
	
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	
	
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		Km = km;
	}
	
	
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
	
	
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		Preco = preco;
	}
	
	
	
	

}
