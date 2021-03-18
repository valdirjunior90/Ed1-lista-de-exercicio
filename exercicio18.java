//Construa um programa que simule uma calculadora. Disponibilize um menu de opções e simule a opção desejada, 
//exibindo novamente o menu,até que o usuário escolha sair. Menu de opções:
//1 - raiz quadrada Dica: utilize uma biblioteca
//2 - fatorial Dica: crie e utilize uma função com a solução da questão anterior.
//0 - sair 
import java.util.Scanner;

class Calculadora {
    static Scanner read = new Scanner(System.in);
    
    static void printmenu(){
        System.out.println("============================");
        System.out.println("1 - Raiz Quadrada");
        System.out.println("2 - Fatorial");
        System.out.println("0 - Sair");
        System.out.println("============================");
    }

    static void pot(){
        double num,result;

        System.out.println("Digite o numero: ");
        num = read.nextDouble();
        result = Math.sqrt(num);

        System.out.println("O resultado é: "+result);
    }

    static void fat(){
        double num,result = 1;

        System.out.printf("Digite um numero: ");
        num = read.nextDouble();

        while(num>0){
            result *= num;
            num--;
        }

        System.out.println("O resultado é: "+result);

    }

    static void raiz(){
        double num, result;

        System.out.println("Digite o numero: ");
        num = read.nextDouble();

        result = Math.sqrt(num);
        System.out.println("O resultado é: "+result);
    }

    public static void main(String[] args) {
        int n;
        do{
            printmenu();
            System.out.printf("Escolha: ");
            n = read.nextInt();

            switch(n){
                case 1:
                    pot();
                    break;
                case 2:
                    raiz();
                    break;
                case 3:
                    fat();
                    break;
                case 0:
                    System.out.printf("Ate breve\n");
                    break;
                default:
                    System.out.printf("Por favor digite uma opcao valida\n");
                    break;
            }
        }while(n != 0);
      
    }
}
