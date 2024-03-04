package Aula03;

import java.util.Scanner;
import java.util.Random;

public class ExRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		int numeroAleat = rand.nextInt(101) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Adivinhe um número: ");
			num = sc.nextInt();
			
			if (num < numeroAleat) {
				System.out.println("O número que você digitou é menor que o valor correto");
			} else if (num > numeroAleat) {
				System.out.println("O número que você digitou é maior que o valor correto");
			}
				
		} while(num != numeroAleat);
		
		System.out.println("Parabéns! Você adivinhou");
	}

}
