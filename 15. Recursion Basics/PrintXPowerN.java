public class PrintXPowerN {
    public static void main(String[] args) {
        int n=10;
        int x=2;
        System.out.println(xPowerN(x, n));
    }
    public static int xPowerN(int x,int n){
        if(n==0){
            return 1;
        }
        int fnm1=xPowerN(x, n-1);
        int xn=x*fnm1;
        return xn;
    }
}
