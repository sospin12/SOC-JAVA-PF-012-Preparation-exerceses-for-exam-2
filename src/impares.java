import java.util.ArrayList;

public class impares {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        ArrayList<Integer> newArr = buscarImpares(arr);
        System.out.println(newArr);


    }
    public static ArrayList<Integer> buscarImpares(int[] arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
    
}
