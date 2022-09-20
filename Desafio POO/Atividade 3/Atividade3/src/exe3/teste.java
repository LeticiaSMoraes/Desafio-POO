package exe3;



public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personagem p1 = new Personagem("Yae Miko", 300, 350, 45 , 32, 0.0f, 0, false, true ) {
		};
		Personagem p2 = new Personagem(" Xiao", 320, 270, 42, 47, 0.0f, 0 , true, false ) {
		};
		
		p1.lvlUp();
		p2.lvlUp();
		
		//p1.attack();
		//p2.attack();
		
		//p1.AprenderMagia();
		//p2.AprenderHabilidade();
	}

}
