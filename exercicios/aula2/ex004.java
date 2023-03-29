package aula2;
import java.util.Scanner;
public class ex004{
    public static void main(String[] args){
        // Código que reajusta um saldo em 1%
        float saldo, reajuste;
        Scanner Input = new Scanner(System.in);
        System.out.print("Digite o saldo: ");
        saldo = Input.nextFloat();

        reajuste = saldo * 1.01f;   

        System.out.print("O reajuste resultou em um saldo de: " + reajuste);
    }
}