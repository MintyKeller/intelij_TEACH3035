package sequencial;

import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {
        /*Exercício 1- Peça para que o usuário informe seu nome e idade,
    logo após print no console as informações de uma forma
    explicativa.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nome = sc.next();
        System.out.println("Insira a sua idade:");
        int idade = sc.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);





    }
}
