package binarysearch;
import java.util.*;
public class Binarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int middle = start + (end - start) / 2;
            if(target < arr[middle]){
                end = middle - 1;
            }
            else if(target > arr[middle]){
                start = middle + 1;
            }
            else{
                return middle;
            }

        }
        return -1;

    }

    
}
