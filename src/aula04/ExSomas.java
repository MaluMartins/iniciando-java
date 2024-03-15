package aula04;

import java.util.Scanner;

public class ExSomas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz: ");
        int k = sc.nextInt();
        int matriz [][] = new int [k][k];
        
        //lendo a matriz
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("a["+(i+1)+", "+(j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        int somaTS = 0;
        int somaTI = 0;
        int somaDP = 0;
        int somaDS = 0;
        
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if(i<j) {
                    somaTS += matriz[i][j];
                } else if (i>j) {
                    somaTI += matriz[i][j];
                } else if (i==j) {
                    somaDP += matriz[i][j];
                } else if ((i+j) == k) {
                    somaDS += matriz[i][j];
                }
            }
        }
        
        System.out.println("A soma do triângulo superior é: "+somaTS);
        System.out.println("A soma do triângulo inferior é: "+somaTI);
        System.out.println("A soma da diagonal principal é: "+somaDP);
        System.out.println("A soma do diagonal secundária é: "+somaDS);
	}
}
