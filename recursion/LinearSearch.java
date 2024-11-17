package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23,45,56,99,99};
        System.out.println(Lsearch(arr, 99, 0));

        //using List variable to store arraylist
        AllLsearch(arr, 99, 0);
        System.out.println(List);

        //return output as arraylist
        System.out.println(ArrayListLsearch(arr, 99, 0, new ArrayList<>()));
    }   

    static int Lsearch(int[] arr,int target,int index){
        if(index == arr.length){
            return -1 ;
        }

        if(arr[index] == target){
            return index;
        }

        return  Lsearch(arr, target, index + 1);
    }
    //all the occurences of target in the list to a list

    static ArrayList<Integer> List = new ArrayList<>();
    static void AllLsearch(int[] arr,int target,int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            List.add(index);
        }

        AllLsearch(arr, target, index + 1);
    }

    //arraylist return 

    static ArrayList<Integer> ArrayListLsearch(int[] arr,int target,int index, ArrayList<Integer> List1){
        if(index == arr.length){
            return List1;
        }

        if(arr[index] == target){
            List1.add(index);
        }

        return ArrayListLsearch(arr, target, index + 1, List1);
    }
}
