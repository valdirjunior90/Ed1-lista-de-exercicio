//22. Construa um programa que identifique o maior e o menor número de um vetor de inteiros. 

import java.util.Scanner;
class VetorMaiorMenor {
    static Scanner read = new Scanner(System.in);
    
    static void printVetor(int linhas, int vet[]){
        int i;
        for ( i = 0; i < linhas; i++)
        {
            System.out.printf(vet[i]+" ");        
        }    
        System.out.println("");
    }
    public static void main(String[] args) {
        int menor,maior,i,vetor[] = {1,4,15,12,6,19,5,8,10,20};
        menor = maior = vetor[0]; 

        for(i=0; i < 10 ;i++){
            if(menor>vetor[i]){
                menor = vetor[i];
            }
            if(maior<vetor[i]){
                maior = vetor[i];
            }
        }
        System.out.printf("Vetor: ");
        printVetor(10,vetor);
        System.out.println("Maior Numero: "+maior);
        System.out.println("Menor Numero: "+menor);

    }
}
