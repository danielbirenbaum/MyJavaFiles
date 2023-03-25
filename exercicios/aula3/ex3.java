package aula3;

public class ex3 {
    public static void main(String[] args) {
        long soma = 0;
        long multiplicaco = 1;
        for (int i = 1; i <= 30; i+=1 ){
            if (i % 2 == 0){ 
                multiplicaco *= i;
            }
            else {
                soma += i;   
            }
        }
        
        System.out.println("A soma dos números ímpares entre 0 e 30 é: " + soma );
        System.out.print("A multiplicação dos números pares entre 0 e 30 é: " + multiplicaco );

        
    }
}
