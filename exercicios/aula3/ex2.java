package aula3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Digite um valor inteiro: ");
        int valorInteiro = Input.nextInt();
        
        for (int i = 0; i <= valorInteiro ; i+=1){
            System.out.println(valorInteiro - i);
        }

    }
}
