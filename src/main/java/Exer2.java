import java.util.Scanner;


public class Exer2 {

    /*Exercício 2- Peça para que usuário informe números, através do
    Scanner, e faça algum tipo de cálculo. Podendo qualquer uma das
    operações aprendidas em aula, em seguida printar o resultado no
    console.      */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira dois números inteiros para soma: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println(soma);

    }
}
