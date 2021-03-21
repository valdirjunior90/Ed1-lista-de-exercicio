//29.Construa e use uma função para calcular o fatorial de um número. Utilize recursividade. 

import java.util.Scanner;
class FatorialRecurs {
    static Scanner entrada = new Scanner(System.in);
  
    public static int fatorial(int num) {

        if (num <= 1) {
            return 1;
        } else {
            return fatorial(num - 1) * num;
        }
    }
    
    public static void main(String[] args) {
        int numero;

        System.out.println("Digite o número que você pretende obter o fatorial.");

        numero = entrada.nextInt();

        System.out.println("O fatorial de " + numero + " é " + fatorial(numero) + ".");
    }
}