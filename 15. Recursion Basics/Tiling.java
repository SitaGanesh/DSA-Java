public class Tiling {
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=tiling(n-1);
        int fnm2=tiling(n-2);
        int result=fnm1+fnm2;
        return result;
    }
}
