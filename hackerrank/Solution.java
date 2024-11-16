
import java.util.*;

public class Solution {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int[][] arr = new int[q][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]= input.nextInt();
            }
        }
        input.close();
        for(int i=0;i<arr.length;i++){
            int a = arr[i][0];
            int b = arr[i][1];
            int n = arr[i][2]; 
            int current = a;  
            int diff = b; 

            for(int j=0; j<n;j++){
                current += diff ;  
                System.out.print(current + " "); 
                diff *= 2 ;  
                }
                System.out.println();
            }
            
        }
    }


