package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {	
		
		int resultado = somar(2,5);
		System.out.println("O primeiro resultado é " + resultado);
		
		System.out.println("O primeiro resultado é " + somar(2,9));
		
		falar("Olá Mundo!");
		falar("Hello World");
		
		falar("O primeiro resultado é " + resultado);
		
		ExemploMetodoExterno.mensagem();

	}
	
	// Definição do Método Somar - Método Com Retorno e Com Parametro
	public static int somar(int x, int y) {
		return x + y; // 2 + 5
	}
	
	// Definição do Método Falar - Método Sem Retonro e com Parametro
	public static void falar(String mensagem) {
		System.out.println(mensagem);
	}

}
