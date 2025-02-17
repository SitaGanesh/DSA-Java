public class PrintNumberIncreasingOrder {
    public static void main(String[] args) {
        int n=10;
        printInc(n);
    }
    public static void printInc(int n){
        if (n==1){//base case
            System.out.println(1);
            return;
        }
        printInc(n-1);//work
        System.out.println(n+ " ");//inner fun call

    }
}

