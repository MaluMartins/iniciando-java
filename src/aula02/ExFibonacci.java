package aula02;

import java.util.Scanner;

public class ExFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("FIBONACCI");
		System.out.print("Digite a posição que deseja obter: ");
        int n = sc.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        
        for (int i = 0; i < n; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
        }
        System.out.println(num1);
	}
}
