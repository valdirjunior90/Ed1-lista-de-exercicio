import java.util.Scanner;

//Receba do teclado dois números inteiros, calcule e exiba os resultados das seguintes operações: 
//adição, subtração, multiplicação, quociente da divisão, resto da divisão, potenciação e raiz. 

class Operacoes {
    static Scanner leitura = new Scanner(System.in);
    public static void main(String args[]){
        
        int resultado, primeiro, segundo;
        
        System.out.printf("Digite o primeiro numero: ");
        primeiro = leitura.nextInt();
        System.out.printf("Digite o segundo numero: ");
        segundo = leitura.nextInt();

    
        System.out.println("=====================================");
        resultado = primeiro + segundo;
        System.out.println("Soma: " + resultado);
        resultado = primeiro - segundo;
        System.out.println("Subitração: " + resultado);
        resultado = primeiro * segundo;
        System.out.println("Multiplicação: " + resultado);
        resultado = primeiro / segundo;
        System.out.println("Divisão: " + resultado);
        resultado = primeiro % segundo;
        System.out.println("Resto da Divisão: " + resultado);
        
    }
}
