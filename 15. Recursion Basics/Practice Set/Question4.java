// We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same charater.

// Sample Input: S= 'abcab'
// Sample Output: 7
// There are 15 substring of "abcab":a,ab,abc,abca,abcab,b,bc,bca,bcab,c,ca,cab,a,ab,b
// Out of the above substrings, there are 7 substrings: a,abca,b,bcab,c,a,and b. So only 7 contiguous substring start and end with the same character

// Sample Input 2: S="aba"
// Sample Output 2:4
// The substrings are a,b,a and aba
public class Question4 {
    public static void main(String[] args) {
        String str="abc";
        int n=str.length();
        System.out.println(substring(str, 0, n-1, n));
    }
    public static int substring(String str,int i,int j,int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int res=substring(str, i+1, j, n-1)+substring(str, i, j-1, n-1)-substring(str, i+1, j-1, n-2);
        if(str.charAt(i)==str.charAt(j)){
            res++;
        } 
        return res;
    }
}
