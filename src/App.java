
public class App { //00:14:33.21 
    public static void main(String[] args) throws Exception {
        int n = 10;
        int[] arr = new int[n];
        llenarArreglo(arr);
        imprimirArreglo(arr);

    }

    public static void llenarArreglo(int[] arr) {
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = cont2;
                cont2++;
            } else {
                arr[i] = arr.length - 1 - cont;
                cont++;
            }

        }

    }

    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
}
