import java.util.Scanner;

// Calcular o IMC (índice de massa corporal) de uma pessoa. Produzir um alerta em caso de divisão por zero. 

class Imc {
    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args){
        float altura, peso, imc;

        System.out.printf("Digite sua altura: ");
        altura = leitura.nextFloat();
        leitura.nextLine();
        System.out.printf("Digite o seu peso: ");
        peso = leitura.nextFloat();
        leitura.nextLine();

        imc = peso / (altura*altura);

        System.out.println("O seu IMC é: "+ imc);

    }
}
