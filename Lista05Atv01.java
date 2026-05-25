/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santony
 */
import java.util.Scanner;

public class Lista05Atv01 {

    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;

    public Lista05Atv01(String nome, String sobrenome, int idade,
                        double altura, double peso) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void calculaIMC() {
        imc = peso / (altura * altura);
    }

    public String informaObesidade() {

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade Grau I";
        } else if (imc < 40) {
            return "Obesidade Grau II";
        } else {
            return "Obesidade Grau III";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        Lista05Atv01 pessoa =
                new Lista05Atv01(nome, sobrenome, idade, altura, peso);

        pessoa.calculaIMC();

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Nome: " + pessoa.nome + " " + pessoa.sobrenome);
        System.out.printf("IMC: %.2f\n", pessoa.imc);
        System.out.println("Classificação: "
                + pessoa.informaObesidade());

        sc.close();
    }
}