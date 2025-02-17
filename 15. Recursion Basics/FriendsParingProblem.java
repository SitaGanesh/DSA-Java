public class FriendsParingProblem {
    public static void main(String[] args) {
        int n=3;
        System.out.println(friendPair(n));
    }
    public static int friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=friendPair(n-1);
        int fnm2=friendPair(n-2);
        int pair=(n-1)*fnm2;
        int result=fnm1+pair;

        return result;
    }
}
