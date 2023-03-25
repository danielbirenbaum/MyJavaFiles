public class Calculadora {
    public double soma(double x, double y) {
        return x + y;
    }
    public double subtração(double x, double y){
        return x - y;
    }
    public double multiplicacao(double x ,double y) {
        return x * y;
    }
    public double resto(double x, double y) {
        return x % y;
    }

    public static void main(String[] args) {
        Calculadora minhCalculadora = new Calculadora();
        System.out.println(minhCalculadora.soma(3, 4));
        System.out.println(minhCalculadora.subtração(10, 2));
        System.out.println(minhCalculadora.multiplicacao(12, 5));
        System.out.println(minhCalculadora.resto(10, 3));
    }
}
