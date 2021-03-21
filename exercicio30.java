//30. Calcule o somatório dos números inteiros do intervalo entre dois números. No mesmo programa, 
//implemente esse cálculo em duas funções:
//a) Resolva o problema com recursividade. 
//b) Resolva o problema com estrutura de repetição. 

import java.util.Scanner;
class Somatorio30{
    
    static Scanner read = new Scanner(System.in);

    private static int somaRepeticao(int num1, int num2) {
		int somatorio = 0;
		for (int i = num1; i <= num2; i++) {
			somatorio = somatorio + i;
		}
		return somatorio;
	}
    private static int somaRecursivo(int num1, int num2) {
		int somatorio;
		if (num2 == num1) {
			return num1;
		}

		if (num1 < num2) {
			somatorio = somaRecursivo(num1, num2 - 1) + num2;
		} else {
			somatorio = somaRecursivo(num2, num2 + 1) + num2;
		}
		return somatorio;
	}
    public static void main(String[] args) {
		int numInicial, numFinal;
		System.out.print("Digite o número inicial: ");
		numInicial = read.nextInt();
		System.out.print("Digite o número final: ");
		numFinal = read.nextInt();

		System.out.println("O somatório com recursividade é: " + somaRecursivo(numInicial, numFinal));
        System.out.println("O somatório com repetição é: " + somaRepeticao(numInicial, numFinal));
	}

}
