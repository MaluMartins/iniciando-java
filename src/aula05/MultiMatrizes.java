package aula05;
import java.util.Scanner;

public class MultiMatrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MULTIPLICAÇÃO DE MATRIZES");
		
		System.out.print("Digite o nº de linhas da primeira matriz: ");
		int linhasA = sc.nextInt();
		System.out.print("Digite o nº de colunas da primeira matriz: ");
		int colunasA = sc.nextInt();
		int[][] matrizA = new int[linhasA][colunasA];
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasA; j++) {
				System.out.print("a["+(i+1)+", "+(j+1)+"]: ");
				matrizA[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o nº de linhas da segunda matriz: ");
		int linhasB = sc.nextInt();
		System.out.print("Digite o nº de linhas da segunda matriz: ");
		int colunasB = sc.nextInt();
		int[][] matrizB = new int[linhasB][colunasB];
		
		for (int i = 0; i < linhasB; i++) {
			for (int j = 0; j < colunasB; j++) {
				System.out.print("b["+(i+1)+", "+(j+1)+"]: ");
				matrizB[i][j] = sc.nextInt();
			}
		}
		
		if (colunasA == linhasB) {
			int[][] matrizRes = new int [linhasA][colunasB];
			
			for (int i = 0; i < linhasA; i++) {
				for (int j = 0; j < colunasB; j++) {
					int soma = 0;
					int multi = 0;
					for (int k = 0; k < colunasA; k++) {
						multi = matrizA[i][k] * matrizB[k][j];
						soma += multi;
						
						matrizRes[i][j] = soma;
					}
				}
			}
			
			for (int i = 0; i < linhasA; i++) {
				for (int j = 0; j < colunasB; j++) {
					System.out.print(matrizRes[i][j]+" ");
				}
				System.out.println("");
			}
			
		}
		
	}

}
