//Construa um programa que leia do usuário um número inicial e um número final. Em seguida, exiba na tela uma sequencia com os números desse
//intervalo informado pelo usuário. Exemplo: caso o usuário entre com os números 4 e 10, o resultado do programa seria: 4 5 6 7 8 9 10
//b) Construa este programa utilizando a estrutura do-while
import java.util.Scanner;

class Laco2 {

    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args) {
       
        int a,b;
        
        System.out.println("Digite o primeiro numero do interválo: ");
        a = leitura.nextInt();
        System.out.println("Digite o segundo numero do interválo: ");
        b = leitura.nextInt();

        if(b > a && b != a){
            do{
                System.out.print(a+" ");
                a++;
            }while(a <= b);
        }else if(b != a){
            do{
                System.out.print(a+" ");
                a--;
            }while(a >= b);
        }else{
            System.out.println(a);
        }
    }
}
