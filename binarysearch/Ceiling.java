package binarysearch;

import java.util.*;

public class Ceiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        sc.close();
        int ans = CbinarySearch(arr , target);
        System.out.println(ans);
    }
    
    static int CbinarySearch(int[] arr, int target){

        if (target > arr.length - 1){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int middle = start + (end - start) / 2;
            
            if(arr[middle] == target){
                return middle;
            }

            if(isAsc){
                if(target < arr[middle]){
                    end = middle - 1;
                }
                if(target > arr[middle]){
                    start = middle + 1;
                }
            }

            else{
                if(target > arr[middle]){
                    end = middle - 1;
                }
                if(target < arr[middle]){
                    start = middle + 1;
                }
            }


        }
        if(isAsc){
            return start;
        }
        else{
            return end;
        }

    }
}

