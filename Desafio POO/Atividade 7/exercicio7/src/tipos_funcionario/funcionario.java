package tipos_funcionario;

public abstract class funcionario  {

	private String nome;
	private int idade;
	private double salario;
	private boolean gerente;
	private boolean supervisor;
	private boolean vendedor;
	
	
	public funcionario() {
		super();
	}


	

	public funcionario(String nome, int idade, double salario, boolean gerente, boolean supervisor, boolean vendedor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.gerente = gerente;
		this.supervisor = supervisor;
		this.vendedor = vendedor;
		
	}




	public double bonificacao(double valor) {
		return salario + valor;
		
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isGerente() {
		return gerente;
	}


	public void setGerente(boolean gerente) {
		this.gerente = gerente;
	}


	public boolean isSupervisor() {
		return supervisor;
	}


	public void setSupervisor(boolean supervisor) {
		this.supervisor = supervisor;
	}

	public boolean isVendedor() {
		return vendedor;
	}
	public void setVendedor(boolean vendedor) {
		this.vendedor = vendedor;
	}
	
	
}
