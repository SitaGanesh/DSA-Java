// Write a program to find the Length of a String uning recursion.

public class Question3 {
    public static void main(String[] args) {
        System.out.println(stringLength("Ganesh"));
    }
    public static int stringLength(String str){
        if(str.length()==0){
            return 0;
        }
        return stringLength(str.substring(1))+1;
    }
}
