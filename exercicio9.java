import java.util.Scanner;

//Construa um programa que calcule para o aluno sua média parcial e informe sua situação parcial (Aprovado, Recuperação ou Reprovado).
//Caso ele esteja em Recuperação, calcule quanto ele precisa tirar na 4ª prova para ser aprovado (média final maior ou igual que 5,0).
//Observação: utilize os pesos e regras da UFERSA

class Mediafinal{
    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args) {
        
        float nota1, nota2,nota3, med, rec, quantoprecisa;
        System.out.printf("Digite sua primeira nota: ");
        nota1 = leitura.nextFloat();
        leitura.nextLine();
        System.out.printf("Digite sua primeira nota: ");
        nota2 = leitura.nextFloat();
        leitura.nextLine();
        System.out.printf("Digite sua primeira nota: ");
        nota3 = leitura.nextFloat();
        leitura.nextLine();

        med = (nota3 + nota2 + nota1)/3;

        if(med >= 7){
            System.out.println("Aluno aprovado! sua média foi: " + med);
        }else if(med >= 3.5){
            quantoprecisa = (50-med*6)/4;
            System.out.println("Aluno em recuperação. você precisa de: "+ quantoprecisa);
            
            System.out.println("Digite a nota da sua recuperação: ");
            rec = leitura.nextFloat();

            med = (med * 6 + rec * 4)/10;
            
            if(med>=5){
                System.out.println("Aluno aprovado! Sua média foi: "+ med);

            }else{
                System.out.println("Aluno reprovado! Sua média foi: "+ med);
            }

        }else{
            System.out.println("Aluno reprovado direto!! Sua média foi: "+med);
        }
    }
}
