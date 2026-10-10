package MOD4.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Exer3 {

    /*Exercício 3 Comparando ArrayList e HashSet
● Crie um ArrayList e um HashSet contendo números inteiros.
● Adicione os mesmos números em ambas as coleções.
● Imprima os elementos do ArrayList e do HashSet.
● Explique a diferença entre a ordem dos elementos nos dois.*/

    public static void main(String[] args) {

        ArrayList<Integer> nros1 = new ArrayList<>();
        HashSet<Integer> nros2 = new HashSet<>();
//
//        nros1.add(1);
//        nros1.add(2);
//        nros1.add(3);
//
//        nros2.add(1);
//        nros2.add(2);
//        nros2.add(3);


        nros1.add(30);
        nros1.add(5);
        nros1.add(100);
        nros1.add(1);


        nros2.add(30);
        nros2.add(5);
        nros2.add(100);
        nros2.add(1);

        nros1.forEach(nro -> System.out.println(nro));
        nros2.forEach(nro -> System.out.println(nro));






    }
}
