//23. Construa um programa que mova o número da última posição de um vetor para a primeira posição.
//Faça isso gradativamente: use uma estrutura de repetição, e em cada iteração do loop mova esse número
//apenas uma posição, ou seja, troque esse número da posição n por n-1. 
import java.util.Scanner;
class TrocaVetor {
    static Scanner read = new Scanner(System.in);
    
    static void printVetor(int linhas, int vet[]){
        int i;
        for ( i = 0; i < linhas; i++)
        {
            System.out.printf(vet[i]+" ");        
        }    
    }
    
    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7,8,9,0};
        int i;
        
        for(i=0; i < 5 ;i++){
            int numSalvo = vetor[i];
            vetor[i] = vetor[9 - i];
            vetor[9-i] = numSalvo;
        }
        System.out.println("Vetor Invertido: ");
        printVetor(10,vetor);
    }
}