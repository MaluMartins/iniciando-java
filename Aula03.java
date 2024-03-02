package aula03;

import java.util.Scanner;

public class Aula03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.println("IDADE");
        
        double perc1 = 0;
        double perc2 = 0;
        double perc3 = 0;
        double perc4 = 0;
        double perc5 = 0;
        
        for (int i = 0; i<=50; i++) {
            int idade = sc.nextInt();
            
            if (idade <= 15) {
                perc1++;
            } else if (idade > 15 && idade <= 30) {
                perc2++;
            } else if (idade > 30 && idade <= 45) {
                perc3++;
            } else if (idade > 45 && idade <= 60) {
                perc4++;
            }  else {
                perc5++;
            }
        }
        
        double total = (perc1 + perc2 + perc3 + perc4 + perc5);
        
        perc1 = (perc1*100)/total;
        perc2 = (perc2*100)/total;
        perc3 = (perc3*100)/total;
        perc4 = (perc4*100)/total;
        perc5 = (perc5*100)/total;
        
        System.out.println(perc1);
        System.out.println(perc2);
        System.out.println(perc3);
        System.out.println(perc4);
        System.out.println(perc5);
        
        
        System.out.println("SOMATÓRIO");
        
        int soma = 0;
        //for (int i = 100; i <= 500; i+=2) {
            //soma = soma + i;
        //}
        
        for (int i = 100; i <= 500; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        
        System.out.println(soma);
        
        sc.nextLine();
        
        //System.out.println("IDADE");
        
        //for (int i = 0; i <= 50; i++) {}
        
        System.out.println("INTERVALO");
        
        System.out.print("Digite o início do intervalo: ");
        int a = sc.nextInt();
        System.out.print("Digite o final do intervalo: ");
        int b = sc.nextInt();
        
        int soma2 = 0;
        if (b>a) {
            for (int i = a; i <= b; i++) {
            soma2 = soma2 + i;
            }
        } else if (a>b) {
            for (int i = b; i <= a; i++) {
            soma2 = soma2 + i;
            }
        }
        
        System.out.println(soma2);
        
        
        System.out.println("SOMA DA SEQUENCIA");
        
        int somaNum = 0;
        for (int i = 0; i < 20; i++) {
            int num;
            num = sc.nextInt();
            somaNum += num;
        }
        
        System.out.println(somaNum); 
        
        System.out.println("IMPRIMIR NUMEROS ATE N");
        
        int n = sc.nextInt();
        int i = 0;
        
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        
        
        System.out.println("FOGO");
        
        int i = 10;
        
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        
        System.out.println("FOGO!");
        
        System.out.println("TABUADA");
        
        System.out.print("Digite a tabuada que deseja encontrar: ");
        int tab = sc.nextInt();
        
        int i = 0;
        while (i <= 10) {
            int res = tab * i;
            
            System.out.println(tab+"*"+i+" = "+res);
            
            i++;
        }*/
        
        System.out.println("SENHA");
        
        sc.nextLine();
        
        String senhaCorreta = "abc";
        
        String senha = null;
        
        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (senha != senhaCorreta);
        
        System.out.println("Acesso permitido");
    }
    
}
