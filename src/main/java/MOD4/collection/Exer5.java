package MOD4.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exer5 {

    /*Exercício 5 Operações Avançadas
● Crie um ArrayList de números inteiros.
● Remova todos os números pares da lista.
● Crie um novo HashSet a partir dos números ímpares na lista.
● Verifique se o novo HashSet contém um número específico.*/

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
//        nros.forEach(nro -> {         NÃO FUNCIONA TIRAR ELEMENTOS NO FOREACH, USAR removeIf
//            if(nro %2 ==0) {
//                nros.remove(nro);
//            }
//        });

        nros.removeIf(nro -> nro % 2 == 0);

        HashSet<Integer> nros2 =new HashSet<>(nros);
        Scanner sc = new Scanner(System.in);
        System.out.println("Verifique a existencia de n no intervalo 0<x<10");
        int nro = sc.nextInt();
        if(nros2.contains(nro)) {
            System.out.println("Contém!");
        }else {
            System.out.println("Não contém!");
        }




    }

}
