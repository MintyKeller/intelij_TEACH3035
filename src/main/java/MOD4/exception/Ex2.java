package MOD4.exception;
import java.util.Scanner;
public class Ex2 {
    /*Exercício 2 Try-Catch com múltiplas Exceções
● Crie um programa que tenta converter uma string em um número
inteiro.
● Use um bloco try-catch para capturar exceções NumberFormatException e
NullPointerException.
● Imprima mensagens de erro apropriadas para cada tipo de exceção.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um caractere: ");
        String texto = sc.next();

        int number = 0;
        try {

            int tamanho = texto.length();
            if (tamanho == 1) {
                number = Integer.parseInt(texto); //pra dar nullpointerexceptuion
            } else {
                System.out.println("Muito grande! Insira apenas um caractere");
                return;
            }
        } catch (NumberFormatException exception) {
            System.out.println("Erro ao converter String para int (carácteres esperados: números)" + exception.getMessage());

        } catch (NullPointerException exception) {
            System.out.println("Erro ao converter String para int (String vazia)" + exception.getMessage());
        }
        finally {
            System.out.println(number);
            sc.close();
        }
    }


}
