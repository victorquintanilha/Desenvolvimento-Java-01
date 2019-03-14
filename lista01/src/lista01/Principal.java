package lista01;

/**
 * A classe Principal do sistema.
 * 
 * @author 1829203
 * @version 1.0
 * @since 28/02/2019
 *
 */
public class Principal {
	
	/**
	 * Fun��o para iniciar o programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] opcoes = {"En�simo termo PA",
						   "Dist�ncia entre pontos",
						   "M�dia aritm�tica",
						   "M�dia ponderada",
						   "M�dia harm�nica",
						   "Convers�o de temperaturas",
						   "Volume de um cilindro",
						   "Consumo",
						   "Porcentagem"};
		boolean continua = true;
		do {
			int opcao = Console.mostrarMenu(opcoes, "Lista 01", null);
			switch (opcao) {
			case 1:
				calcularEnesimoTermoPA();
				break;
				
			case 2:
				calcularEnesimoTermoPA();
				break;
				
			case 3:
				calcularMediaAritmeticaAluno();
				break;
				
			case 4:
				calcularMediaPonderadaAluno();
				break;
				
			case 5:
				calcularMediaHarmonica();
				break;
				
			case 6:
				converterDeCelsiusParaFahrenheit();
				break;
				
			case 7:
				calcularVolumeCilindro();
				break;
				
			case 8:
				calcularLitrosViagem();
				break;
				
			case 9:
				calcularPorcentagem();
				break;
				
			case -1:
				continua = false;
				break;
			}
		} while (continua);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo do en�simo termo da PA.
	 */
	public static void calcularEnesimoTermoPA() {
		// Pega as vari�veis do teclado
		int a1 = Console.recuperaInteiro("Digite o termo a1:");
		int n = Console.recuperaInteiro("Digite o n:");
		int r = Console.recuperaInteiro("Digite a raz�o:");

		// Executa a conta
		int an = Exercicios.calcularEnesimoTermoPA(a1, n, r);

		// Mostra o resultado na tela
		System.out.println("O resultado �: " + an);
	}
	
	/**
	 * Faz a execu��o de tela da dist�ncia entre pontos.
	 */
	public static void calcularDistanciaEntrePontos() {
		// Pega os pontos do teclado
		double x1 = Console.recuperaDecimal("A coordenada X do ponto 1:");
		double y1 = Console.recuperaDecimal("A coordenada Y do ponto 1:");
		double x2 = Console.recuperaDecimal("A coordenada X do ponto 2:");
		double y2 = Console.recuperaDecimal("A coordenada Y do ponto 2:");
		
		// Executa a conta
		double distancia = Exercicios.calcularDistanciaEntrePontos(x1, y1, x2, y2);
		
		// Mostra o resultado na tela
		//System.out.println("A dist�ncia �: " + distancia);
		System.out.printf("A dist�ncia �: %.4f", distancia);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo da m�dia aritm�tica de 3 notas.
	 */
	public static void calcularMediaAritmeticaAluno() {
		// Pega as 3 notas do teclado
		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		// Executa a conta
		double mediaAritmetica = Exercicios.calcularMediaAritmeticaAluno(n1, n2, n3);
		
		// Mostra o resultado na tela
		//System.out.println("O resultado �: " + String.format("%.2f", mediaAritmetica));
		System.out.printf("O resultado �: %.2f", mediaAritmetica);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo da m�dia ponderada de 3 notas.
	 */
	public static void calcularMediaPonderadaAluno() {
		// Pega as 3 notas e os 3 pesos do teclado
		double n1 = Console.recuperaDecimal("Digite a primeira nota:");
		double n2 = Console.recuperaDecimal("Digite a segunda nota:");
		double n3 = Console.recuperaDecimal("Digite a terceira nota:");
		int peso1 = Console.recuperaInteiro("Digite o peso da 1� nota:");
		int peso2 = Console.recuperaInteiro("Digite o peso da 2� nota:");
		int peso3 = Console.recuperaInteiro("Digite o peso da 3� nota:");
		
		// Executa a conta
		double mediaPonderada = Exercicios.calcularMediaPonderadaAluno(n1, n2, n3, peso1, peso2, peso3);
		
		// Mostra o resultado na tela
		System.out.printf("O resultado �: %.2f", mediaPonderada);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo da m�dia harm�nica.
	 */
	public static void calcularMediaHarmonica() {
		// Pega as 3 notas do teclado
		double nota1 = Console.recuperaDecimal("Digite a primeira nota:");
		double nota2 = Console.recuperaDecimal("Digite a segunda nota:");
		double nota3 = Console.recuperaDecimal("Digite a terceira nota:");
		
		// Executa a conta
		double mediaHarmonica = Exercicios.calcularMediaHarmonica(nota1, nota2, nota3);
		
		// Mostra o resultado na tela
		System.out.printf("O resultado �: %.2f", mediaHarmonica);
	}
	
	/**
	 * Faz a execu��o de tela da convers�o de uma temperatura de Celsius para Fahrenheit.
	 */
	public static void converterDeCelsiusParaFahrenheit() {
		// Pega a temperatura em Celsius do teclado
		double c = Console.recuperaDecimal("Digite uma temperatura em Celsius:");
		
		// Executa a convers�o
		double conversaoCelsiusParaFahrenheit = Exercicios.converterDeCelsiusParaFahrenheit(c);
		
		// Mostra o resultado da convers�o na tela.
		System.out.printf("A temperatura em Fahrenheit �: %.2f", conversaoCelsiusParaFahrenheit);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo do volume de um cilindro.
	 */
	public static void calcularVolumeCilindro() {
		// Pega o raio e altura do teclado
		double raio = Console.recuperaDecimal("Digite o raio do cilindro:");
		double altura = Console.recuperaDecimal("Digite a altura do cilindro:");
		
		// Executa o c�lculo
		double volumeCilindro = Exercicios.calcularVolumeCilindro(raio, altura);
		
		// Mostra o resultado do c�lculo na tela
		System.out.printf("O volume do cilindro �: %.2f", volumeCilindro);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo de consumo de uma viagem.
	 */
	public static void calcularLitrosViagem() {
		// Pega o tempo e velocidade m�dia do teclado
		double tempo = Console.recuperaDecimal("Digite o tempo da viagem em horas:");
		double velocidade = Console.recuperaDecimal("Digite a velocidade m�dia em km/h:");
		
		// Executa o c�lculo
		double litrosViagem = Exercicios.calcularLitrosViagem(tempo, velocidade);
		
		// Mostra o resultado do c�lculo na tela
		System.out.printf("O consumo da viagem foi: %.2f", litrosViagem);
	}
	
	/**
	 * Faz a execu��o de tela do c�lculo de porcentagem.
	 */
	public static void calcularPorcentagem() {
		// Pega o valor inicial e a porcentagem do teclado
		double valor = Console.recuperaDecimal("Digite o valor inicial:");
		double porcentagem = Console.recuperaDecimal("Digite a porcentagem:");
		
		// Executa o c�lculo
		double resultadoPorcentagem = Exercicios.calcularPorcentagem(valor, porcentagem);
		
		// Mostra o resultado do c�lculo na tela
		System.out.printf("Resultado: %.2f", resultadoPorcentagem);
	}
	
}