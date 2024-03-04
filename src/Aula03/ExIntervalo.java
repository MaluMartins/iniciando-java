package Aula03;
import java.util.Scanner;

public class ExIntervalo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o início do intervalo: ");
        int a = sc.nextInt();
        System.out.print("Digite o final do intervalo: ");
        int b = sc.nextInt();
        
        int soma = 0;
        if (b>a) {
            for (int i = a; i <= b; i++) {
            soma = soma + i;
            }
        } else if (a>b) {
            for (int i = b; i <= a; i++) {
            soma = soma + i;
            }
        }
        
        System.out.println(soma);
	}
}
