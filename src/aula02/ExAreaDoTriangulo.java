package aula02;

import java.util.Scanner;

public class ExAreaDoTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ÁREA DO TRIÂNGULO");
        System.out.print("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        double alturaTri = sc.nextDouble();
        double area = (base*alturaTri)/2;
        System.out.println("A área do triângulo é: "+area);
	}
}
