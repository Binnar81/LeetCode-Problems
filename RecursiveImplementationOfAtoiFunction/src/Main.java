class Solution {

    int total;
    public  int myAtoi(String s) {
        total=0;
        return createAtoi(s,0,true,false);
    }
    int createAtoi(String s,int index,boolean sign, boolean num){
    if(s.length()==0){
        return 0;
    }
    if(!num){
        if(s.charAt(index)==' '){
            return createAtoi(s,index+1,sign,num);
        }
        if(s.charAt(index)=='-'|| s.charAt(index)=='+'){
            sign=(s.charAt(index)=='-')?false:true;
            return createAtoi(s,index+1,sign,!num);
        }
    }
    num=true;
    char ch=s.charAt(index);
    if(ch-'0'<0 || ch-'0'>9)return 0;
    if(total>(Integer.MAX_VALUE/10)|| total==(Integer.MAX_VALUE/10) && ch-'0'>7)
        return sign?Integer.MAX_VALUE:Integer.MIN_VALUE;
    total=(total*10)+ch-'0';
    int t=createAtoi(s,index+1,sign,num);
    if(t==0) return sign?-total:total;
    else return t;

    }
    public static void main(String[] args){
        String s="-123ind";
        int ans=myAtoi(s);
        System.out.println(ans);
    }
}