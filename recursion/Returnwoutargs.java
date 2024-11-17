package recursion;

import java.util.ArrayList;

public class Returnwoutargs {
    public static void main(String[] args) {
        int[] arr = {23,44,55,66,77,88,99,88};
        System.out.print(ArrayListLsearch(arr, 88, 0));
        
    }

    static ArrayList<Integer> ArrayListLsearch(int[] arr,int target,int index){
        ArrayList<Integer> List = new ArrayList<>();
        if(index == arr.length){
            return List;
        }
        
        if(arr[index] == target){
            List.add(index);
        }

        ArrayList<Integer> ans= ArrayListLsearch(arr, target, index + 1);
        List.addAll(ans);
        return List;
    }
}
