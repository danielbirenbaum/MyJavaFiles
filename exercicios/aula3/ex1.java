package aula3;
import java.util.Scanner; 

public class ex1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        //Input.useLocale(Locale.US); // Selecionar padrão americana de notação no input
        System.out.print("Digite a cotação do dólar atual: ");
        float Cotacao = Input.nextFloat();

        System.out.print("Digite o valor em dólares: ");
        float Valor = Input.nextFloat();
        
        float ValorReal = Cotacao / Valor;
        System.out.print("Valor em reais = " + ValorReal);
        
    }

}