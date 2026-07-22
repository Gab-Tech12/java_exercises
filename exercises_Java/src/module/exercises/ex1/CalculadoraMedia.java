package module.exercises.ex1;

import java.util.Scanner;


public class CalculadoraMedia {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;
        int quantidadeNotas = 0;
        double nota = 0;

        System.out.println("--- CALCULADORA DE MÉDIA ---");
        System.out.println("Digite as notas do aluno (0 a 10).");
        System.out.println("Digite um número negativo (ex: -1) para encerrar e calcular a média.\n");

        while (true) {
            System.out.print("Digite uma nota: ");
            nota = scanner.nextDouble();

        if (nota < 0) {
            break;
        }
        if (nota <= 10 ){
            somaNotas += nota;
            quantidadeNotas++;
        } else {
            System.out.println("Nota Inválida! Digite valores entre 0 a 10.");
        }
    }
    if (quantidadeNotas > 0 ) {
        double media = somaNotas / quantidadeNotas;

        System.out.println("\n-----------------------------");
        System.out.println("Total de notas inseridas: " + quantidadeNotas);
        System.out.printf("Média final: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO!");
        } else {
            System.out.println("Status: EM RECUPERAÇÃO!");
        }

    } else {
        System.out.println("\nNenhuma nota válida foi inserida");
    }
    scanner.close();
    }
}
