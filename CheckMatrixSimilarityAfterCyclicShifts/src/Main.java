 class Solution {
     public static boolean areSimilar(int[][] mat, int k) {
         for (int[] L : mat) {
             int n=L.length;
             for(int i=0;i<n;i++){
                 if(L[i]!=L[(i+k)%n]){
                     return false;
                 }
             }
         } return true;
     }
         public static void main (String[]args){
             int[][]mat={{1,2,1,2},{5,5,5,5},{6,3,6,3}};
             boolean ans=areSimilar(mat,2);
             System.out.println(ans);
         }
     }
