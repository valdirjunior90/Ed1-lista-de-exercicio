//Construa um programa que leia um número inteiro e identifique se ele é par ou ímpar. 

import java.util.Scanner;

class diference {
    
    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args){
        int num1,resto;
        

        System.out.printf("Digite um numero para saber se é impar ou par: ");
        num1 = leitura.nextInt();
        resto = num1 % 2;

        if(resto == 0){
            System.out.println("Numero é Par!");
        }else{
            System.out.println("Numero é Im3par");
        }
    }
}
