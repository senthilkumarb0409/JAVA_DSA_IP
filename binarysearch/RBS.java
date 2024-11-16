package binarysearch;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int target = 3;
        System.out.println(search(arr, target));
        
    }
    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        if(pivot == -1){
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);


    }

    static int binarySearch(int[] arr, int target, int start, int end){
        

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

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) /2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid+1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
