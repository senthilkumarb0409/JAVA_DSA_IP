package patterns;

public class triangle {
    public static void main(String[] args) {
        rightstriangle(5);
        leftStringle(5);
        rightnstriangle(5);
        rightpointedtriangle(5);
    }
    static void rightstriangle(int n){
        for(int row= 1; row <=n; row++){
            for(int col= 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void leftStringle(int n){
        for(int row= 1; row <=n; row++){
            for(int col=1;col <= n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }

    static void rightnstriangle(int n){
        for(int row= 1; row <=n; row++){
            for(int col= 1;col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void rightpointedtriangle(int n){
        for (int i = 0;i< 2 * n;i++){
            int c = i > n ? 2 * n - i  : i;
            for(int j =0; j< c;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
