package aula04;

import java.util.Scanner;

public class ExRotacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
		}
		
		System.out.print("Quantas vezes irá rotacionar o vetor? ");
		int k = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			vet[i] = i+1;
		}
		
		for (int i = 0; i < k; i++) {
			int mem = vet[n-1];
			for (int j = 1; j < n; j++) {
				vet[j] = vet[j-1];
			}
			vet[0] = mem;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(vet[i]+" ");
		}
		
	}
}
