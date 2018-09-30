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
		 * toUpperCase(), .replace(), .concat() são comportamentos
		 * 
		 * Dados vem sem parênteses
		 * 
		 * Comportamento vem com parênteses
		 */
		
		String s = "Bom dia ?".toUpperCase().replace("?", "Bia").concat("!");
		
		System.out.println(s);
		
	}
}
