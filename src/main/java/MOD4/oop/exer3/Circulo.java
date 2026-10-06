package MOD4.oop.exer3;

public class Circulo implements Forma {
    private double raio;

    public Circulo (double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea(){
        double PI = 3.14;
        return raio * raio * PI;
    }
}
