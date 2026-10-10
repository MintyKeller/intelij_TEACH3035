package MOD4.collection;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;

public class Exer2 {

    /*Exercício 2 HashSet
● Crie um HashSet de cores e adicione pelo menos 5 cores a ele.
● Imprima o tamanho do HashSet.
● Tente adicionar uma cor que já existe no conjunto. Como o HashSet lida
com elementos duplicados?
● Remova uma cor do conjunto.
● Verifique se uma cor específica está no conjunto.
● Itere sobre o conjunto e imprima todas as cores.*/

    public static void main(String[] args) {
        HashSet<String> cores = new HashSet<>();
        cores.add("azul");
        cores.add("amarelo");
        cores.add("verde");
        cores.add("vermelho");
        cores.add("laranja");

        //duplicado ignorado:
        cores.add("azul");

        cores.remove("laranja");
        System.out.println("O set contém a cor azul?: " + cores.contains("azul"));

        cores.forEach(cor -> System.out.println(cor));
    }

}
