import java.util.* ;
import java.io.*;
 class Solution {
    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String> ans=new ArrayList<>();
        generateVerifiedParenthesis("",0,0,n,ans);
        return ans;
    }
    public static void generateVerifiedParenthesis(String current,int openCount,int closeCount,int n,ArrayList<String> result){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(openCount<n){
            generateVerifiedParenthesis(current+'(', openCount+1, closeCount, n, result);

        }
        if(closeCount<openCount){
            generateVerifiedParenthesis(current+')', openCount, closeCount+1, n, result);
        }
    }
    public static void main(String[] args){
        ArrayList<String> ans=validParenthesis(4);
        for(String info:ans){
            System.out.print(info+ " ");
        }
    }
}
