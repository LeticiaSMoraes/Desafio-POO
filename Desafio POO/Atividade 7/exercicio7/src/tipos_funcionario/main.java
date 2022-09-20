package tipos_funcionario;

public class main {

	public static void main(String[] args) {
		
		funcionario f1 = new funcionario("Leticia", 39, 10000d, true, false, false) {
		};
		funcionario f2 = new funcionario("Aline", 32, 5000, false, true, false) {
		};
		funcionario f3 = new funcionario("Lucas", 29, 2500, false, false, true) {
		};
		
		f1.bonificacao(0);
		f2.bonificacao(0);
		f3.bonificacao(0);

	}

}
