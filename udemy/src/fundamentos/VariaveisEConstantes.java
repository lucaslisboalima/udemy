package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		
		/*
		 * Quando se coloca o final � uma constante e
		 * por padr�o da conven��o a constante dever� come�ar com letra mai�scula
		 */
		
		final double PI = 3.1416;
		double raio = 4.5;
		double area = PI * (raio * raio);
		
		System.out.println("�rea �: " + area + " m�.");
		
		//Usando printf para formata��o
		System.out.printf("�rea �: %f m�.\n", area); 
		System.out.printf("�rea �: %.2f m�.", area); 
			
	}

}
