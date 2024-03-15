package aula04;

import java.util.Scanner;

public class ExOrdenarVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de números que deseja inserir: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        
        for (int i = 0; i<n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n-1; i++) { //travar uma posição
            for (int j = i+1; j < n; j++) { //comparar a posição fixa com o resto dos números
                if (numeros[j] < numeros[i]) {
                    int mem = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = mem;
                }
            }
        }
        System.out.println("----");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);  
        }
	}

}
