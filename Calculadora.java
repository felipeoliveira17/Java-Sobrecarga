package AtividadeSobrecarga;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
	System.out.println(Operacao.mensagemEstatica());
	// ENTRADA
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite a operação:\n"
						+"1 - Adição de dois valores inteiros\n"
						+"2 - Subtração\n"
						+"3 - Multiplicação\n"
						+"4 - Divisão\n"
						+"5 - Exponenciação\n"
						+"6 - Fatorial\n"
						+"7 - Adição de três valores\n"
						+"8 - Adição de dois valores texto");
	int tipo = teclado.nextInt();
	System.out.println("Digite o valor 1:");
	int valor1 = teclado.nextInt();
	int valor2 = 0;
	if (tipo != 6) {
		System.out.println("Digite o valor 2: ");
		valor2 = teclado.nextInt();
	}
	teclado.close();
	
	// PROCESSAMENTO E SAÍDA
	Operacao operacao = new Operacao();
	
	switch(tipo) {
	// PASSAGEM DE VALORES POR PARAMETROS DA FUNÇÃO DE SAÍDA
	case 1:
		System.out.println("Adição 2 valores inteiros = "+operacao.soma(valor1, valor2));
		break;
	// PASSAGEM DE VALORES POR PARAMETROS DAS FUNÇÕES SET E SAÍDA POR FUNÇÃO DA OPERAÇÃO REFERENTE
	case 2:
		operacao.setMinuendo(valor1);
		operacao.setSubtraendo(valor2);
		System.out.println("Subtração = "+operacao.subtracao());
		break;
	case 3:
		operacao.setNumeroGenerico1(valor1);
		operacao.setNumeroGenerico2(valor2);
		System.out.println("Multiplicação = "+operacao.multiplicacao());
		break;
	case 4:
		operacao.setNumeroGenerico1(valor1);
		operacao.setNumeroGenerico2(valor2);
		System.out.println("Divisão = "+operacao.divisao());
		break;
	case 5:
		operacao.setNumeroGenerico1(valor1);
		operacao.setNumeroGenerico2(valor2);
		System.out.println("Exponenciação = "+operacao.exponenciacao());
		break;
	case 6:
		operacao.setFatorial(valor1);
		System.out.println("Fatorial = "+ operacao.getFatorial());
		break;
	
	// SOBRECARGA SOMA
	case 7:
		System.out.println("Adição de três valores = "+operacao.soma(valor1, valor2, 78));
		break;
	case 8:
		System.out.println("Adição de dois valores = "+operacao.soma(valor1,valor2));
		break;
	default:
		System.out.println("Operação inválida!");
	
	}
	}
}
