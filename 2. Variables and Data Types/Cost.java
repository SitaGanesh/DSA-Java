import java.util.Scanner;

public class Cost{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total= pencil+pen+eraser;

        float gst=total*(18f/100f);

        System.out.println("The cost of Pencil is:"+pencil);
        System.out.println("The cost of Pen is:"+pen);
        System.out.println("The cost of eraser is:"+eraser);
        System.out.println("The total is :"+total);

        System.out.println("After GST:"+gst);
    }
}