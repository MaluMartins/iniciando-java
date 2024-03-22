package aula04;
import java.util.Scanner;

public class ExCombinacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a ordem da matriz: ");
		int n = sc.nextInt();
		double[][] matriz = new double[n][n];
		
		double comb;
		int fatI = 1;
		int fatJ = 1;
		int fatSoma = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int soma = i+j;
				System.out.println("soma "+soma);
				
				// calcular fatorial
				for (int y = 1; y <= i; y++) {
					fatI = fatI * y;
				}
				
				for (int x = 1; x <= j; x++) {
					fatJ = fatJ * x;
				}
				for (int z = 1; z <= soma; z++) {
					fatSoma = fatSoma * z;
				}
				
				System.out.println(fatI);
				System.out.println(fatJ);
				System.out.println(fatSoma);
				System.out.println("-------------");
				
				
				//comb = fatI/(fatJ*(fatSoma));
				//System.out.println(comb);
				
				//matriz[i][j] = comb;
				
			}
		}
		
		
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println("");
        }
		
	}

}
