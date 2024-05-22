package avFORMATIVA;

import java.util.Random;

public class atv04 {

	public static void main(String[] args) {
        Random random = new Random();
        
        // Apresentando os resultados de 20 números aleatórios de 0 a -100
        System.out.println("Resultados do Jogo de Bingo:");
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(101) * 1; // Gerando números de 0 a -100
            System.out.println("Número " + (i + 1) + ": " + numero);
        }
    }
}