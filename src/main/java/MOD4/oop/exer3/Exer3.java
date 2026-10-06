package MOD4.oop.exer3;

public class Exer3 {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(2,6);
        Circulo c1 = new Circulo(8);

        System.out.println(r1.calcularArea());
        System.out.println(c1.calcularArea());
    }
}
