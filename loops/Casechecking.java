package loops;
import java.util.*;
public class Casechecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);

        sc.close();

        if(ch >= 'a' && ch <= 'z' ){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
    
}
