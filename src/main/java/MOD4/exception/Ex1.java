package MOD4.exception;

import java.util.Scanner;

public class Ex1 {
    /*Exercício 1 Try-Catch Básico
● Crie um programa que divide dois números inteiros.
● Use um bloco try-catch para capturar exceções de divisão por zero
(ArithmeticException).
● Imprima uma mensagem de erro apropriada caso ocorra uma exceção*/



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, insira dois números inteiros para fazer a divisão:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int divisao =0;
        try {
            divisao = a/b;
        } catch (ArithmeticException exception) {
            System.out.println("Erro ao dividir por zero: " + exception.getMessage());
        }

    }




}
