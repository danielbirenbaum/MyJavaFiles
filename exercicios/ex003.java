
import java.util.Scanner;
public class ex003 {
    
    public static float Media(float Nota1 , float Nota2 , float Nota3){
        float SomaDasNotas;
        SomaDasNotas = Nota1 + Nota2 + Nota3;
        
        return SomaDasNotas / 3;
    }
    
    public static void main(String[] args){
        // Programa que lê 3 notas de um aluno e imprime sua média
        // Array contendo todas as notas do aluno
        float notas[] = {0.0f,0.0f,0.0f};
        Scanner Input = new Scanner(System.in);
        // Adicionando as notas ao array
        for (int i = 0; i < 3; i++ ){
            System.out.print("Digite a "+(i + 1)+"° nota:");
            notas[i] = Input.nextFloat();
        }
        //Calculando a média através do método média
        float retornoFuncao = Media(notas[0],notas[1],notas[2]);
        //Imprimindo na tela com arredondamento de duas casas decimais
        System.out.print(String.format("%2f", "A média do aluno é: " + retornoFuncao));

    }    
}
