import java.util.Scanner;

class Infos {
    static Scanner leitura = new Scanner(System.in);
	

    public static void main(String[] args) {
        int idade;
        float altura;
        String nome;
        char letra;

        System.out.printf("Digite sua idade: ");
        idade = leitura.nextInt();
        leitura.nextLine();
        System.out.printf("Digite sua altura (ex: 1,73 com virgula): ");
        altura = (float) leitura.nextDouble();
        leitura.nextLine();
        System.out.printf("Digite seu nome: ");
        nome = leitura.nextLine();
        System.out.println("===========================");
        System.out.println("Sua idade é: "+idade);
        System.out.println("Sua altura é: "+ altura);
        letra =  nome.charAt(0);
        System.out.println("A primeira letra do seu nome é:" + letra);
        System.out.println("Seu nome completo é: "+ nome);
	}
}
