package aula02;

import java.util.Scanner;

public class ExPrecoProduto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto: ");
	    double preco = sc.nextDouble();
	    double precoFinal = preco + (preco*0.25);
	    System.out.println("O preço final é: "+ precoFinal);
	}
}
