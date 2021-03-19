//21. Construa e use uma função que produz um novo vetor de inteiros com a ordem inversa 
//do vetor original passado por parâmetro
import java.util.Scanner;
class VetorContrario {
    static Scanner read = new Scanner(System.in);
    
    static void inverteVetor(int vect[], int inv[]){
        int i, j = 0;
        for(i=2; i>=0; i--){
            inv[j] = vect[i];
            j++;
        }
    }

    static void printVetor(int vect[], int len){
        int i;
        for(i=0 ; i< len; i++){
            System.out.print(vect[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int vect[],inv[],i;
        vect= new int[3];
        inv = new int[3];

        for(i = 0; i != 3; i++){
            System.out.printf("Digite um numero: ");
            vect[i]= read.nextInt();
        }

        inverteVetor(vect, inv);

        System.out.printf("Vetor Original: ");
        printVetor(vect,3);
        System.out.printf("Vetor Invertido: ");
        printVetor(inv,3);


    }
}
