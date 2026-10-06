package MOD4.oop.exer2;

import java.util.Scanner;


public class Exer2 {
/*a) Crie uma classe Animal com os atributos nome e som.
● b) Crie subclasses Cachorro e Gato que herdam de Animal.
● c) Adicione um método fazerSom nas subclasses Cachorro e Gato
que imprime o som característico do animal.*/

    public static void main(String[] args) {
        Gato gato = new Gato("Shoyo");
        Cachorro cachorro = new Cachorro ("Churros");
        gato.fazerSom();
        cachorro.fazerSom();
    }

}

