import java.util.*;
class Solution{
    public static int GetNumberOfIslands(int[][] mat){
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    helper(mat,i,j);
                    count++;
                }
            }
        } return count;
    }
    private static void helper(int[][] mat, int i,int j){
        int rows=mat.length;
        int cols=mat[0].length;
        if(i<0||i>=rows||j<0||j>=cols||mat[i][j]!=1){
            return;
        }
        mat[i][j]=2;
        helper(mat,i+1,j);
        helper(mat,i+1,j+1);
        helper(mat,i,j+1);
        helper(mat,i-1,j+1);
        helper(mat,i-1,j);
        helper(mat,i-1,j-1);
        helper(mat,i,j-1);
        helper(mat,i+1,j-1);

    }
    public static void main(String[] args){
        int[][] mat={
                {0, 1, 1, 0, 0},
                { 1, 0, 0 ,1 ,0},
                {0, 0, 1, 0, 0},
                { 1, 0, 0, 0, 1}
        };
        int ans=GetNumberOfIslands(mat);
        System.out.println(ans);
    }
}