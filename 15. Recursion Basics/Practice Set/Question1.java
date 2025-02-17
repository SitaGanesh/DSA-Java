//For a given integer array of size N. You have to find all the occrrence (indices) of a given element (key) and point them.
// Use a recursive function to solve this problem.
public class Question1 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        printAllOccurrence(arr, key, 0);
        System.out.println();
        allOccurrence(arr,key,0,new StringBuilder(""));
    }
    //same as first occurrence problw, where we are returning the i, but here we wont return but we print them.
    public static void printAllOccurrence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printAllOccurrence(arr,key,i+1);
    }
    //Using string builder 
    public static void allOccurrence(int arr[],int key,int i,StringBuilder str){
        if(i==arr.length){
            System.out.println(str);
            return;
        }
        if(arr[i]==key){
            str.append(i+" ");
            
        }
        allOccurrence(arr,key,i+1,str);
    }
}
