import java.util.*;
class longestPalindrome {
    int maxlen=0;
    int lo=0;
    public  String longestPalindrome(String s){
        int n=s.length();
        if(s.length()<2) {
            return s;
        }
        char[] input=s.toCharArray();
        for(int i=0;i<input.length;i++){
            expandPalindrome(input,i,i);
            expandPalindrome(input,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
    }
    public  void expandPalindrome(char[] input,int j,int k){
        while(j>=0 && k<=input.length && input[j]==input[k]){
            if(maxlen<k-j-1){
                maxlen=k-j-1;
                lo=j+1;
            }
        }
    }
    public  void main(String[] args) {
        String s="madam";
        String ans=longestPalindrome(s);
        System.out.println(ans);
    }
}