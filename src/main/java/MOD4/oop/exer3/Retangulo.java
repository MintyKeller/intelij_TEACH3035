package MOD4.oop.exer3;

public class Retangulo implements Forma{
    private double lado;
    private double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return lado * altura;
    }
}
