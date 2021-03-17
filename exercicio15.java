
//Construa um programa que calcule o somatório dos números inteiros de um intervalo, 
//definido por um número inicial e um número final.
//Exemplo: caso as entradas fossem 4 e 9, o resultado seria: 39 

import java.util.Scanner;

class Somatorio{
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b, sum; 
		
        sum = 0;
	System.out.printf("Digite o primeiro numero do intervalo: ");
	a = read.nextInt();
	System.out.printf("Digite o segundo numero do intervalo: ");
	b = read.nextInt();

	if (b > a && b != a){
		for (; a <= b; a ++){
			sum = sum + a;
		}
	} else if (b != a){
		for(; a >= b; a --){
			sum =+ a;
		}
	} else {
		sum = a;
	}
	
	System.out.print(sum);
    }
}