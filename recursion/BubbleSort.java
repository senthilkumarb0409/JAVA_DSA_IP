package recursion;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {2,3,1,4,5};
        Bubblesort(arr, arr.length-1, 0);
        String ans = Arrays.toString(arr);
        System.out.println(ans);
    }
    static void Bubblesort(int[]arr ,int r, int c){
        if(r == 0){
            return;
        }
        if( c < r){
  
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Bubblesort(arr,r, c + 1);
            
            
        }else{
            Bubblesort(arr,r - 1, 0);
            
           
        }
    }

}
