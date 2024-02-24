/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import java.util.Scanner;

/**
 *
 * @author Alunos
 */
public class Aula02 {
    public static void main(String[] args) {
        String marcaDeCarro = "Volkswagen";
        int velocidadeMaxima = 120;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("VOLUME DA ESFERA");
        System.out.print("Digite o raio da esfera: ");
        double raio = sc.nextDouble();
        double volume = 4*(3.14*(Math.pow(raio, 3)))/3;
        System.out.println("O volume da esfera é "+volume);
        
        
        System.out.println("ÁREA DO TRIÂNGULO");
        System.out.print("Digite o valor da base do triângulo: ");
        double base = sc.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        double alturaTri = sc.nextDouble();
        double area = (base*alturaTri)/2;
        System.out.println("A área do triângulo é: "+area);
        
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();
        double precoFinal = preco + (preco*0.25);
        System.out.println("O preço final é: "+ precoFinal);
        
        System.out.println("COMPARAR 2 NÚMEROS");
        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a é maior que b");
        } else if (a < b) {
            System.out.println("a é menor que b");
        } else {
            System.out.println("a é igual a b");
        }
        
        sc.nextLine();
        
        System.out.println("PESO IDEAL");
        System.out.print("Digite o sexo: ");
        String sexo = sc.nextLine();
        System.out.print("Digite a altura: ");
        double h = sc.nextDouble();
        
        sc.nextLine();
        
        if ("F".equalsIgnoreCase(sexo)) {
            double pIdeal = (72.7*h)-58;
            System.out.println("O peso ideal é: "+pIdeal);
        } else {
            double pIdeal = (62.1*h)-44.7;
            System.out.println("O peso ideal é: "+pIdeal);
        }
        
        System.out.println("SOMA");
        System.out.print("Digite o valor de A: ");
        int numA = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        int numB = sc.nextInt();
        
        int i = numA;
        int soma = 0;
        while (i <= numB) {
            soma = soma + i;
            i++;
        }
        
        System.out.println(soma);
        
        System.out.println("FIBONACCI");
        int n = sc.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        
        for (int j = 0; j <= n; j++) {
            int mem = 0;
            
            n = num1 + num2;
            mem = num2;
            num2 = n;
            num1 = mem;
        }
        
        System.out.println(n);
    }
    
}
