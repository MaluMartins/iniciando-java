package aula03;

import java.util.Scanner;

public class ExSomaPares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int somaNum = 0;
        for (int i = 0; i < 20; i++) {
            int num;
            num = sc.nextInt();
            somaNum += num;
        }
        
        System.out.println(somaNum); 
	}
}
