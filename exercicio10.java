//Construa um programa que leia um número inteiro digitado pelo usuário. Caso o número pertença ao intervalo de 1 a 5, exiba o número por
//extenso. Caso o número não pertença a este intervalo, exiba a mensagem "valor invalido". 

import java.util.Scanner;
class Entre {
    static Scanner leitura = new Scanner(System.in);
   public static void main(String[] args) {
        int num;
        System.out.printf("Digite um numero para saber se está entre 1 e 5: ");
        num = leitura.nextInt();
        leitura.nextLine();
        
        if(num >= 1 && num <= 5){
            System.out.println(num);
        }else{
            System.out.println("Numero inválido!");
        }
   } 
}
