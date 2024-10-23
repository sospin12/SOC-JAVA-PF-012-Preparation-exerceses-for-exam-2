import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el tamaño del arreglo: ");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        int num = scan.nextInt();
        System.out.println("El numero de coincidensias es de: " + contNum(arr1,num));
        scan.close();
    }

    public static int contNum(int[] arr, int num) {
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                cont++;
            }
        }
        return cont;
    }
}
