public class reversible {
    public static void main(String[] args) {
        // datos de entrada:
        int[] arreglo = { 1, 4, 7, 8, 10, 8, 7, 4, 1 };

        System.out.println("arreglo");
        imprimir(arreglo);
        boolean reversible;
        reversible = testReversible(arreglo);
        System.out.println("el arreglo es reversible? " + ((reversible)? "Si":"No"));
    }

    public static void imprimir(int[] arr) {
        for (int in : arr) {
            System.out.print(in+" ");
        }
    }
    public static boolean testReversible(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
        
    }

}
