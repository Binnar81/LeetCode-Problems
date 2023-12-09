 import java.util.*;
class Solution {
    public static List<List<String>> partition(String s){
        List<List<String>> ans=new ArrayList<>();
        List<String> list=new ArrayList<>();
        call(ans,0,list,s);
        return ans;
    }
    public static void call(List<List<String>> ans,int index,List<String> list,String s){
        if(index==s.length()){
            ans.add(new ArrayList<>(list));
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s.substring(index,i+1))){
                list.add(s.substring(index,i+1));
                call(ans,i+1,list,s);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean isPalindrome(String s){
        String a=new StringBuilder(s).reverse().toString();
        if(a.equals(s)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       String s="aab";
       List<List<String>> ans=partition(s);
       for( List<String> data:ans){
           System.out.print("[");
           for(String info:data){
               System.out.print(info+ ",");
           }
           System.out.print("]");
       }
        System.out.println();
    }
}