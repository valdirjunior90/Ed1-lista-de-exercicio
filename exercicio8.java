
import java.util.Scanner;
//Distinguir, com base na média parcial do 
//aluno, se ele está aprovado, reprovado ou na final. 
//Aplique as regras da UFERSA.

class media {

    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args) {
        float nota1, nota2, nota3, media;

        System.out.println("Vamos calcular sua média!");
        System.out.printf("Digite a sua primeira nota: ");
        nota1 = leitura.nextFloat();
        leitura.nextLine();
        System.out.printf("Digite a sua segunda nota: ");
        nota2 = leitura.nextFloat();
        leitura.nextLine();
        System.out.printf("Digite a sua terceira nota: ");
        nota3 = leitura.nextFloat();
        leitura.nextLine();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Sua média é: " + media);

        if(media >= 7){
            System.out.println("Parabéns você foi aprovado!");
        }else{
            if(media <= 3.5){
                System.out.println("Você está reprovado!!");
            }else{
                System.out.println("Você irá fazer a 4º prova!");
            }
        }

    }
}
