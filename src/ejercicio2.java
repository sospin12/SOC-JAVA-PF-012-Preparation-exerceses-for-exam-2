import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {//MAIN CODE
        //INITIALIZING OBJECTS
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del arreglo: ");        //INPUT THE ARRAY LENGTH
        int n = scan.nextInt();

        int[] arr1 = new int[n]; // CREATING AN STATIC ARRAY (OBJECT) OF INTEGER WITH 'n' LENGTH
        int num = scan.nextInt();

        System.out.println("El numero de coincidensias es de: " + contNum(arr1,num)); // CALLING THE METHOD IN THE OBJECT SYSTEM.OUT
        scan.close();
    }

    public static int contNum(int[] arr, int num) { // COUNT THE NUMBER OF TIMA CONCIDENCES ARE INT THE ARRAY STORED IN 'cont'
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                cont++;
            }
        }
        return cont;
    }
}
