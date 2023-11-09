class Solution{
    public static double mypow(double x , int n){
    double ans=1.0;
    long nn=n;
    while(nn>0){
        if(nn%2==1){
            ans=ans*x;
            nn=nn-1;
        }
        else{
            x=x*x;
            nn=nn/2;
        }
    }
    if(n<0){
        ans=(double)1.0/(double)ans;
    }
    return ans;
    }
    public static void main(String [] args){
        double x=3;
        int n=12;
        double ans=mypow(x,n);
        System.out.println(ans);
    }
}