package br.edu.ifcvideira.lista2;

public class Exer5 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {4, 8, 1, 6, 3};

        int[] vetorSomaPares = calcularVetorSomaPares(vetor1, vetor2);
        int[] vetorDivisoresImpares = calcularVetorDivisoresImpares(vetor1, vetor2);

        System.out.println("Vetor 1: " + formatArray(vetor1));
        System.out.println("Vetor 2: " + formatArray(vetor2));
        System.out.println("Vetor soma pares: " + formatArray(vetorSomaPares));
        System.out.println("Vetor divisores ímpares: " + formatArray(vetorDivisoresImpares));
    }

    public static int[] calcularVetorSomaPares(int[] vetor1, int[] vetor2) {
        int[] vetorSomaPares = new int[vetor1.length];
        int indice = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 == 0) {
                int soma = vetor1[i];
                for (int j = 0; j < vetor2.length; j++) {
                    soma += vetor2[j];
                }
                vetorSomaPares[indice++] = soma;
            }
        }
        int[] vetorSomaParesRedimensionado = new int[indice];
        System.arraycopy(vetorSomaPares, 0, vetorSomaParesRedimensionado, 0, indice);

        return vetorSomaParesRedimensionado;
    }

    public static int[] calcularVetorDivisoresImpares(int[] vetor1, int[] vetor2) {
        int[] vetorDivisoresImpares = new int[vetor1.length];
        int indice = 0;

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] % 2 != 0) {
                int divisores = 0;
                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor1[i] % vetor2[j] == 0) {
                        divisores++;
                    }
                }
                vetorDivisoresImpares[indice++] = divisores;
            }
        }

        int[] vetorDivisoresImparesRedimensionado = new int[indice];
        System.arraycopy(vetorDivisoresImpares, 0, vetorDivisoresImparesRedimensionado, 0, indice);

        return vetorDivisoresImparesRedimensionado;
    }

    public static String formatArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
