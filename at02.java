package avFORMATIVA;

import java.util.Scanner;

public class at02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double area, lado;
		System.out.print("Informe o valor dos lados: ");
		lado = ler.nextDouble();
		area = lado*lado;
		System.out.println("A area deste objeto é: "+area);
		ler.close();



		}

	}
