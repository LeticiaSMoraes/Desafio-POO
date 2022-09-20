package controleCarro;
public class controleCarro {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo("Volkswagen","Brasilia","EVA-0123",
				"Amarelo", 0, 15000d, 10, 0, false);
		System.out.println("INFORMAÇÕES DO VEÍCULO:");
		System.out.println("-----------------------");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Placa: " + v1.getPlaca());
		System.out.println("Cor: " + v1.getCor());
		System.out.println("Preço: " + v1.getPreco());
		System.out.println("-----------------------");
		
		
		v1.ligar();
		v1.ligar();
		v1.acelerar();
		v1.acelerar();
	//	v1.frear();
		//v1.abastecer();
		v1.pintar();
		//v1.desligar();
		
		System.out.println("INFORMAÇÕES DO VEÍCULO:");
		System.out.println("-----------------------");
		System.out.println("Marca: " + v1.getMarca());
		System.out.println("Modelo: " + v1.getModelo());
		System.out.println("Placa: " + v1.getPlaca());
		System.out.println("Cor: " + v1.getCor());
		System.out.println("Preço: " + v1.getPreco());
		System.out.println("Distância Percorrida: " + v1.getKm());
		System.out.println("Velocidade máxima atingida: " + v1.getVelocidade()+ " Km/h");
		System.out.println("Litros no Tanque: " + v1.getLitrosCombustivel() + " Litros");
		System.out.println("-----------------------");
		
	}
}
