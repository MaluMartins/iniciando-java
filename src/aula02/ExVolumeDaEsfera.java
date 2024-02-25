package aula02;

import java.util.Scanner;

public class ExVolumeDaEsfera {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("VOLUME DA ESFERA");
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double volume = 4*(3.14*(Math.pow(raio, 3)))/3;
        System.out.println("O volume da esfera é "+volume);
	}
}
