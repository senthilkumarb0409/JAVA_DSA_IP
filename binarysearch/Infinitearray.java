package binarysearch;

public class Infinitearray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 12, 23, 45, 47, 78, 79, 89, 90, 95, 97, 100};
        int target = 89;

        System.out.println(findRange(arr, target));
    }
    static int findRange(int[] arr, int target){

        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            end = end +  (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);

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
}
