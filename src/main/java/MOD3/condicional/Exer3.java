package condicional;
import java.util.Scanner;
/*
3) Faça um algoritmo para receber um número qualquer e
informar na tela se é par ou ímpar*/
public class Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro qualquer: ");
        int nro = sc.nextInt();
        if (nro%2 ==0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }
}
