public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n=20;
        System.out.println(sumNNumber(n));
    }
    public static int sumNNumber(int n){
        if(n==1){
            return 1;
        }
        int fnm1=sumNNumber(n-1);
        int fn=n+fnm1;
        return fn;
    }
}
