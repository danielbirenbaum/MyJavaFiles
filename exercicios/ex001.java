import java.util.Scanner;
public class ex001 {
    public static void main(String[] args){
        //Código que imprime o dobro de um número digitado pelo usuário
        int numero;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Digite um número, que iremos dobrá-lo: ");
        numero = Entrada.nextInt();
        System.out.println(numero * 2);
    }
}
