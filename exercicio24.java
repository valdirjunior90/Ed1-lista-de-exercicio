//24. Construa um programa que inverta a frase digitada pelo usuário. Por exemplo, se 
//string1 for “bom dia”, então string2 será “aid mob”.
import java.util.Scanner;
class InverteString {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        String a;

        System.out.printf("Digite uma string qualquer para ser invertida: ");
        a = read.nextLine();

        StringBuffer buf = new StringBuffer(a);

        System.out.println("String Invertida: "+ buf.reverse());
    }
}
