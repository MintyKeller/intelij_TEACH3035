package MOD4.oop.exer2;

public class Cachorro extends Animal{
    public Cachorro (String nome) {
        this.nome = nome;
        this.som = "Au!";
    }

    public void fazerSom () {
        System.out.println(som);
    }
}