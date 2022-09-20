package modelo;

public class videogame extends Produto {
	private String Marca;
	private String Modelo;
	private boolean Usado;
	
	public videogame(String nome, double preco, int qtd) {
		super(nome, preco, qtd);
	}


	public videogame(String nome, double preco, int qtd, String marca, String modelo, boolean usado) {
		super(nome, preco, qtd);
		Marca = marca;
		Modelo = modelo;
		Usado = usado;
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


	public boolean isUsado() {
		return Usado;
	}
	public void setUsado(boolean usado) {
		Usado = usado;
	}


	@Override
	public double calcularImposto() {
		double imposto = 0;
		if (this.isUsado()) {
			imposto = getPreco()*0.25;
			System.out.println("Tipo do produto: Video Game");
			System.out.println("Nome: " + getNome() + " Usado");
			System.out.println("Imposto: R$ " + imposto);
			System.out.println("------------------------------------------");
			System.out.println("");
			
		} else { imposto = getPreco()*0.45;
		System.out.println("Tipo do produto: Video Game");
		System.out.println("Nome: " + getNome() + " Novo");
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("------------------------------------------");
		System.out.println("");
		}
		return 0;
	}

	
	
	
}
