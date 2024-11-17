package recursion;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {23,34,45,56,78};
        int target = 78;
        int s = 0;
        int e =  arr.length - 1;
        System.out.println(search(arr, target, s, e));
    }

    static int search(int[] arr, int target, int s, int e){
            if(s > e){
                return -1;
            }

            int mid = s + (e - s) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                return search(arr, target, s, mid - 1);
            }
            return search(arr, target, mid + 1, e);
    }
}
