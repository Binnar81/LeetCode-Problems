 import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> combinationSum(int k, int n){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        helper(ans,1,new ArrayList<>(),0,k,n);
        return ans;
    }
    public static void helper(ArrayList<ArrayList<Integer>> ans,int num,ArrayList<Integer> list,int sum,int k,int n){
        if(k==0 && sum==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=num;i<=9;i++){
            sum+=i;
            list.add(i);
            helper(ans,i+1,list,sum,k-1,n);
            sum-=i;
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> ans=combinationSum(3,7);
       for(ArrayList<Integer> data:ans){
           System.out.print("[");
           for(int info:data){
               System.out.print(info+ ",");
           }
           System.out.print("]");
       }
    }
}