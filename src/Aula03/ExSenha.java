package Aula03;

import java.util.Scanner;

public class ExSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senha = 0;
        
        while (senha != senhaCorreta) {
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            
            if (senha == senhaCorreta) {
            	System.out.println("Acesso permitido");
            } else {
            	System.out.println("Senha inválida");
            }
        }
       
	}

}
