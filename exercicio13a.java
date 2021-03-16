
//Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia apenas com os
//números ímpares dentro deste intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
//a) Construa este programa utilizando a estrutura while. 

import java.util.Scanner;

class ParImpar {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a,b;

        System.out.printf("Digite o primeiro numero do interválo: ");
        a = read.nextInt();
        read.nextLine();
        System.out.printf("Digite o segundo numero do interválo: ");
        b = read.nextInt();
        read.nextLine();
        
        if(b > a && b != a){
            while(a <= b){
                if(a % 2 != 0){
                    System.out.printf(a+ " ");
                    a++;
                }else{
                    a++;
                }
            }
        }else if(b != a){
            while(a >= b){
                if(a % 2 != 0){
                    System.out.printf(a+" ");
                    a--;
                }else{
                    a--;
                }
            }
        }else{
            System.out.printf(a+" ");
        }

    }
}
