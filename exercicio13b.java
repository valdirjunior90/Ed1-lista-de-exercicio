import java.util.Scanner;

//Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia apenas com os
//números ímpares dentro deste intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado seria: 5 7 9
//b) Construa este programa utilizando a estrutura do-while. 
class ParImpar2 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        int a, b;
        System.out.printf("Digite o primeiro numero do interválo: ");
        a = read.nextInt();
        System.out.printf("Digite o segundo numero do interválo: ");
        b = read.nextInt();

        if(b>a && b!=a){
            do{
                if(a%2 != 0){
                    System.out.printf(a+" ");
                    a++;
                }else{
                    a++;
                }
            }while(a<=b);
        }else if(b != a){
            do{
                if(a%2 != 0){
                    System.out.printf(a+ " ");
                    a--;
                }else{
                    a--;
                }
            }while(a >= b);
        }
        
    }
};
