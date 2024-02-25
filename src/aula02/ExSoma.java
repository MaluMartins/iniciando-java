package aula02;

import java.util.Scanner;

public class ExSoma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SOMA");
        System.out.print("Digite o valor de A: ");
        int numA = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int numB = sc.nextInt();
        
        int i = numA;
        int soma = 0;
        while (i <= numB) {
            soma = soma + i;
            i++;
        }
        
        System.out.println(soma);
	}
}
