//25. Construa um programa que registre 3 pessoas com os seguintes campos: nome, idade, sexo, peso, altura.
//Em seguida, exiba a ficha completa de cada uma: nome, idade, sexo, peso, altura e IMC (Índice de Massa Corporal). 
import java.util.Scanner;
public class exercicio25 {
    static Scanner read = new Scanner(System.in);
    static class Pessoa{
        String nome,sexo;
        int idade;
        double peso,altura;

        public Pessoa(String nome,String sexo,int idade,double peso,double altura){
            this.nome = nome;
            this.sexo = sexo;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }

        public double getPeso() {return peso;}
        public int getIdade() {return idade;}
        public double getAltura() {return altura;}
        public String getNome() {return nome;}
        public String getSexo() {return sexo;}

        public String setNome(String nome) { return this.nome = nome;}
        public String setSexo(String sexo) {return this.sexo = sexo;}
        public int setIdade(int idade) {return this.idade = idade;}
        public double setPeso(double peso) {return this.peso = peso;}
        public double setAltura(double altura) {return this.altura = altura;}
        
    }
    public static void main(String[] args) {
        Pessoa[] pessoa = new Pessoa[3];
        double imc;
        for (int i = 0; i < 3; i++) {
            pessoa[i] = new Pessoa(null, null, i, i, i);
            System.out.println("=============================");
            System.out.println("Dados da pessoa "+ (i+1) +": ");
            System.out.printf("Nome: ");
            pessoa[i].setNome(read.nextLine());
            System.out.printf("Sexo: ");
            pessoa[i].setSexo(read.nextLine());
            System.out.printf("Idade: ");
            pessoa[i].setIdade(read.nextInt());
            System.out.printf("Peso: ");
            pessoa[i].setPeso(read.nextDouble());
            System.out.printf("Altura: ");
            pessoa[i].setAltura(read.nextDouble());
            read.nextLine();
        }

        System.out.println("EXIBINDO PESSOAS CADASTRADAS:");
        for(int i=0; i<3; i++){
            System.out.println("==============================");
            System.out.println("Dados da pessoa "+ (i+1) +": ");
            System.out.println("==============================");
            System.out.println("Nome: "+pessoa[i].getNome());
            System.out.println("Sexo: "+pessoa[i].getSexo());
            System.out.println("Idade: "+pessoa[i].getIdade());
            System.out.println("Peso: "+pessoa[i].getPeso());
            System.out.println("Altura: "+pessoa[i].getAltura());
            imc = pessoa[i].peso / (pessoa[i].altura*pessoa[i].altura);
            System.out.println("IMC: "+imc);
            System.out.println("==============================");
        }
        
    }
}
