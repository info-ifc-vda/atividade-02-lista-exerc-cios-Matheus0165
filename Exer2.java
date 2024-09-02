package br.edu.ifcvideira.lista2;

import java.util.Arrays;

public class Exer2 {
	public static void main(String[] args) {
		int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        int[] NaoComuns = gerarVetor(vetor1, vetor2);

        System.out.println("Vetor 1: " + Arrays.toString(vetor1));
        System.out.println("Vetor 2: " + Arrays.toString(vetor2));
        System.out.println("Vetor não comuns: " + Arrays.toString(NaoComuns));
    }

    public static int[] gerarVetor(int[] vetor1, int[] vetor2) {
        int[] vetNaoComun = new int[vetor1.length + vetor2.length];
        int indice = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (!estaNoVetor(vetor2, vetor1[i])) {
                vetNaoComun[indice++] = vetor1[i];
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
            if (!estaNoVetor(vetor1, vetor2[i])) {
                vetNaoComun[indice++] = vetor2[i];
            }
        }
        
        int[] novoVet = new int[indice];
        System.arraycopy(vetNaoComun, 0, novoVet, 0, indice);

        return novoVet;
    }
    
    public static boolean estaNoVetor(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;

	}

}
