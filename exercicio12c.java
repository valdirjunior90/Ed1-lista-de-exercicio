import java.util.Scanner;

//Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia com os números desse
//intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
//c) Construa este programa utilizando a estrutura for.

public class exercicio12c {
    
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;
        System.out.printf("Digite o primeiro numero do intervalo: ");
        a = read.nextInt();
        read.nextLine();
        System.out.printf("Digite o segundo numero do intervalo: ");
        b = read.nextInt();
        read.nextLine();

        if(b > a && b != a){
            for(; a <= b; a++){
                System.out.print(a+ " ");
            }
        }else if( b < a){
            for(; a >= b; a--){
                System.out.print(a+ " ");
            }
        }else{
            System.out.println(a);
        }

    }
}
