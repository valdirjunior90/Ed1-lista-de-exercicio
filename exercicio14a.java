//Verificar se a senha, informada durante a execução, é correta. Quando a senha estiver correta, exiba “senha correta” e o programa é encerrado.
//Quando a senha estiver errada, exiba “senha incorreta”, e permita a entrada novamente da senha, repetindo esse processo até que a senha entrada
//seja correta.
//a) Resolva esse problema utilizando a estrutura while. 
import java.util.Scanner;
class Senha {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        
        String a, senha;
        int enter;
        
        senha = "oi";
        enter = 1;
        while(enter == 1){
            System.out.println("Digite a senha: ");
            a = (String) read.nextLine();

            if(a.equals(senha) == true){
                System.out.println("Senha correta!");
                enter = 0;
            }else{
                System.out.println("Senha Incorreta, tente novamente");
            }
        }
            
    
    }
    
};
