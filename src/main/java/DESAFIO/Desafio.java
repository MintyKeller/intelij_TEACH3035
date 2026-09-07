package DESAFIO;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Desafio {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Integer> historico = new ArrayList<>();
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Integer> tipos = new ArrayList<>();
    static String[] nomesTipos = {"Fácil", "Médio", "Difícil", "Sequência"};
    static int[] limites = {50, 100, 200, 50};
    static int[] tentativasMaximas = {10, 7, 5, 10};
    static int[] pontuacoesBase = {100, 200, 300, 400};
    static int[] descontoPorTentativa = {-5, -10, -15, -10};

    public static void main(String[] args) {

        int escolha;
        int tipo;
        System.out.println("Olá!! Seja bem vindo :)");
        do {
            System.out.printf("Escolha: \n 1) Iniciar Novo Jogo \n 2) Ver Regras \n 3) Ver Históricos de Pontuação \n 0) Sair");
             escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.printf("Escolha o tipo de jogo : \n 1) Fácil \n 2) Médio \n 3) Difícil \n 4) Extra (Sequencial) \n 0) Voltar\n Para mais informações acesse \"Ver Regras\"");
                    tipo = sc.nextInt();
                    switch (tipo) {
                        case 1:
                            System.out.println("Bem vindo ao GuessTheNumber - Fácil Version ;) ");
                            preComparacao(tipo);
                            break;
                        case 2:
                            System.out.println("Bem vindo ao GuessTheNumber - Médio Version ;) ");
                            preComparacao(tipo);                            break;
                        case 3:
                            System.out.println("Bem vindo ao GuessTheNumber - Difícil Version ;) ");
                            preComparacao(tipo);                            break;
                        case 4:
                            System.out.println("Bem vindo ao GuessTheNumber - Sequecial Version ;) ");
                            //modoSequencia(tipo);
                            break;
                        case 0:
                            System.out.println("Voltando...");
                            break;
                        default:
                            printaDefault();
                            break;
                    }


                    break;
                case 2:
                    System.out.println("==========REGRAS==========");
                    int lerRegra;
                    do {
                        System.out.printf("\nO que quer ler? \n1) Níveis de Dificuldade \n 2) Sistema de Pontuação \n 3) Sistema de Dicas \n 0) Voltar");
                        lerRegra = sc.nextInt();
                        switch (lerRegra) {
                            case 1:
                                System.out.println("==========Níveis de Dificuldade==========");
                                System.out.printf(" ? Fácil: Adivinhar um número entre 1 e 50, com 10 tentativas \n" +
                                        "? Médio: Adivinhar um número entre 1 e 100, com 7 tentativas\n" +
                                        "? Difícil: Adivinhar um número entre 1 e 200, com 5 tentativas \n" +
                                        "? Sequencia: Advinhar TRÊS nros entre 1 a 50");
                                break;
                            case 2:
                                System.out.println("==========Sistema de Pontuação:==========");
                                System.out.println("==========Pontuação Base por Tipo:==========");
                                System.out.printf(" -Fácil (100)\n -Médio (200)\n -Difícil (300)");
                                System.out.println("\n==========Descontos:==========");
                                System.out.println("A cada tentativa usada, são descontados pontos");
                                System.out.printf(" -Fácil (-5 per tentativa)\n -Médio (-10 per tentativa)\n -Difícil (-15 per tentativa)");
                                System.out.println("\n==========Bônus:==========");
                                System.out.println("Bônus por conclusão rápida: +50 pontos para cada tentativa não utilizada");
                                break;
                            case 3:
                                System.out.println("==========Sistema de Dicas:==========");
                                System.out.printf(" -Dica de paridade (par/ímpar): -10 pontos\n" +
                                        " -Dica de intervalo (metade superior/inferior): -20 pontos\n" +
                                        " -Dica de proximidade (quente/frio): -15 pontos");
                                break;
                            case 0:
                                System.out.println("Voltando...");
                                break;
                            default:
                                printaDefault();
                                break;

                        }

                    } while(lerRegra!=0);
                    break;
                case 3:
                    System.out.println("==========Histórico==========");
                    printaHistorico();
                    System.out.println("==========Sistema de Records:==========");
                    System.out.println("P.S: dos últimos 10 históricos");
                    System.out.println("Insira o tipo da categoria:  \n1) Fácil  \n2)Médio \n3)Difícil \n4)Sequência \n0)Voltar");
                    int categoria = sc.nextInt();
                    switch (categoria){
                        case 1:
                            System.out.println("==========CATEGORIA FÁCIL==========");
                            mostrarPodio(categoria);
                            break;
                        case 2:
                            System.out.println("==========CATEGORIA MÉDIA==========");
                            mostrarPodio(categoria);
                            break;
                        case 3:
                            System.out.println("==========CATEGORIA DIFÍCIL==========");
                            mostrarPodio(categoria);
                            break;
                        case 4:
                            System.out.println("==========CATEGORIA SEQUÊNCIA==========");
                            mostrarPodio(categoria);
                            break;
                        case 0:
                            System.out.println("Voltando...");
                            break;
                        default:
                            printaDefault();
                            break;

                    }
                    break;
                case 0:
                    System.out.println("Tchauuu!  ⸜(ˊᗜˋ)⸝");
                    break;
                default:
                    printaDefault();
                    break;
            }

        } while (escolha!=0);

    }

    public static void printaDefault() {
        System.out.println("Escolha inválida, tente novamente.  (๑• . •๑)？ ");
        System.out.print("Voltando... ");
    }

    public static void printaHistorico() {
        if (historico.isEmpty() ) {
            System.out.println("O histórico está vazio  ( ╥﹏╥ )");
        } else {
            for (int i = 0; i < 10; i++) {
                //aqui o chat me ajudou
                if (i >= historico.size()) {
                    System.out.println((i + 1) + ") VAZIO");
                } else if (historico.get(i) == 0) {
                    String tipo = nomesTipos[(tipos.get(i) -1)];
                    System.out.println((i + 1) + ") " + nomes.get(i) + " Pontuação Zerada viiish (o_O) - " + tipo);
                } else {
                    String tipo = nomesTipos[(tipos.get(i) -1)];
                    System.out.println((i + 1) + ") " + nomes.get(i) + " - " + historico.get(i)+ "- " + tipo);
                }
            }
        }
    }

    public static void preComparacao(int tipo) {
        int nroSorteado = random.nextInt(limites[(tipo-1)]) + 1;
        int maxTentativas = tentativasMaximas[(tipo-1)];
        int contadorTentativas = 0;
        boolean errou = false;
        String tentativa;
        String nroSorteadoString = String.valueOf(nroSorteado);
        String tentativaAnterior = "Nenhuma";
        System.out.println("Para \"Ver Dicas\" escreva \"dicas\" logo após \"Chute um nro:\"");
        do{
            if(contadorTentativas==maxTentativas){
                System.out.println("Acabaste as tentativas");
                tentativa = nroSorteadoString;
                errou = true;
            } else {
                System.out.println("Tentativa nº " + (contadorTentativas+1));
                System.out.println("Chute um nro: ");
                tentativa = sc.next();
                if(!tentativa.equals("dicas")) {
                    contadorTentativas++;
                    tentativaAnterior = tentativa;
                    compararNros(tentativa,nroSorteado );
                } else {
                    if (tentativaAnterior.equals("Nenhuma")) {
                        System.out.println("Você precisa fazer uma tentativa primeiro!");
                    } else {
                        int tentativaAnteriorInt = Integer.parseInt(tentativaAnterior);
                        verDicas(tentativaAnteriorInt, nroSorteado, tipo);
                    }
                }
            }
        }while(!tentativa.equals(nroSorteadoString));
        pontuar(tipo, contadorTentativas, errou);

    }

    public static void compararNros(String tentativa, int nroSorteado) {
        int tentativaInt = Integer.parseInt(tentativa);
        if (tentativaInt < nroSorteado) {
            System.out.println("MAIOR");
        } else if (tentativaInt > nroSorteado) {
            System.out.println("MENOR");
        } else {
            System.out.println("Você acertou! O número é " + tentativa);
        }
    }

    public static void pontuar(int tipo, int contadorTentativas, boolean errou) {
        if (!errou) {
            int pontuacao = pontuacoesBase[(tipo-1)];
            int maxTentativas = tentativasMaximas[(tipo-1)];
            //calcular o desconto, pela quantidade de tentativas utilizadas
            int desconto = contadorTentativas * descontoPorTentativa[(tipo-1)];
            //calcular o bônus, pela quanridade de tentativas NÃO utilizadas
            int bonus = (maxTentativas-contadorTentativas) *50;
            pontuacao = pontuacao + desconto + bonus;
            String nome = lerNome();
            System.out.printf("Olá, "+ nome +"Sua pontuação é: " + pontuacao + "!! \n Confira no histórico!");
            //aqui o chat me ajudou
            if (historico.size() == 10 && nomes.size()==10 && tipos.size()==10 ) {
                historico.remove(0);
                nomes.remove(0);
                tipos.remove(0);
            }
            historico.add(pontuacao);
            nomes.add(nome);
            tipos.add(tipo);
        } else {
            System.out.println("Você perdeu... ( ╥﹏╥ )");
            int pontuacao = 0;
            String nome = lerNome();
            if (historico.size() == 10 && nomes.size()==10 && tipos.size()==10 ) {
                historico.remove(0);
                nomes.remove(0);
                tipos.remove(0);
            }
            historico.add(pontuacao);
            nomes.add(nome);
            tipos.add(tipo);
        }


    }

    public static String lerNome() {
        System.out.println("Insira seu nome: (utilize apenas 4 letras)");
        String nome = sc.next().toUpperCase();

        while (nome.length() != 4 || !nome.matches("[A-Z]+")) {
            System.out.println("Nome inválido! Digite exatamente 4 letras:");
            nome = sc.next().toUpperCase();
        }

        return nome;
    }

    public static void verMetade(final int VALOR_CENTRAL, int nroSorteado){
        if(nroSorteado<VALOR_CENTRAL){
            System.out.println("O nro sorteado está na metade inferior");
        } else if(nroSorteado>VALOR_CENTRAL){
            System.out.println("O nro sorteado esta na metade superior");
        } else {
            //o numero eh o valor do meio, caso raro
            System.out.println("Eu não vou dizer, mas essa foi uma boa dica pra escolher nesse caso específico...shhhh (￣b￣)");
        }
    }

    public static void verDicas(int tentativaAnterior,int nroSorteado, int tipo) {
        System.out.println("==========DICAS==========");
        System.out.printf("Digite para: \n 1)Dica de paridade (par/ímpar) \n 2)Dica de intervalo (metade superior/inferior) \n3)Dica de proximidade (quente/frio) \n 0)Voltar");
        int escolha = sc.nextInt();
        // ve o tipo e pega o maximo escopo
        int limiteDoNivel;
        if(tipo ==1) {
            //facil
            limiteDoNivel = 50; //se quiser mudar o escopo dos niveis
        } else if (tipo==2) {
            //medio
            limiteDoNivel = 100;
        } else  {
            //dificil
            limiteDoNivel = 200;
        }

        switch (escolha){
            case 1:
                System.out.println("========PARIDADE=========");
                if((nroSorteado%2)==0){
                    System.out.println("O nro sorteado é par!");
                } else {
                    System.out.println("O nro sorteado é ímpar!");
                }
                break;
            case 2:
                System.out.println("========INTERVALO=========");
                    final int VALOR_CENTRAL = limiteDoNivel/2;
                    verMetade(VALOR_CENTRAL, nroSorteado);
                break;
            case 3:
                System.out.println("========PROXIMIDADE=========");
                System.out.println("========================================");
                System.out.println("         TABELA DE PROXIMIDADE           ");
                System.out.println("========================================");
                System.out.println(" • Fácil   - Até 10 números de distância");
                System.out.println(" • Médio   - Até 20 números de distância");
                System.out.println(" • Difícil - Até 40 números de distância");
                System.out.println("========================================");
                int distancia = Math.abs(nroSorteado - tentativaAnterior); //devolve o modulo
                int margemQuente = (limiteDoNivel *20)/100; //20% de todos os niveis
                if (distancia<=margemQuente) {
                    System.out.println("Está quente!");
                } else {
                    System.out.println("Está frio!");
                }
                break;
            case 0:
                System.out.println("Voltando...");
                break;
            default:
                printaDefault();
                break;

        }


    }

    public static void  mostrarPodio(int categoria) {
        if (historico.isEmpty() ) {
            System.out.println("O histórico está vazio  ( ╥﹏╥ )");
        } else {
            //id das posições do podio
            int primeiro = -1;
            int segundo = -1;
            int terceiro = -1;
            //passa pelo índices
            for (int i = 0; i < historico.size(); i++) {
                //pega apenas o da categoria desejada
                if (tipos.get(i) == categoria) {
                    int pontuacaoAtual = historico.get(i);
                    //se nao tem ngm OU se a pontuação atual analisada é maior que o prmiero colocado
                    if (primeiro == -1 || pontuacaoAtual > historico.get(primeiro)) {
                        terceiro = segundo; //empurra os outros pra baixo
                        segundo = primeiro;
                        primeiro = i; // o id do primeiro vai ser o id anaslisado
                    } else if (segundo == -1 || pontuacaoAtual > historico.get(segundo)) {
                        terceiro = segundo;
                        segundo = i;
                    } else if (terceiro == -1 || pontuacaoAtual > historico.get(terceiro)) {
                        terceiro = i;
                    } // se nao for nenhum, igonra



                }

            }

            System.out.println("=============PÓDIO==============");
            //PRIMEIRO LUGAR
            if(primeiro == -1){
                System.out.println("Primeiro lugar: VAZIO");
            }else {
                System.out.println("Primeiro lugar: " + nomes.get(primeiro) + " - "  + historico.get(primeiro)) ;
            }
            //SEGUNDO LUGAR
            if(segundo == -1){
                System.out.println("Segundo lugar: VAZIO");
            }else {
                System.out.println("Segundo lugar: " + nomes.get(segundo) + " - " + historico.get(segundo));
            }
            //TERCEIRO LUGAR
            if(terceiro == -1){
                System.out.println("Terceiro lugar: VAZIO");
            }else {
                System.out.println("Terceiro lugar: " + nomes.get(terceiro)+ " - " + historico.get(terceiro));
            }
        }

    }

