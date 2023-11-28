 class Solution {
        public static int flipBits(int A, int B){
            // Write your code here.
            int xor = A ^ B; // XOR of A and B will give us the differing bits

            int count = 0;



            // Count the number of set bits in the XOR result

            while (xor != 0) {

                if ((xor & 1) == 1) {

                    count++;

                }

                xor >>= 1; // Right shift XOR by 1 to check the next bit

            }



            return count;
        }

    public static void main(String[] args) {
            int A=7;
            int B=12;
            int ans=flipBits(A,B);
        System.out.println(ans);

    }
}