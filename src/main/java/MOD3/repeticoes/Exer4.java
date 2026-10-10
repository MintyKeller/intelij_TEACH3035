package repeticoes;
import java.util.Scanner;

public class Exer4 {
    /* 3) Crie um algoritmo que lê do usuário um número de 1 a 10,
em seguida, usando laço de repetição print a tabuada do
número digitado..*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um nro de 1 a 10: ");
        int n = sc.nextInt();
        System.out.println("==========TABUADA DE " + n +" ===========");
        for(int i =1; i<=10; i++){
            System.out.println(n +" x " + i + "= " + (n*i));
        }

    }
}
