import java.util.*;
class Solution
{
    public static int uniqueSubstrings(String input)
    {
        //write your code here
        int i=0,j=0,max=0;
        Set<Character> set=new HashSet<>();
        while(j<input.length()){
            if(!set.contains(input.charAt(j))){
                set.add(input.charAt(j++));
                max=Math.max(max,set.size());
            }
            else{
                set.remove(input.charAt(i++));
            }

        } return max;
    }
    public static void main(String[] args){
        String input="sanjay";
        int ans=uniqueSubstrings(input);
        System.out.println(ans);
    }
}
