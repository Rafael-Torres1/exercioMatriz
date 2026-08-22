public class Main {
    public static void main(String[] args) {
        // Declaração de duas matrizes 5x5 pré-definidas
        int[][] matrizA = {
                {3, 1, 6},
                {3, 6, 7},
                {4, 3, 1}
        };

        int[][] matrizB = {
                {1, 5,4},
                {2, 1, 6},
                {9, 1, 3}
        };

        int linhas = 3;
        int colunas = 3;

        // Matrizes para armazenar os resultados
        int[][] soma = new int[linhas][colunas];
        int[][] subtracao = new int[linhas][colunas];
        double[][] divisao = new double[linhas][colunas];

        // Processamento das três operações em um único loop
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
                subtracao[i][j] = matrizA[i][j] - matrizB[i][j];
                // Cast para double para evitar divisão inteira sem casas decimais
                divisao[i][j] = (double) matrizA[i][j] / matrizB[i][j];
            }
        }

        // Exibição dos resultados
        System.out.println("=== MATRIZ A ===");
        imprimirMatrizInt(matrizA);

        System.out.println("\n=== MATRIZ B ===");
        imprimirMatrizInt(matrizB);

        System.out.println("\n=== SOMA (A + B) ===");
        imprimirMatrizInt(soma);

        System.out.println("\n=== SUBTRAÇÃO (A - B) ===");
        imprimirMatrizInt(subtracao);

        System.out.println("\n=== DIVISÃO (A / B) ===");
        imprimirMatrizDouble(divisao);
    }

    // Método auxiliar para exibir matrizes inteiras formatadas
    private static void imprimirMatrizInt(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.printf("%5d ", valor);
            }
            System.out.println();
        }
    }

    // Método auxiliar para exibir matriz de ponto flutuante formatada com 2 casas decimais
    private static void imprimirMatrizDouble(double[][] matriz) {
        for (double[] linha : matriz) {
            for (double valor : linha) {
                System.out.printf("%6.2f ", valor);
            }
            System.out.println();
        }
    }
}