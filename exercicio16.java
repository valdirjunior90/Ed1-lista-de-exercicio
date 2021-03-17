//Construa um programa que calcule o fatorial de um número. Use uma estrutura de 
//repetição. Fatorial: n! = n (n − 1)!
//Exemplo: 5! = 5 x 4 x 3 x 2 x 1 = 120 ou 5! = 1 x 2 x 3 x 4 x 5 = 120 

import java.util.Scanner;
class Fatorial {
    static Scanner read = new Scanner(System.in);
    static double fat(int n){
        double fatn = 1;
        while(n > 0){
            fatn *= n;
            n--;
        }

        return fatn;
    }
   
    public static void main(String[] args) {
       int n;

       System.out.printf("Digite um numero para saber o fatorial: ");
       n = read.nextInt();

       System.out.printf("O fatorial é: " + fat(n));
   }
   
    

    
}
