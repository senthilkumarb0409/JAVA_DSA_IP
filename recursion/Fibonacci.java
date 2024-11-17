package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 50;
        System.out.println(fibbo(n));

    }

    static int fibbo(int n){
        if(n < 2){
            return n;
        }

        return fibbo(n-1) + fibbo(n-2);
    }
}
