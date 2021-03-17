import java.util.Scanner;

class Primo {
    static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num = 0;
        int primo = 0;

        System.out.printf("Digite um numero: ");
        num = read.nextInt();

        int i;
        for(i=1;i<num;i++) {
            if(num%i == 0){
                primo++;
            }
        }

        if(primo < 2){
            System.out.println("é primo");
        }else{
            System.out.println("Não é primo");
        }
    }
}
