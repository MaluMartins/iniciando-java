package aula02;

import java.util.Scanner;

public class ExPesoIdeal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PESO IDEAL");
        System.out.print("Digite o sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Digite a altura: ");
        double h = sc.nextDouble();
        
        sc.nextLine();
        
        if ("F".equalsIgnoreCase(sexo)) {
            double pIdeal = (72.7*h)-58;
            System.out.println("O peso ideal é: "+pIdeal);
        } else {
            double pIdeal = (62.1*h)-44.7;
            System.out.println("O peso ideal é: "+pIdeal);
        }
        
	}
}
