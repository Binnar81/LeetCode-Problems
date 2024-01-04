class Solution {
    public static boolean checkRecord(String s) {
        int A=0;
        int L=0;
        boolean streak=false;
        boolean ans=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                A++;
            }
            if(s.charAt(i)=='L'){
                L++;
                if(L==3){
                    streak=true;
                }
            }
            else{
                L=0;
            }

        }

        if(A<2 && L<3 && streak==false){
            ans=true;
        } return ans;
    }
    public static void main(String[] args){
        String s="PPALLP";
        boolean ans=checkRecord(s);
        System.out.println(ans);
    }
}