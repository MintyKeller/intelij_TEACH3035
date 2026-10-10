package condicional;
import java.util.Scanner;
/*4) Faça um algoritmo que leia dois valores inteiros A e B se
os valores forem iguais deverá se somar os dois, caso
contrário multiplique A por B. Ao final de qualquer um dos
cálculos deve-se atribuir o resultado para uma variável C e
mostrar seu conteúdo na tela.*/
public class Exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        if (a==b) {
            c = a + b;
        } else {
            c = a * b;
        }
        System.out.println(c);
    }
}
