package MOD4.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Ex3 {
    /*Escreva uma função que recebe uma lista de strings e retorna uma nova lista
com todas as strings convertidas para maiúsculas.*/
    public static void main(String[] args) {
        ArrayList<String> textos = new ArrayList<>();
        textos.add("a");
        textos.add("b");
        textos.add("c");
        textos.add("d");
        textos.add("e");
        textos.add("f");
        textos.add("g");
        textos.add("h");
        textos.add("i");
        textos.add("j");

        Consumer<String> consumer = item -> System.out.println(item.toUpperCase());

        textos.stream()
                .forEach(consumer);
    }

}
