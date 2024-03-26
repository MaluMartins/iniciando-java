package aula03;

import java.util.Scanner;

public class ExDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		do {
			num = sc.nextInt();
			
			if (num % 2 == 0) {
				soma += num;
			}
			
		} while (num > 0);
		
		System.out.println(soma);
	}

}
