//20. Construa um programa pra ler e exibir uma matriz de inteiros. 

import java.util.Scanner;
class Matriz {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int mat[][];
        mat = new int[3][3];
        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.printf("Digite um numero para colocar na matriz["+i+"]["+j+"]:");
                mat[i][j] = read.nextInt();
            }
        }

        System.out.println("Matriz: ");
        for(i = 0; i<3;i++){
            for(j = 0; j<3;j++){
                System.out.println("["+i+"]["+j+"]: "+mat[i][j]);
            }
        }
    }
}
