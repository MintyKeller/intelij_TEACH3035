package repeticoes;
import java.util.Scanner;

public class Exer3 {
    /*4) Crie um algoritmo que receba idade de 5 pessoas, em
seguida printar na tela o total de pessoas que têm idade maior
que 18 anos.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        for( int i = 0; i<5; i++) {
            System.out.println("Insira a idade da pessoa nro " + (i+1));
            int  idade = sc.nextInt();
            if (idade>18) {
                contador ++;
            }
        }
        System.out.println("Nro de pessoas com mais de 18 anos: " + contador);
    }

}
