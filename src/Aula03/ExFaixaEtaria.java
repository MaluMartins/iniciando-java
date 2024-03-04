package Aula03;

import java.util.Scanner;

public class ExFaixaEtaria {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double perc1 = 0;
        double perc2 = 0;
        double perc3 = 0;
        double perc4 = 0;
        double perc5 = 0;
        
        for (int i = 0; i<=50; i++) {
            int idade = sc.nextInt();
            
            if (idade <= 15) {
                perc1++;
            } else if (idade > 15 && idade <= 30) {
                perc2++;
            } else if (idade > 30 && idade <= 45) {
                perc3++;
            } else if (idade > 45 && idade <= 60) {
                perc4++;
            }  else {
                perc5++;
            }
        }
        
        double total = (perc1 + perc2 + perc3 + perc4 + perc5);
        
        perc1 = (perc1*100)/total;
        perc2 = (perc2*100)/total;
        perc3 = (perc3*100)/total;
        perc4 = (perc4*100)/total;
        perc5 = (perc5*100)/total;
        
        System.out.println(perc1);
        System.out.println(perc2);
        System.out.println(perc3);
        System.out.println(perc4);
        System.out.println(perc5);
	}
}
