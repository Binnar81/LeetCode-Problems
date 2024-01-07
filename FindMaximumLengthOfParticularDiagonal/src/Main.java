import java.util.*;
class Solution {
    public static int findMaxAreaOfRectangle(int[][] dimensions) {
        int maxArea = Integer.MIN_VALUE;
        double maxDiagonalLength = Double.MIN_VALUE;
        for (int i = 0; i < dimensions.length; i++) {
            double DiagonalLength = Math.sqrt(dimensions[i][0] * dimensions[i][1]);
            if (DiagonalLength > maxDiagonalLength) {
                maxDiagonalLength = DiagonalLength;
                maxArea = dimensions[i][0] * dimensions[i][1];
            } else if (DiagonalLength == maxDiagonalLength) {
                maxDiagonalLength = Math.max(maxDiagonalLength, Math.sqrt(dimensions[i][0] * dimensions[i][1]));
                maxArea = dimensions[i][0] * dimensions[i][1];
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] dimensions = {{2, 8}, {2, 5}};
        int ans = findMaxAreaOfRectangle(dimensions);
        System.out.println(ans);
    }

}