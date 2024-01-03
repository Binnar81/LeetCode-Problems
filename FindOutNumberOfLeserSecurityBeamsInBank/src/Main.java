import java.util.*;
class Solution{
    public static int NumberOfLesers(String[] bank){
        int rows=bank.length;
        int cols=bank[0].length();
        int numLesers=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(bank[i].charAt(j)=='1'){
                    numLesers+=helper(bank,i+1);
                }
            }
        } return numLesers;

    }
    private static int helper(String[] bank,int row){
        int rows=bank.length;
        int cols=bank[0].length();
        int securityDevices=0;
        if(row>=rows){
            return 0;
        }
        for(int i=0;i<cols;i++){
            if(bank[row].charAt(i)=='1'){
                securityDevices++;
            }
        }
        if(securityDevices==0){
            securityDevices+=helper(bank,row+1);
        } return securityDevices;
    }
    public static void main(String[] args){
        String[] bank={"011001","000000","010100","001000"};
        int ans=NumberOfLesers(bank);
        System.out.println(ans);
    }
}