//    public static void modoSequencia(int tipo) {
//        int[] sequencia = new int[3];
//        //preenche o array com os nros aleatorios criados (entre 1 e 50)
//        for (int i = 0; i < 3; i++) {
//            sequencia[i] = random.nextInt(50) + 1;
//        }
//        int maxTentativas = tentativasMaximas[(tipo-1)];
//        int contadorTentativas = 0;
//        String tentativaAnterior = "Nenhuma";
//        System.out.println("Para \"Ver Dicas\" escreva \"dicas\" logo após \"Chute um nro:\"");
//        for (int i = 0; i < sequencia.length; i++) {
//            boolean acertou = false;
//            while (!acertou) {
//                if(contadorTentativas==maxTentativas){
//
//                } else {
//                    System.out.println("Tentativa nº " + (contadorTentativas+1));
//                    System.out.println("Número " + (i + 1) + " de 3");
//                    System.out.println("Chute um número: ");
//                    String tentativa = sc.next();
//                    if(!tentativa.equals("dicas")) {
//                        contadorTentativas++;
//                        tentativaAnterior = tentativa;
//                    } else {
//
//                    }
//                }
//
//                contadorTentativas++;
//
//
//
//
//
//
//
//
//
//
//
//                if (tentativa < sequencia[i]) {
//                    System.out.println("MAIOR");
//                } else if (tentativa > sequencia[i]) {
//                    System.out.println("MENOR");
//                } else {
//                    System.out.println("Você acertou! 🎉");
//                    acertou = true;
//                }
//                System.out.println();
//            }
//        }
//    }

}


