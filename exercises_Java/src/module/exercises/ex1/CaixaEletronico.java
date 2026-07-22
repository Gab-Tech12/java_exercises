package module.exercises.ex1;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n----- BANCO DIGITAL -----");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar Valor");
            System.out.println("3. Sacar Valor");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double valorDeposito = scanner.nextDouble();

                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.printf("Depósito realizado! Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Valor inválido para depósito.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido para saque.");
                    } else if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$ %.2f\n", saldo);
                    } else {
                        System.out.println("Erro: Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o Banco Digital. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Digite um número de 1 a 4.");
                    break;
            }
        }
        scanner.close();
    }
}
