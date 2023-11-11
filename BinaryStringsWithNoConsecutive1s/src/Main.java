 import java.util.*;
class Solution {
    public static List<String> generateStrings(int N){
        List<String> ans=new ArrayList<>();
        generateBinaryStrings("",N,ans);
        return ans;
    }
    public static void generateBinaryStrings(String current, int remaining,List<String> result){
        if(remaining==0){
            result.add(current);
            return;
        }
        generateBinaryStrings(current +'0',remaining-1,result);
        if(current.isEmpty() || current.charAt(current.length()-1)=='0'){
            generateBinaryStrings(current+'1',remaining-1,result);
        }
    }
    public static void main(String[] args) {
        List<String> ans=generateStrings(3);
        for(String binaryString:ans){
            System.out.print(binaryString+ " ");
        }
    }
}