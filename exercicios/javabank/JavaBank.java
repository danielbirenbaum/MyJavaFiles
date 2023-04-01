package javabank;
import javabank.Conta;
import java.util.Scanner;

public class JavaBank {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Conta contaSistema = new Conta();

        boolean acesso = false;
        int i = 0;
        for ( ; i < 3; ++i){
            // Pegando o id da conta e a senha
            System.out.println("Informe o número da sua conta: ");
            int conta = Input.nextInt();
            Input.nextLine();

            System.out.println("Informe a senha da conta: ");
            String senha = Input.nextLine();

            if (contaSistema.logar(conta , senha)){
                acesso = true;
                break;
            } else if (!(contaSistema.logar(conta , senha))) {
                System.out.println("Tente novamente.");
            }
        }
        if (i == 3) System.out.println("ERRO: Muitas tentativas de login, reinicie o sistema.");

        while (acesso){
            System.out.println("--------------------------------------------");
            System.out.println("Esolha uma opção: ");
            System.out.println("#1 - Sacar");
            System.out.println("#2 - Depositar");
            System.out.println("#3 - Saldo");
            System.out.println("#4 - Sair");
            System.out.print(">");
            int operacao = Input.nextInt();

            switch (operacao){
                case 1:
                    System.out.println("Digite o valor a ser sacado: ");
                    int valor1 = Input.nextInt();
                    boolean operacaoEfetuada1 = contaSistema.sacar(valor1);
                    if (operacaoEfetuada1) System.out.println("O valor foi sacado com sucesso.");
                    else System.out.println("A operação não foi concluída, verifique seu saldo atual ou se foi inserido valore negativo.");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    int valor2 = Input.nextInt();
                    boolean operacaoEfetuada2 = contaSistema.depositar(valor2);
                    if (operacaoEfetuada2) System.out.println("O valor foi depositado com sucesso.");
                    else System.out.println("A operação não foi concluída, verifique seu saldo atual ou se foi inserido valore negativo.");
                    break;
                case 3:
                    System.out.println(contaSistema.retornaSaldo());
                    break;
                case 4:
                    acesso = false;
                    break;
                default:
                    System.out.println("É necessário realizar operação válida, pois ela não existe!");
                    break;
            }
        }

        if (!acesso) System.out.println("Obrigado por usar o nosso sistema.");

        Input.close();
    }
    
}