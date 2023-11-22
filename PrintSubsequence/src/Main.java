import java.util.*;
class Solution{
    public static List<String> subSequence(String s){
        List<String> ans=new ArrayList<>();
        String current="";

        solve(0,s,current,ans);
        return ans;
    }
    public static void solve(int i,String s,String current,List<String> ans){
        int n=s.length();
        if(i==n){
            ans.add(current);
            return;
        }
        solve(i+1,s,current+s.charAt(i),ans);
        solve(i+1,s,current,ans);
    }
    public static void main(String[] args){
        String s="abc";
        List<String> ans=subSequence(s);
        for(String f:ans){
            System.out.print(f+ ",");
        }
    }
}