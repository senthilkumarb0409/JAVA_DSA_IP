package binarysearch;

public class FindMounArr {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;

        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsthalf = orderBs(arr, target, 0, peak);
        if(firsthalf != -1){
            return firsthalf;
        }

        return orderBs(arr, target, peak + 1, arr.length -1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderBs(int[] arr, int target ,int start, int end){
        

        //sorted in ascending or descending

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
        return -1;

    }
}
