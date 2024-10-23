
public class App { //00:14:33.21 
    public static void main(String[] args) throws Exception {//MAIN
        //DEFINING VARIABLES: 
        int n = 10;// THE LENGTH OF THE ARRAY 'n'
        int[] arr = new int[n];

        //FUNTION CALL AND EXCECUTION
        llenarArreglo(arr); 
        imprimirArreglo(arr);

    }

    public static void llenarArreglo(int[] arr) {// FILL THE ARRAY
        //THIS FUNCTION FILL THE ARRAY STARTING TO DECREASE THE HIGHES NUMBER, 
        // THEN INCREASING FROM THE LOWER NOMBRE AND SO ON

        //DEFINING VARIABLES 
        int cont = 0;
        int cont2 = 0;

        //FOR LOOP TO MOVE TRHU ALL THE POSITION OF THE STATIC ARRAY.
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { //IF THE POSITION IS ODD THEN START DECREASING
                arr[i] = cont2;
                cont2++;
            } else {// IF THE POSITION IS EVEN STAT INCREASIONG
                arr[i] = arr.length - 1 - cont;
                cont++;
            }

        }

    }

    // PRINT ARRAY WITH FOREACH, THIS WAY WE OPTIMIZE THE CODE    
    public static void imprimirArreglo(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

    }
}
