// You are given a number (eg:-2025), convert it into a String of english like "two zero two five". Use a recursive function to solve this problem.
// Note:-The digit of the number will be only in the range 0-9 and the last digit of a number can't be 0.

public class Question2 {
    public static void main(String args[]){
        int n=2025;
        digitToWordConverter(n);

    }

    static String[] unit={
        "zero","one","two","three","four","five","six","seven","eight","nine"
    };
    public static void  digitToWordConverter(int n){
        if (n==0){
            return;
        }
        int lastDigit=n%10;
        digitToWordConverter(n/10);
        System.out.print(unit[lastDigit]+" ");
        }
}

