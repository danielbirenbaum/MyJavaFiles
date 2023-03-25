package aula3;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int CODIGO = Input.nextInt();
        switch (CODIGO){
            case 1:
                System.out.print("um");
                break;
            case 2:
                System.out.print("dois");
                break;
            case 3:
                System.out.print("três");
                break;
            default:
                System.out.print("Código inválido");
                break;
            } 

        }
        
    }

