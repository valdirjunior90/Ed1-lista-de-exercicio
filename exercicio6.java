//Construa um programa que calcule a área de um círculo, tendo como entrada o
// valor do raio, que deve ser positivo.  


import java.util.Scanner;

class exercicio6 {
    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args){
        final float pi = (float) 3.14;

        float raio, area;

        System.out.printf("Digite o raio: ");
        raio = leitura.nextFloat();
        
        if(raio>0){
            area = pi * (raio*raio);
            System.out.println("A area é: "+ area+ "m²");
        }else{
        
        System.out.println("Raio inválido!");
        }
    }
}
