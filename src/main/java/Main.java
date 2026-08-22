public class Main {
    public static void main(String[] args) {
        // Declração de matriz A (2x4)
        int[][] A = {
                {2, 6, 1, 8},
                {3, 5, 4, 1}
        };

        // Declaração de matriz N (4x2)
        int[][] B = {
                {3, 6},
                {1, 7},
                {9, 8},
                {1, 3}
        };

        // Declração da matriz que armazena linha e coluna de A e B
        int[][] C = new int[2][2];

        // Laço de repetição responsável pela multiplicação da linha A pela coluna B
        for (int i = 0; i < 2; i++ ){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 4; k++){
                    // Multiplicação armazenada na variável C
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Laço de repetição responsável por mostrar no terminal o resultado da multiplicação
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%4d ", C[i][j]);
            }
            System.out.println();
        }
    }
}