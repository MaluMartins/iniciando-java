package Aula03;

import java.util.Scanner;

public class ExTabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a tabuada que deseja encontrar: ");
        int tab = sc.nextInt();
        
        int i = 0;
        while (i <= 10) {
            int res = tab * i;
            
            System.out.println(tab+"*"+i+" = "+res);
            
            i++;
        }
	}

}
