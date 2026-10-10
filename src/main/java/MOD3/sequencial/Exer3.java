package sequencial;

import java.util.Locale;

import java.util.Scanner;

public class Exer3 {
    /*Exercício 3- Peça para que usuário informe seu salário através
    da Classe Scanner, em seguida use o “printf()” para formatar o
    salário com 2 casas decimais após a vírgula, com Locale do
    Brasil.*/
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu salário: ");
            float salario = sc.nextFloat();
        System.out.printf(new Locale("pt", "BR"), "Salário: R$%.2f " , salario);

    }
}
