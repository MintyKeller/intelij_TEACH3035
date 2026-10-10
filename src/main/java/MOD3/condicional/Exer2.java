package condicional;
import java.util.Scanner;
/*
2) Faça um algoritmo que leia o nome, o sexo e o estado civil
de uma pessoa. Caso sexo seja “F” e estado civil seja
“CASADA”, solicitar o tempo de casada (anos).*/
public class Exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira os seguintes dados: ");
        System.out.println("Nome: ");
        String nome = sc.next();
        System.out.println("Sexo: (F/M)");
        String sexo = sc.next();
        System.out.println("Estado civil: ");
        String estadoCivil = sc.next();

        if (sexo.toLowerCase() == "F" && estadoCivil.toUpperCase() =="CASADA") {
            System.out.println("Tempo de casada: ");

        }
    }
}
