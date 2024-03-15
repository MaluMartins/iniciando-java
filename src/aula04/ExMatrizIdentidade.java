package aula04;

import java.util.Scanner;

public class ExMatrizIdentidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz: ");
		int m = sc.nextInt();
		int[][] matriz = new int[m][m];
		
		boolean identidade = false;
		
		//lendo a matriz
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("a["+(i+1)+", "+(j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
		
		
		
		//verifica se os elementos da diagonal principal sao 1 e o resto 0
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (i == j && matriz[i][j] != 1) {
					identidade = false;
				} else if (i != j && matriz[i][j] != 0) {
					identidade = false;
				} else {
					identidade = true;
				}
			}
		}
		
		if (identidade == true) {
			System.out.println("Essa é uma matriz identidade");
		} else if (identidade == false){
			System.out.println("Essa não é uma matriz identidade");
		}
		
		//exibindo a matriz
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<m; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
