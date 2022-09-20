package tipos_funcionario;

public class Gerente extends funcionario  {
	
	
	@Override
	public double bonificacao(double valor) {
		setSalario(getSalario()+10000);
		System.out.print(getSalario());
		return super.bonificacao(valor);
	}
}
