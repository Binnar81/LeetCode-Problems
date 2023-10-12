
//Implement atoi function (means convert the Strings into Integer number by using some rules (optimal solution)
import java.util.*;
public class Atoi {
    public static int atoiFunctionImplemention(String s) {
        int n = s.length();
        if (n == 0) return 0;
        int index = 0;
        while (index < n && s.charAt(index) ==' ') {
            ++index;
        }
        boolean isNegative=false;
        if(index<n){
            if(s.charAt(index)=='-'){
                isNegative=true;
                ++index;
            }
            else if(s.charAt(index)=='+'){
                ++index;
            }
        }
        int result=0;
        while(index<n && isDigit(s.charAt(index))){
            int digit=s.charAt(index)-'0';
            if(result>(Integer.MAX_VALUE/10) || result==(Integer.MAX_VALUE/10) && digit>7) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result=(result*10)+digit;
            ++index;
            }
        return isNegative?-result:result;
        }
        private static boolean isDigit(char ch){
        return ch>='0' && ch<='9';
    }
    public static void main(String[] args) {
        String s="123ans";
        int ans=atoiFunctionImplemention(s);
        System.out.println(ans);
    }
}


















