public class FirstOccurance {
    public static void main(String[] args) {
        int arr[]={3,3,5,6,3,5,8,4,2,3,1};
        int key=9;
        System.out.println(isOccured(arr, 0, key));
    }
    public static int isOccured(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return isOccured(arr, i+1, key);
    }
}
