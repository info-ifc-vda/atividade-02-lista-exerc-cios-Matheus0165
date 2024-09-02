package br.edu.ifcvideira.lista2;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int linhasImpressas = 0;

        while (true) {
            System.out.print("Digite um valor (ou 0/negativo para sair): ");
            double valor = in.nextDouble();

            if (valor <= 0) {
                break;
            }
            if (linhasImpressas % 20 == 0) {
                imprimir();
            }
            
            calculoRaiz(valor);
            linhasImpressas++;
        }

        in.close();
    }

    public static void imprimir() {
        System.out.printf("%10s | %10s | %15s\n", "Valor", "Cubo", "Raiz Quadrada");
    }
    
    public static void calculoRaiz(double valor) {
        double cubo = Math.pow(valor, 3);
        double raizQuadrada = Math.sqrt(valor);
        System.out.printf("%10.2f | %10.2f | %15.4f\n", valor, cubo, raizQuadrada);
    }
}
