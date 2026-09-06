package repeticoes;
import java.util.Scanner;
public class Exer5 {
    /*5) Crie um algoritmo que receba um número do usuário,
depois printar na tela todos os números pares até o número
digitado.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um nro natural: ");
        int nro = sc.nextInt();
        if(nro ==1 || nro ==0) {
            System.out.println("Nenhum par até " + nro);
        }
        for (int i = 2; i<nro; i = i+2) {
            System.out.println(i);
        }
    }
}
