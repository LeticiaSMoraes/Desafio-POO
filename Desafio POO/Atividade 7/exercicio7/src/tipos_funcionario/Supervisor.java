package tipos_funcionario;

public class Supervisor extends funcionario{


	public Supervisor() {
		super();
	}

	@Override
	public double bonificacao(double valor) {
		// TODO Auto-generated method stub
		setSalario(getSalario()+10000);
		System.out.print(getSalario());
		return super.bonificacao(valor);
	}
	
	
}
