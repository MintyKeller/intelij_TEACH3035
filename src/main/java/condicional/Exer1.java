package condicional;
import java.util.Scanner;
/*1) Faça um algoritmo que leia os valores A, B, C e imprima na
tela se a soma de A + B é menor que C.*/
public class Exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b < c) {
            System.out.println("A soma dos números A e B é menor do que o número C");
        }

    }
}
