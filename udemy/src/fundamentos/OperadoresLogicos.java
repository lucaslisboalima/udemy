package fundamentos;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean executouTrabalho1 = false;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete = executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50 = executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32 = executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Sorvete " + comprouSorvete);
		System.out.println("Tv 50 " + comprouTv50);
		System.out.println("Tv 32 " + comprouTv32);
		
		//Operador un�rio instruso
		System.out.println("Fome " + !comprouSorvete);
		
	}

}
