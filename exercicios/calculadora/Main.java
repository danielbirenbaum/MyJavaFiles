package calculadora;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Calculadora minhCalculadora = new Calculadora();
        System.out.println(minhCalculadora.soma(4, 5));
        System.out.println(minhCalculadora.subtração(6, 3));
        System.out.println(minhCalculadora.multiplicacao(5, 8));
        System.out.println(minhCalculadora.resto(3, 2));
    }
}