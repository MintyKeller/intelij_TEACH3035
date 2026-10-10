package condicional;
import java.util.Scanner;
/*6) Faça um algoritmo que leia uma variável e some 5 caso
seja par ou some 8 caso seja ímpar, imprimir o resultado
desta operação..*/
public class Exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro qualquer: ");
        int nro = sc.nextInt();
        if (nro%2 ==0) { //nro eh par
            System.out.println(nro + 5);
        } else { // nro eh impar
            System.out.println(nro + 8);
        }
    }
}

