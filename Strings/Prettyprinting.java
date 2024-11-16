package Strings;

public class Prettyprinting {
    public static void main(String[] args) {


        /*
         * %c - character
         * %d - decimal number
         * %e - exponential float number
         * %i - Integer base10
         * %o - octal
         * %s - string
         * %u - unsigned decimal
         * %x - hexadecimal
         * %t - data/time
         * %n - new line
         */
        float a = 453.12345f;
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();
        System.out.printf("The value of pi is " + "%.2f",Math.PI  );
        System.out.println();
        System.out.printf("Hi, My name is %s and i have %s Laptop", "Senthil Kumar.B", "Lenovo IdeapadGaming");
    }
}
