package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o código da conta " + (i + 1) + ": ");
            codigos[i] = in.nextInt();
            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldos[i] = in.nextDouble();
        }

        for (;;) {
            System.out.println("Menu:");
            System.out.println("1. fazer depósito");
            System.out.println("2. saque");
            System.out.println("3. Consultar saldo bancario");
            System.out.println("4. Finalizar ");
            System.out.print("Digite a opção desejada: ");
            int opcao = in.nextInt();

            if (opcao == 1) {
                deposito(codigos, saldos, in);
            } else if (opcao == 2) {
                saque(codigos, saldos, in);
            } else if (opcao == 3) {
                saldoDoBanco(saldos);
            } else if (opcao == 4) {
                System.out.println("Programa finalizado.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        in.close();
    }

    public static void deposito(int[] codigos, double[] saldos, Scanner in) {
        System.out.print("Digite o código da conta para o depósito: ");
        int codigo = in.nextInt();
        System.out.print("Digite o valor do depósito: ");
        double valor = in.nextDouble();

        int indice = encontrarIndice(codigos, codigo);
        if (indice != -1) {
            saldos[indice] += valor;
            System.out.println("Depósito realizado com sucesso.");
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void saque(int[] codigos, double[] saldos, Scanner in) {
        System.out.print("Digite o código da conta para saque: ");
        int codigo = in.nextInt();
        System.out.print("Digite o valor do saque: ");
        double valor = in.nextDouble();

        int indice = encontrarIndice(codigos, codigo);
        if (indice != -1) {
            if (saldos[indice] >= valor) {
                saldos[indice] -= valor;
                System.out.println("Saque realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    public static void saldoDoBanco(double[] saldos) {
        double saldoBanco = 0;
        for (double saldo : saldos) {
            saldoBanco += saldo;
        }
        System.out.println("Saldo do banco: R$ " + saldoBanco);
    }

    public static int encontrarIndice(int[] codigos, int codigo) {
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                return i;
            }
        }
        return -1;
    }
}
