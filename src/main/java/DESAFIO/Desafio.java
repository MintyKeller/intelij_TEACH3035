package DESAFIO;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Desafio {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    //arrays
    static ArrayList<Integer> historico = new ArrayList<>();
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Integer> tipos = new ArrayList<>();
    static String[] nomesTipos = {"Fácil", "Médio", "Difícil", "Sequência"};
    static int[] limites = {50, 100, 200, 50};
    static int[] tentativasMaximas = {10, 7, 5, 25};
    static int[] pontuacoesBase = {100, 200, 300, 400};
    static int[] descontoPorTentativa = {-5, -10, -15, -10};
    private static final String[] MENSAGENS_BOAS_VINDAS = {
            "Bem vindo ao GuessTheNumber - Fácil Version ;) ",
            "Bem vindo ao GuessTheNumber - Médio Version ;) ",
            "Bem vindo ao GuessTheNumber - Difícil Version ;) "
    };

    public static void main(String[] args) {
        int escolha;
        int tipo;
        System.out.println("Olá!! Seja bem vindo :)");
        do {
            System.out.printf("\nEscolha: \n 1) Iniciar Novo Jogo \n 2) Ver Regras \n 3) Ver Históricos de Pontuação \n 0) Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    escolherTipo();
                    break;
                case 2:
                    System.out.println("==========REGRAS==========");
                    verRegras();
                    break;
                case 3:
                    menuHistorico();
                    break;
                case 0:
                    System.out.println("Tchauuu!  ⸜(ˊᗜˋ)⸝");
                    break;
                default:
                    printaDefault();
                    break;
            }
        } while (escolha != 0);
        sc.close();
    }


    //funções do main:

    public static void escolherTipo() {
        System.out.printf("\nEscolha o tipo de jogo : \n 1) Fácil \n 2) Médio \n 3) Difícil \n 4) Extra (Sequencial) \n 0) Voltar\n");
        int tipo = sc.nextInt();
        if (tipo >= 1 && tipo <= 3) {
            System.out.println(MENSAGENS_BOAS_VINDAS[tipo - 1]);
            preComparacao(tipo);
        } else if (tipo == 4) {
            System.out.println("Bem vindo ao GuessTheNumber - Sequencial Version ;) ");
            modoSequencia(tipo);
        } else if (tipo == 0) {
            System.out.println("Voltando...");
        } else {
            printaDefault();
        }
    }

    public static void verRegras() {
        int lerRegra;
        do {
            System.out.printf("\nO que quer ler? \n1) Níveis de Dificuldade \n 2) Sistema de Pontuação \n 3) Sistema de Dicas \n 0) Voltar\n");
            lerRegra = sc.nextInt();
            switch (lerRegra) {
                case 1:
                    System.out.println("==========Níveis de Dificuldade==========");
                    System.out.printf(" ? Fácil: Adivinhar um número entre 1 e 50, com 10 tentativas \n" +
                            "? Médio: Adivinhar um número entre 1 e 100, com 7 tentativas\n" +
                            "? Difícil: Adivinhar um número entre 1 e 200, com 5 tentativas \n");
                    System.out.println("==========Modo Sequência (EXTRA)==========");
                    System.out.printf(
                            "No modo Sequência, três números são sorteados entre 1 e 50.\n" +
                                    "O jogador deve descobrir os três números em até 25 tentativas no total.\n" +
                                    "As tentativas são compartilhadas entre os três números.\n" +
                                    "Ao acertar um número, o jogo passa para o próximo da sequência.\n" +
                                    "Caso as 25 tentativas acabem antes de descobrir os três números, " +
                                    "o jogador perde e recebe 0 pontos.\n" +
                                    "A pontuação só é concedida quando os três números são descobertos.");
                    break;
                case 2:
                    System.out.println("==========Sistema de Pontuação:==========");
                    System.out.println("==========Pontuação Base por Tipo:==========");
                    System.out.printf(" -Fácil (100)\n -Médio (200)\n -Difícil (300) \n -Sequência (400)");
                    System.out.println("\n==========Descontos:==========");
                    System.out.println("A cada tentativa usada, são descontados pontos");
                    System.out.printf(" -Fácil (-5 per tentativa)\n -Médio (-10 per tentativa)\n -Difícil (-15 per tentativa) \n -Sequência (-10 per tentativa)");
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
        } while (lerRegra != 0);
    }

    public static void menuHistorico() {
        System.out.println("==========Histórico==========");
        printaHistorico();

        System.out.println("==========Sistema de Records:==========");
        System.out.println("P.S: dos últimos 10 históricos");
        System.out.println("Insira o tipo da categoria:  \n1) Fácil  \n2)Médio \n3)Difícil \n4)Sequência \n0)Voltar");
        int categoria = sc.nextInt();

        if (categoria >= 1 && categoria <= 4) {
            System.out.println("==========CATEGORIA " + nomesTipos[categoria - 1].toUpperCase() + "==========");
            mostrarPodio(categoria);
        } else if (categoria == 0) {
            System.out.println("Voltando...");
        } else {
            printaDefault();
        }
    }

    public static void printaDefault() {
        System.out.println("Escolha inválida, tente novamente.  (๑• . •๑)？ ");
        System.out.print("Voltando... ");
    }

    public static void printaHistorico() {
        if (historico.isEmpty()) {
            System.out.println("O histórico está vazio  ( ╥﹏╥ )");
            return;
        }
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            if (i >= historico.size()) {
                System.out.println(num + ") VAZIO");
                continue;
            }
            String tipo = nomesTipos[tipos.get(i) - 1];
            String status = (historico.get(i) == 0)
                    ? "Pontuação Zerada viiish (o_O)"
                    : String.valueOf(historico.get(i));
            System.out.println(num + ") " + nomes.get(i) + " - " + status + " - " + tipo);
        }
    }

    public static void preComparacao(int tipo) {
        int nroSorteado = random.nextInt(limites[(tipo - 1)]) + 1;
        int maxTentativas = tentativasMaximas[(tipo - 1)];
        int contadorTentativas = 0;
        int custoDicas = 0;
        boolean errou = false;
        String tentativaAnterior = "Nenhuma";
        System.out.println("Para \"Ver Dicas\" escreva \"dicas\" logo após \"Chute um nro:\"");
        while (true) {
            if (contadorTentativas == maxTentativas) {
                System.out.println("Acabaste as tentativas");
                errou = true;
                break;
            }
            System.out.println("Tentativa nº " + (contadorTentativas + 1));
            System.out.println("Chute um nro: ");
            String tentativa = sc.next();
            if (tentativa.equalsIgnoreCase("dicas")) {
                if (tentativaAnterior.equals("Nenhuma")) {
                    System.out.println("Você precisa fazer uma tentativa primeiro!");
                } else {
                    custoDicas += verDicas(Integer.parseInt(tentativaAnterior), nroSorteado, tipo);
                }
                continue;
            }
            if (!tentativa.matches("\\d+")) {
                System.out.println("Digite apenas números! (ou \"dicas\")");
                continue;
            }
            contadorTentativas++;
            tentativaAnterior = tentativa;
            String mensagem = "Você acertou! O número é " + tentativa;
            if (compararNros(tentativa, nroSorteado, mensagem)) {
                break; // acertou
            }
        }
        pontuar(tipo, contadorTentativas, errou, custoDicas);
    }

    public static boolean compararNros(String tentativa, int alvo, String mensagemAcerto) {
        int tentativaInt = Integer.parseInt(tentativa);
        if (tentativaInt < alvo) {
            System.out.println("MAIOR");
            return false;
        } else if (tentativaInt > alvo) {
            System.out.println("MENOR");
            return false;
        } else {
            System.out.println(mensagemAcerto);
            return true;
        }
    }

    public static void pontuar(int tipo, int contadorTentativas, boolean errou, int custoDicas) {
        if (!errou) {
            int pontuacao = pontuacoesBase[(tipo - 1)];
            int maxTentativas = tentativasMaximas[(tipo - 1)];
            //calcular o desconto, pela quantidade de tentativas utilizadas
            int desconto = contadorTentativas * descontoPorTentativa[(tipo - 1)];
            //calcular o bônus, pela quanridade de tentativas NÃO utilizadas
            int bonus = (maxTentativas - contadorTentativas) * 50;
            pontuacao = pontuacao + desconto + bonus + custoDicas;
            String nome = lerNome();
            System.out.printf("Olá, " + nome + ". Sua pontuação é: " + pontuacao + "!! \n Confira no histórico!");
            //aqui o chat me ajudou
           inserirNoHistorico(pontuacao, nome, tipo);
        } else {
            System.out.println("Você perdeu... ( ╥﹏╥ )");
            int pontuacao = 0;
            String nome = lerNome();
            inserirNoHistorico(pontuacao, nome, tipo);
        }
    }
    public static void inserirNoHistorico(int pontuacao, String nome, int tipo) {
        if (historico.size() == 10 && nomes.size() == 10 && tipos.size() == 10) {
            historico.remove(0);
            nomes.remove(0);
            tipos.remove(0);
        }
        historico.add(pontuacao);
        nomes.add(nome);
        tipos.add(tipo);
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

    public static void verMetade(final int VALOR_CENTRAL, int nroSorteado) {
        if (nroSorteado < VALOR_CENTRAL) {
            System.out.println("O nro sorteado está na metade inferior");
        } else if (nroSorteado > VALOR_CENTRAL) {
            System.out.println("O nro sorteado esta na metade superior");
        } else {
            //o numero eh o valor do meio, caso raro
            System.out.println("Eu não vou dizer, mas essa foi uma boa dica pra escolher nesse caso específico...shhhh (￣b￣)");
        }
    }

    public static int verDicas(int tentativaAnterior, int nroSorteado, int tipo) {
        int custo = 0;
        System.out.println("==========DICAS==========");
        System.out.printf("Digite para: \n 1)Dica de paridade (par/ímpar) \n 2)Dica de intervalo (metade superior/inferior) \n3)Dica de proximidade (quente/frio) \n 0)Voltar");
        int escolha = sc.nextInt();
        // ve o tipo e pega o maximo escopo
        int limiteDoNivel = limites[tipo - 1];
        switch (escolha) {
            case 1:
                System.out.println("========PARIDADE=========");
                if ((nroSorteado % 2) == 0) {
                    System.out.println("O nro sorteado é par!");
                } else {
                    System.out.println("O nro sorteado é ímpar!");
                }
                custo = -10;
                break;
            case 2:
                System.out.println("========INTERVALO=========");
                final int VALOR_CENTRAL = limiteDoNivel / 2;
                verMetade(VALOR_CENTRAL, nroSorteado);
                custo = -20;
                break;
            case 3:
                System.out.println("========PROXIMIDADE=========");
                System.out.println("========================================");
                System.out.println("         TABELA DE PROXIMIDADE           ");
                System.out.println("========================================");
                System.out.println(" • Fácil e Sequência   - Até 10 números de distância");
                System.out.println(" • Médio   - Até 20 números de distância");
                System.out.println(" • Difícil - Até 40 números de distância");
                System.out.println("========================================");
                int distancia = Math.abs(nroSorteado - tentativaAnterior); //devolve o modulo
                int margemQuente = (limiteDoNivel * 20) / 100; //20% de todos os niveis
                if (distancia <= margemQuente) {
                    System.out.println("Está quente!");
                } else {
                    System.out.println("Está frio!");
                }
                custo = -15;
                break;
            case 0:
                System.out.println("Voltando...");
                break;
            default:
                printaDefault();
                break;
        }
        return custo;
    }

    public static void mostrarPodio(int categoria) {
        if (historico.isEmpty()) {
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
            if (primeiro == -1) {
                System.out.println("Primeiro lugar: VAZIO");
            } else {
                System.out.println("Primeiro lugar: " + nomes.get(primeiro) + " - " + historico.get(primeiro));
            }
            //SEGUNDO LUGAR
            if (segundo == -1) {
                System.out.println("Segundo lugar: VAZIO");
            } else {
                System.out.println("Segundo lugar: " + nomes.get(segundo) + " - " + historico.get(segundo));
            }
            //TERCEIRO LUGAR
            if (terceiro == -1) {
                System.out.println("Terceiro lugar: VAZIO");
            } else {
                System.out.println("Terceiro lugar: " + nomes.get(terceiro) + " - " + historico.get(terceiro));
            }
        }

    }

    public static void modoSequencia(int tipo) {
        int[] sequencia = new int[3];
        //preenche o array com os nros aleatorios criados (entre 1 e 50)
        for (int i = 0; i < 3; i++) {
            sequencia[i] = random.nextInt(50) + 1;
        }
        int maxTentativas = tentativasMaximas[(tipo - 1)];
        int contadorTentativas = 0;
        boolean errou = false;
        int custoDicas = 0;
        System.out.println("Para \"Ver Dicas\" escreva \"dicas\" logo após \"Chute um nro:\"");
        for (int i = 0; i < sequencia.length && !errou; i++) {
            String tentativaAnterior = "Nenhuma";
            while (true) {
                if (contadorTentativas == maxTentativas) {
                    System.out.println("Acabaste as tentativas");
                    errou = true;
                    break;
                }
                System.out.println("Tentativa nº " + (contadorTentativas + 1));
                System.out.println("Número " + (i + 1) + " de 3");
                System.out.println("Chute um número: ");
                String tentativa = sc.next();
                if (tentativa.equalsIgnoreCase("dicas")) {
                    if (tentativaAnterior.equals("Nenhuma")) {
                        System.out.println("Você precisa fazer uma tentativa primeiro!");
                    } else {
                        custoDicas += verDicas(Integer.parseInt(tentativaAnterior), sequencia[i], tipo);
                    }
                    continue;
                }
                if (!tentativa.matches("\\d+")) {
                    System.out.println("Digite apenas números! (ou \"dicas\")");
                    continue;
                }
                contadorTentativas++;
                tentativaAnterior = tentativa;
                String mensagem = "Você acertou! O nro nº " + (i + 1) + " é o nro " + tentativa;
                if (compararNros(tentativa, sequencia[i], mensagem)) {
                    break; // acertou este número, passa pro próximo da sequência
                }
            }
        }

        pontuar(4, contadorTentativas, errou, custoDicas);
    }
}


