package condicional;

import java.util.Scanner;

/*5) Encontrar o dobro de um número caso ele seja positivo e o
seu triplo caso seja negativo, imprimindo o resultado.*/
public class Exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int nro = sc.nextInt();
        int res;
        if (nro > 0) {
            res = nro * 2;
        } else {
            res = nro * 3;
        }
        System.out.println(res);
    }
}
