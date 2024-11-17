package recursion;
import java.util.Arrays;
public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3,7,6};
        Selectionsort(arr, arr.length, 0, 0 );
        System.out.println(Arrays.toString(arr));
        
    }
    static void Selectionsort(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }
        if(c<r){
            if(arr[c]> arr[max]){
            Selectionsort(arr, r, c+1, c);
            }else{
                Selectionsort(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            Selectionsort(arr, r-1, 0, 0);
        }
    }
}
