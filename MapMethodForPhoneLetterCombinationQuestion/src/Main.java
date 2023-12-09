 import java.util.*;
class Solution {
    public static List<String> letterCombination(String a){
        Map<Character,String> map=new HashMap<>();
        map.put('0',"");
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> ans=new ArrayList<>();
        combine(map,ans,0,"",a);
        return ans;

    }
    public static void combine(Map<Character,String> map,List<String> ans,int num,String temp,String str){
        if (str.length() == num) {
ans.add(temp);
return;
        }
        String s=map.get(str.charAt(num));
        for(int i=0;i<s.length();i++){
            combine(map,ans,num+1,temp+s.charAt(i),str);
        }
    }
    public static void main(String[] args) {
        String a="23";
        List<String> ans=letterCombination(a);
        System.out.print("[");
        for(String data:ans){
            System.out.print(data+ "]" );
            System.out.print(",");
        }
    }
}