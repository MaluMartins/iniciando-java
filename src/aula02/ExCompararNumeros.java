package aula02;

import java.util.Scanner;

public class ExCompararNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("COMPARAR 2 NÚMEROS");
        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é igual a b");
        }
	}
}
