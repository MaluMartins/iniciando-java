package aula04;
import java.util.Scanner;

public class Aula04 {

    public static void main(String[] args) {
        //Vetor ordenado
        
        Scanner sc = new Scanner(System.in);
        /*
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
        */
        
        //Matriz
        
        System.out.print("Digite a ordem da matriz: ");
        int k = sc.nextInt();
        int matriz [][] = new int [k][k];
        
        //lendo a matriz
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("a["+(i+1)+", "+(j+1)+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        //exibindo a matriz
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println("");
        }
        
        //soma dos elementos do triangulo superior
        
        int somaTS = 0;
        int somaTI = 0;
        int somaDP = 0;
        int somaDS = 0;
        
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if(i<j) {
                    somaTS += matriz[i][j];
                } else if (i>j) {
                    somaTI += matriz[i][j];
                } else if (i==j) {
                    somaDP += matriz[i][j];
                } else if ((i+j) == k) {
                    somaDS += matriz[i][j];
                }
            }
        }
        
        System.out.println("A soma do triângulo superior é: "+somaTS);
        System.out.println("A soma do triângulo inferior é: "+somaTI);
        System.out.println("A soma da diagonal principal é: "+somaDP);
        System.out.println("A soma do diagonal secundária é: "+somaDS);
    }
    
}
