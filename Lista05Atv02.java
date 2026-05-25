/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santony
 */
import java.util.Scanner;

public class Lista05Atv02 {

    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    // Construtor
    public Lista05Atv02(String nome, int idade, int coragem,
                        int inteligencia, int ambicao,
                        int lealdade, int estrategia,
                        int criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    // Método para calcular a casa
    public void calcularCasa() {

        int grifinoria = (2 * coragem) + lealdade;

        int sonserina = (2 * ambicao) + estrategia;

        int corvinal = (2 * inteligencia) + criatividade;

        int lufalufa = ((2 * lealdade) + coragem) / 3;

        int maior = grifinoria;

        casa = "Grifinória";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {

        System.out.println("\n===== RESULTADO =====");

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Casa escolhida: " + casa);
    }

    // Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String continuar;

        do {

            System.out.println("\n===== CHAPÉU SELETOR =====");

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Coragem: ");
            int coragem = Integer.parseInt(sc.nextLine());

            System.out.print("Inteligência: ");
            int inteligencia = Integer.parseInt(sc.nextLine());

            System.out.print("Ambição: ");
            int ambicao = Integer.parseInt(sc.nextLine());

            System.out.print("Lealdade: ");
            int lealdade = Integer.parseInt(sc.nextLine());

            System.out.print("Estratégia: ");
            int estrategia = Integer.parseInt(sc.nextLine());

            System.out.print("Criatividade: ");
            int criatividade = Integer.parseInt(sc.nextLine());

            // Criando objeto
            Lista05Atv02 aluno = new Lista05Atv02(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            // Calculando casa
            aluno.calcularCasa();

            // Exibindo resultado
            aluno.exibirInformacoes();

            System.out.print("\nDeseja cadastrar outro aluno? (s/n): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nPrograma encerrado!");

        sc.close();
    }
}