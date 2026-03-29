class Solution {
    public double findPow(double x,long N){
        if(x==0){
            return 0;
        }
        if(N==1){
            return x;
        }
        if(N==0){
            return 1;
        }

        double half=findPow(x,N/2);

        if(N%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
    public double myPow(double x, int n) {
        long N=n;
         if(N<0){
            N=-N;
            x=1/x;
        }
        return findPow(x,N);
      
    }
}
