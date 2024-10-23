public class ejercicio3 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,4,1,2},{1,4,5,4}}; // INITIALIZED MATRIZ
        imprimirMatriz(matriz); 
        invertirDiags(matriz); 
        imprimirMatriz(matriz); 
    }
    public static void invertirDiags(int[][] matriz) {//SWITCH THE VALUES OF THE DIAGONAL
        int size2 = matriz[0].length;
        int temp = 0; // TEMPORAL VARIABLE

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                temp=0;
                if (i==j){
                    temp = matriz[i][j]; //STORE DE VALUE OF THE ORGINAR VALUE
                    matriz[i][j] = matriz[i][size2-1-j];
                    matriz[i][matriz[0].length-1-j]=temp;// SWITCH THE VALUE
                }
            }
        }
    }
    public static void imprimirMatriz(int[][] matriz) {// PRINT MATRIZ
        System.out.println("\n Imprimiendo matriz: ");
        for (int[] is : matriz) {
            for (int is2 : is) {
                System.out.print(is2+ " ");
            }
            System.out.println(" ");
        }
    }    
}
