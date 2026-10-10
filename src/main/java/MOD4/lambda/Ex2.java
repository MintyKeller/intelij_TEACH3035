package MOD4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex2 {
    /*Escreva uma função que verifica se um número é primo usando uma
expressão lambda.*/
    public static void main(String[] args) {
        Predicate<Integer> ehPrimo = n -> {
            if (n < 2) {
                return false;
            }
            if (n % 2 == 0) {
                return n == 2;
            }       //vê so até a raiz por otimização
            for (long i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        Consumer<Integer> consumer = item -> System.out.println(item);


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
                .filter(ehPrimo)
                .forEach(consumer);

    }
}
