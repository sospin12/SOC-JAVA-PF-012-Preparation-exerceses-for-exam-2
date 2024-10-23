public class reversible {
    public static void main(String[] args) {
        int[] arreglo = { 1, 4, 7, 8, 10, 8, 7, 4, 1 }; //DEFINED STATIC ARRAY

        System.out.println("arreglo");
        imprimir(arreglo);
        boolean reversible;
        reversible = testReversible(arreglo);
        System.out.println("el arreglo es reversible? " + ((reversible)? "Si":"No"));//PRINT WITH IF CONDITION.
    }

    public static void imprimir(int[] arr) {// PRINT STATIC ARRAY WITH FORACH CODE ITERATIVE CONTROL
        for (int in : arr) {
            System.out.print(in+" ");
        }
    }
    public static boolean testReversible(int[] arr) {//INPUT: integer static array, OUTPUT: boolean value. TEST IF REVERSIBLE
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=arr[arr.length-1-i]) return false;// IF COMPARING THE FIST VALUE WITH THE LAST, IF DIFERENT RETURN FALSE
        }
        return true;
    }

}
