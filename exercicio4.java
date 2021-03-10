// Construa um programa que gerencia a conta de uma pizzaria.
// Preço do refrigerante: R$ 1,50. Preço da fatia de pizza: R$ 3,00. Taxa do garçom: 10%.
// Receba do usuário: a quantidade de refrigerantes, a quantidade de fatias e a quantidade de pessoas na mesa.
// Calcule e exiba: o total sem a taxa, o total com a taxa, o rateio por pessoa com a taxa.

import java.text.DecimalFormat;
import java.util.Scanner;

class Pizza {
    static Scanner leitura = new Scanner(System.in);
    public static void main(String[] args) {
        final double refri = 1.50; 
        final double fatia = 3.00;
        final double taxa = 0.1;

        int qtdRefri, qtdFatia, qtdPessoa;
        float preco;

        System.out.printf("Digite o numero de Refrigerantes: ");
        qtdRefri = leitura.nextInt();
        leitura.nextLine();
        System.out.printf("Digite o numero de Fatias: ");
        qtdFatia = leitura.nextInt();
        leitura.nextLine();
        System.out.printf("Digite o numero de Pessoas: ");
        qtdPessoa = leitura.nextInt();
        
        preco = (float) ((qtdRefri * refri) + (qtdFatia*fatia));

        DecimalFormat formatado = new DecimalFormat("##.##");

        System.out.println("Preço sem taxa: R$"+ preco);
        System.out.println("Preço com taxa: R$"+ formatado.format(preco * taxa));

        if (qtdPessoa != 0){
            System.out.println("Preço por pessoa: R$"+ preco/qtdPessoa);
        }else{
            System.out.println("Numero de pessoas inválido!");
        }
        
    }
}
