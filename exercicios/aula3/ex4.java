package aula3;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        System.out.print("Digite o 1º nome: ");
        String nome1 = Input.next();
        System.out.print("Digite a idade: ");
        int idade1 = Input.nextInt();

        System.out.print("Digite o 2º nome: ");
        String nome2 = Input.next();
        System.out.print("Digite a idade: ");
        int idade2 = Input.nextInt();

        System.out.print("Digite o 3º nome: ");
        String nome3 = Input.next();
        System.out.print("Digite a idade: ");
        int idade3 = Input.nextInt();

        if (idade1 > idade2 && idade1 > idade3){
            System.out.print("A maior idade é do(a): " + nome1 +  "e a idade é de: " + idade1 + " anos.");
        }else if(idade2 > idade1 && idade2 > idade3){
            System.out.print("A maior idade é do(a): " + nome2 +  "e a idade é de: " + idade2+ " anos.");
        }else if(idade3 > idade1 && idade3 > idade2){
            System.out.print("A maior idade é do(a): " + nome3 +  "e a idade é de: " + idade3+ " anos.");
        }

    }
}
