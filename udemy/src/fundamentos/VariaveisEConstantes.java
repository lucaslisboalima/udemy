package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		
		/*
		 * Quando se coloca o final é uma constante e
		 * por padrão da convenção a constante deverá começar com letra maiúscula
		 */
		
		final double PI = 3.1416;
		double raio = 4.5;
		double area = PI * (raio * raio);
		
		System.out.println("Área é: " + area + " m².");
		
		//Usando printf para formatação
		System.out.printf("Área é: %f m².\n", area); 
		System.out.printf("Área é: %.2f m².", area); 
			
	}

}
