public class Main {
    public static void main(String[] args) {

        int[][] A = {
                {2, 6, 1, 8},
                {3, 5, 4, 1}
        };

        int[][] B = {
                {3, 6},
                {1, 7},
                {9, 8},
                {1, 3}
        };

        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++ ){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 4; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%4d ", C[i][j]);
            }
            System.out.println();
        }
    }
}