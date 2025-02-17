public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="chhaava";
        duplicatesR(str, new boolean[26], 0, new StringBuilder(""));
    }
    public static void duplicatesR(String str, boolean map[],int idx,StringBuilder newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            duplicatesR(str, map, idx+1, newStr);
        }
        else{
            map[currChar-'a']=true;
            duplicatesR(str, map, idx+1, newStr.append(currChar));
        }
    }
}
