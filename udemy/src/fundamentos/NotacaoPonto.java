package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		/*
		 * Quando se coloca o ponto temos acesso a tudo aquilo que pertence ao objeto
		 * no caso da String utilizado abaixo.
		 * 
		 * Replace substitui o ponto de ? por Bia
		 * 
		 * Concat concatena na frase
		 * 
		 * toUpperCase(), .replace(), .concat() s�o comportamentos
		 * 
		 * Dados vem sem par�nteses
		 * 
		 * Comportamento vem com par�nteses
		 */
		
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		
		System.out.println(s);
		
	}
}
