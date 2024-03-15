package aula04;

import java.util.Scanner;

public class ExReceberMatriz {
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
        
        //exibindo a matriz
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println("");
        }
	}
}
