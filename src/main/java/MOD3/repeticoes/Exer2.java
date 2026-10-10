package repeticoes;

import java.util.Random;
import java.util.Scanner;

public class Exer2 {
    /*2) Crie um número “Randomicamente” usando a classe
Random do java, em seguida crie um algoritmo usando um
laço de repetição onde o usuário vai digitar um número
qualquer. O laço deve encerrar quando o usuário acertar o
número criado randomicamente. Para dar dicas ao usuário,
printar na tela “MAIOR” quando o número randômico for
menor que o número digitado pelo usuário, caso contrário
printar na tela “MENOR”.*/
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        //sorteia o nro de 1 a 100
        int nroSorteado = random.nextInt(100) + 1;
        int tentativa; //o nro sorteado eh sempre maior q zero por causa do +1

        do {
            System.out.println("Chute um nro: ");
            tentativa = sc.nextInt();
            if(tentativa<nroSorteado) {
                System.out.println("MENOR");
            } else if (tentativa>nroSorteado){
                System.out.println("MAIOR");
            }
        } while (tentativa!=nroSorteado);
        System.out.println("Acertou, o nro é: " + tentativa);



    }


}
