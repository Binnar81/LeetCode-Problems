import java.util.*;
class Solution{
    public static int findMaxProfit(ArrayList<Integer> prices){
        int ans=0;
        int min=prices.get(0);
        for(int i=1;i<prices.size();i++){
            if(prices.get(i)<min){
                min=prices.get(i);
            }
            else{
                ans=Math.max(ans,prices.get(i)-min);
            }
        }
        return ans;

    }
    public static void main(String[] args){
        ArrayList<Integer> prices=new ArrayList<>(Arrays.asList(200, 120,500,100));
        int result=findMaxProfit(prices);
        System.out.println(result);
    }

}