import java.util.Scanner;

class ParImpar3 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        int a, b;

        System.out.printf("Digite o primeiro numero do interválo: ");
        a = read.nextInt();
        
        System.out.printf("Digite o segundo numero do interválo: ");
        b = read.nextInt();
        
        if(b> a && b!= a){
            for(; a <= b; a++){
                if(a%2 != 0){
                    System.out.printf(a + " ");
                }
            }
        }else if(b != a){
            for(;a>=b;a--){
                if(a%2 != 0){
                    System.out.printf(a+ " ");
                }
            }
        }else{
            System.out.printf(a+" ");
        }
    }
}
