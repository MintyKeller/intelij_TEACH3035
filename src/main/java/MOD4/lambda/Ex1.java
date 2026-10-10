package MOD4.lambda;

import java.util.ArrayList;

public class Ex1 {
    /*Escreva uma função que recebe uma lista de números inteiros e retorna uma
nova lista contendo apenas os números pares*/
    public static void main(String[] args) {
        ArrayList<Integer> nros = new ArrayList<>();
        nros.add(1);
        nros.add(2);
        nros.add(3);
        nros.add(4);
        nros.add(5);
        nros.add(6);
        nros.add(7);
        nros.add(8);
        nros.add(9);
        nros.add(10);
        nros.stream()
                .filter(nro -> nro %2 ==0)
                .forEach(nro -> System.out.println(nro));





    }
}
