public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorialPrint(n));
    }
    public static int factorialPrint(int n){
        if(n==1){
            return 1;
        }
        int fnm1=factorialPrint(n-1);
        int fn=n*fnm1;
        return fn;
    }
}
