 public int reverse(int n) {
       long sum=0;
       while(n!=0){
        int r=n%10;
        sum=(sum*10)+r;
        n=n/10;
       }
       if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)return 0;
       return (int)sum;
    }
