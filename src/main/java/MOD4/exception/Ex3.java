package MOD4.exception;

import java.util.Scanner;

public class Ex3 {
    /*Exercício 3 Try-Catch-Finally
● Crie um programa que lê um número inteiro a partir de uma string.
● Use um bloco try-catch-finally para lidar com exceções
NumberFormatException.
● No bloco finally, imprima uma mensagem para garantir que o código no
bloco finally seja sempre executado, independentemente de ocorrer ou
não uma exceção.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero interio: ");
        String texto = sc.next();

        int number = 0;
        try {
                number = Integer.parseInt(texto);

        } catch (NumberFormatException exception) {
            System.out.println("Erro ao converter String para int (carácteres esperados: números)" + exception.getMessage());
        }
        finally {
            System.out.println("Bloco finally executado com sucesso!");
            System.out.println("Número final: " + number);
            sc.close();
        }
    }




}
