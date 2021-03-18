//19. Construa um programa pra ler e exibir um vetor de inteiros
import java.util.Scanner;
class LerVetor {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int vect[];
        vect = new int[5];
        int i;

        //leitura
        for(i=0;i<5;i++){
            System.out.printf("Digite o valor da posição ["+i+"]: ");
            vect[i] = read.nextInt();
        }
        //exibição
        for(i=0;i<5;i++){
            System.out.print("["+vect[i]+"] ");
        }
    }
}
