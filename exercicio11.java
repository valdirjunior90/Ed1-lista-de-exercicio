//Construa um programa que calcule uma equação do 2º grau.
//Crie uma função com retorno para calcular o delta.
//Crie uma função sem retorno para calcular as raízes

import java.util.Scanner;


class Equacaosegundo {
    
    static Scanner leitura = new Scanner(System.in);

    static int delta(int a, int b, int c){
        return (int) (Math.pow(b,2) - (4*a*c));
    }

    static void raiz(int a, int b, int delta){
        float x1,x2;
        //testar delta negativo:
        if(delta > 0){
            x1=(float) (-b + Math.sqrt(delta))/(2*a);
            x2=(float) (-b - Math.sqrt(delta))/(2*a);
            System.out.println("As raizes da equação são: \nx1= "+x1+"\nx2= "+x2);
        }else{
            System.out.println("Raiz do delta é negativa");
        }
    }
    public static void main(String[] args) {
        int a,b,c;

        System.out.printf("Digite o valor de a, b e c de um equação do segundo grau:\n aX^2+bY+c = 0 \na: ");
        a = leitura.nextInt();
        leitura.nextLine();
        System.out.printf("b: ");
        b = leitura.nextInt();
        leitura.nextLine();
        System.out.printf("c: ");
        c = leitura.nextInt();
        leitura.nextLine();
        
        raiz(a,b, delta(a,b,c));
    }
}
