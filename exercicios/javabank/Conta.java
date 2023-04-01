package javabank;

public class Conta{
    private int numeroConta = 1234;
    private double saldo = 1000.00;
    private String senha = "9999";

    // Saca dinheiro do atributo saldo da classe
    public boolean sacar(double valor){
        if (valor > saldo || valor < 0){
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
    // Deposita dinheiro no atributo saldo da classe
    public boolean depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }
    // Função que retorna saldo, considerando que o artibuto saldo é privado
    public String retornaSaldo() {
        return Double.toString(saldo);
    }

    // Para a validação do usuário, para que assim, possa existir alguma operação ou barar a pessoa de acessar 
    public boolean logar(int numeroConta, String senha) {
        if (this.numeroConta == numeroConta && this.senha.equals(senha)) return true;
        else return false;
    }

}