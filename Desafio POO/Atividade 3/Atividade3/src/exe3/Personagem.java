package exe3;

abstract class Personagem {
	private String nome;
	private int vida;
	private int Mana;
	private int inteligencia;
	private int forca;
	private float xp;
	private int level;
	private boolean isGuerreiro;
	private boolean isMago;

	
	public Personagem() {
		super();
	}

	public Personagem(String nome, int vida, int mana, int inteligencia, int forca, float xp, int level,
			boolean isGuerreiro, boolean isMago) {
		super();
		this.nome = nome;
		this.vida = vida;
		Mana = mana;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.xp = xp;
		this.level = level;
		this.isGuerreiro = isGuerreiro;
		this.isMago = isMago;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public float getXp() {
		return xp;
	}
	public void setXp(float xp) {
		this.xp = xp;
	}

	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getMana() {
		return Mana;
	}
	public void setMana(int mana) {
		Mana = mana;
	}
	public boolean isGuerreiro() {
		return isGuerreiro;
	}
	public void setGuerreiro(boolean isGuerreiro) {
		this.isGuerreiro = isGuerreiro;
	}


	public boolean isMago() {
		return isMago;
	}
	public void setMago(boolean isMago) {
		this.isMago = isMago;
	}

	public void lvlUp() {
		// TODO Auto-generated method stub
		
	}

	
}
