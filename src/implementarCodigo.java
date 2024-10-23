public class implementarCodigo {
    public static void main(String[] args) {
        // datos de entrada:
        int[][] matriz = { { 2, 2, 6, 4, 6, 7 },
                { 5, 6, 7, 12, 1, 1 },
                { 6, 10, 6, 12, 3, 4 },
                { 13, 5, 15, 2, 4, 5 } };
                
        // datos de salida:
        System.out.println("matriz");
        imprimirMatriz(matriz);
        int[][] matrizT;
        System.out.println("matrizT");
        matrizT = matrizTranspuesta(matriz);
        imprimirMatriz(matrizT);
    }

    public static void imprimirMatriz(int[][] mat) {
        for (int[] is : mat) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println(" ");
        }
    }

    public static int[][] matrizTranspuesta(int[][] mat) {
        int[][] mat2 = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat2[j][i]=mat[i][j];
            }
        }
        return mat2;
    }
}
