package avFORMATIVA;

import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double celsius, fahrenheit; 
		System.out.print("Informe uma temperatura em fahrenheit:");
		fahrenheit = ler.nextDouble();
		celsius = ((fahrenheit-32)*5)/9;
		System.out.println("A temperatura convertida em celsios é: "+celsius);
		ler.close();




	}

}
