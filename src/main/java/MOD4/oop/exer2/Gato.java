package MOD4.oop.exer2;

public class Gato extends Animal {

    public Gato (String nome) {
        this.nome = nome;
        this.som = "Miau";
    }

    public void fazerSom () {
        System.out.println(som);
    }
}
