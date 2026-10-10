package MOD4.collection;

import java.util.ArrayList;

public class Exer1 {
    /*Exercício 1 ArrayList
● Crie um ArrayList de nomes de frutas e adicione pelo menos 5 nomes de
frutas a ele.
● Imprima o tamanho do ArrayList.
● Imprima o terceiro elemento do ArrayList.
● Remova a primeira fruta da lista.
● Verifique se uma determinada fruta existe na lista.
● Itere sobre a lista e imprima todas as frutas.*/

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("goiaba");
        frutas.add("cereja");
        frutas.add("abacate");
        frutas.add("jabuticaba");
        frutas.add("melancia");

        System.out.println(frutas.size());
        System.out.println(frutas.get(2));
        frutas.remove(0);
        System.out.println("Existe \"maçã\" na lista?" + frutas.contains("maçã"));
        frutas.forEach(fruta -> System.out.println(fruta));



    }


}
