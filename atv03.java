package avFORMATIVA;

import java.util.Scanner;

public class atv03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		double valor1 = scanner.nextDouble();

		System.out.println("Digite o segundo valor:");
		double valor2 = scanner.nextDouble();

		System.out.println("Digite o operador (+, -, *, /):");
		char operador = scanner.next().charAt(0);

		double resultado;

		switch (operador) {
		case '+':
			resultado = valor1 + valor2;
			System.out.println("Resultado: " + resultado);
			break;
		case '-':
			resultado = valor1 - valor2;
			System.out.println("Resultado: " + resultado);
			break;
		case '*':
			resultado = valor1 * valor2;
			System.out.println("Resultado: " + resultado);
			break;
		case '/':
			if (valor2 != 0) {
				resultado = valor1 / valor2;
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Erro: Divisão por zero não é permitida.");
			}
			break;
		default:
			System.out.println("Operador inválido.");
		}

		scanner.close();
	}
}