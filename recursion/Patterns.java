package recursion;

public class Patterns {
    public static void main(String[] args) {
        triangle(4, 0);
        ntriangle(4, 0);
    }

    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if( c < r){
            System.out.print("* ");
            triangle(r, c + 1);
        }else{
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void ntriangle(int r, int c){
        if(r == 0){
            return;
        }
        if( c < r){
            ntriangle(r, c + 1);
            System.out.print("* ");
            
        }else{
            ntriangle(r - 1, 0);
            System.out.println();
           
        }
    }
}
