package tipos_funcionario;

public class Vendedor extends funcionario{

	public Vendedor() {
		super();
	}
	
	@Override
	public double bonificacao(double valor) {
		// TODO Auto-generated method stub
		setSalario(getSalario()+3000);
		System.out.print(getSalario());
		return super.bonificacao(valor);
	}
}
