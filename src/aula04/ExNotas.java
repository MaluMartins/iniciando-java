package aula04;

import java.util.Scanner;

public class ExNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de alunos: ");
		int m = sc.nextInt();
		
		sc.nextLine();
		
		double[] medias = new double[m];
		
		String[] nomes = new String[m];
		
		double media = 0;
		
		for (int i = 0; i < m; i++) {
			System.out.print("Digite o nome do "+(i+1)+"º aluno: ");
			String nome = sc.nextLine();
			nomes[i] = nome;
			for (int j = 0; j < 3; j++) {
				System.out.print("Digite a "+(j+1)+"ª nota de "+nomes[i]+": ");
				double nota = sc.nextInt();
				medias[i] = medias[i] + nota;
			}
			medias[i] = medias[i]/3;
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < m; i++) {
			if(medias[i] >= 7) {
				System.out.println(nomes[i]+", média: "+medias[i]);
			}
		}
	}

}
