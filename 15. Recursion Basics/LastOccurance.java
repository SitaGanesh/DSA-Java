public class LastOccurance {
    public static void main(String[] args) {
        int arr[]={1,7,4,3,6,3,2,5,6,7,4,3};
        int key=4;
        System.out.println(isOccuredLast(arr, 0, key));
    }
    public static int isOccuredLast(int arr[],int i, int key){
        if(i==arr.length-1){
            return -1;
        }
        int isFound=isOccuredLast(arr, i+1, key);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
}
