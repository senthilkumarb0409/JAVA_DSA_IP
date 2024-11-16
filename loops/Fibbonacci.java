package loops;

import java.util.*;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int p = 0;
        int i = 1;
        int count = 2;
        System.out.print(p + ",");
        System.out.print(i);
        while(count <= n){
            int temp = i;
            i = i + p;
            p = temp;
            System.out.print("," + i);
            count++;
            
        }
        
    }
}
