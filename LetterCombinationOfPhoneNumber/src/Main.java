import java.util.List;
import java.util.*;
 class Solution {
    public static List<String> letterCombinations(String a) {
        // Write your code here.
        String[] digitLetter={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        if(a.length()==0){
            return result;
        }
        result.add("");
        for(int i=0;i<a.length();i++){
            result=combine(digitLetter[a.charAt(i)-'0'],result);
        }
        return result;
    }
    public static List<String> combine(String digit,List<String> ans){
        List<String> result=new ArrayList<>();
        for(int i=0;i<digit.length();i++){
            for(String x:ans){
                result.add(x+digit.charAt(i));
            }
        }
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args){
        String a="23";
        List<String> ans=letterCombinations(a);
        System.out.print("[");
        for(String data:ans){
            System.out.print(data+ ",");
        }
        System.out.print("]");
    }
}
