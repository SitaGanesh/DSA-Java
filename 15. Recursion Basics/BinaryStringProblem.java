public class BinaryStringProblem {
    public static void main(String[] args) {
        int n=10;
        binaryString(n, "", 0);
    }
    public static void binaryString(int n,String str,int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1, str+"0", 0);
        if(lastPlace==0){
            binaryString(n-1, str+"1", 1);
        }
    }
}
