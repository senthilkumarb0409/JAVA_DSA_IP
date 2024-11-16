package Strings;

public class stringsprac {
    public static void main(String[] args) {
        String a = "senthil";
        String b = "senthil";
        String c = b;

        System.out.println(a == b); //both values and 
        //reference variable pointing to same object
        System.out.println( a.equals(b));

        System.out.println(a == c);
        System.out.println(a.equals(c));

        String d = new String(c);
        System.out.println(a==d); //both values and reference variable
        System.out.println(a.equals(d));//only value
    }
}
