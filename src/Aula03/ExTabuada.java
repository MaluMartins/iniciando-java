package Aula03;

import java.util.Scanner;

public class ExTabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char continuar = 's';
        
        while (continuar == 's') {
        	System.out.print("Digite a tabuada que deseja encontrar: ");
        	int tab = sc.nextInt();
        	
        	sc.nextLine(); //limpando o buffer
        	
        	for (int i = 0; i <= 10; i++) {
        		int res = tab * i;
                
                System.out.println(tab+"*"+i+" = "+res);
        	}
        	
        	System.out.print("Deseja continuar? ");
        	continuar = sc.next().charAt(0);
        	
        }
	}

}
