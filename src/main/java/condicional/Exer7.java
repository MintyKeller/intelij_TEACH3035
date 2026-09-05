package condicional;
import java.util.Scanner;
/*7) Escreva um algoritmo que leia três valores inteiros e
diferentes e mostre-os em ordem decrescente.*/
public class Exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira três números inteiros diferentes: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a maior que todas
        if (a>b && a>c && b>c) { //abc
            System.out.println(a + ", " + b + ", " + c);
            return;
        }
        if (a>b && a>c && b<c) { //acb
            System.out.println(a + ", " + c + ", " + b);
            return;
        }
        //b maior que todas
        if (a<b && a>c && b>c) { //bac
            System.out.println(b + ", " + a + ", " + c);
            return;
        }
        if (a<b && a<c && b>c) { //bca
            System.out.println(b + ", " + c + ", " + a);
            return;
        }
        //c maior que todas
        if (a>b && a<c && b<c){ //cab
            System.out.println(c + ", " + a + ", " + b);
            return;
        }
        if (a<b && a<c && b<c){ //cba
            System.out.println(c + ", " + b + ", " + a);
        }

    }
}
