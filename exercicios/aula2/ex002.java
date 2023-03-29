package aula2;

import java.util.Scanner;
public class ex002 {
    public static void main(String[] args){
        //Código que imprime a idade do usuário e seu nome
        //Input
        String nome;
        int dtNascimento,anoAtual;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Digite seu nome por favor: ");
        nome = Entrada.nextLine();  
        System.out.print("Digite sua data de nascimento: ");
        dtNascimento = Entrada.nextInt();   
        System.out.print("Digite o ano atual: ");       
        anoAtual = Entrada.nextInt();
        int falta = dtNascimento - anoAtual;
        //Output
        System.out.println("---------------------");

        System.out.println("Nome: " + nome);
        if (anoAtual < dtNascimento){
            System.out.println("Ops, você não nasceu ainda! Espere por mais: "+ falta +"anos :)");
        } else{
            System.out.println("Idade: " + (anoAtual - dtNascimento));

        }
        System.out.println("---------------------");


    }
}
