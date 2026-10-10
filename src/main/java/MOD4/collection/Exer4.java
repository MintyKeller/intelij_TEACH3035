package MOD4.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Exer4 {
    /*Exercício 4 Conversão entre ArrayList e HashSet
● Crie um ArrayList de palavras.
● Converta o ArrayList em um HashSet.
● Imprima os elementos do HashSet.
● Converta o HashSet de volta para um ArrayList.
● Imprima os elementos do ArrayList resultante.
● Observe se a ordem dos elementos muda durante as conversões.*/

    public static void main(String[] args) {
        ArrayList<String> bichinhos1 = new ArrayList<>();
        bichinhos1.add("Branca <3");
        bichinhos1.add("Lipe <3");
        bichinhos1.add("Caramela <3");
        bichinhos1.add("Minnie <3");
        bichinhos1.add("Frani <3");
        bichinhos1.add("Miauzinho <3");
        bichinhos1.add("Psique <3");


        bichinhos1.forEach(bicho -> System.out.println(bicho));
        System.out.println("------------------------------------------------------------------");

        HashSet<String> bichinhos2 = new HashSet<>(bichinhos1);
        bichinhos2.forEach(bicho -> System.out.println(bicho));

        System.out.println("------------------------------------------------------------------");

        ArrayList<String> bichinhos3 = new ArrayList<>(bichinhos2);
        bichinhos3.forEach(bicho -> System.out.println(bicho));



    }


}
