class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<Integer>();
       
       while(n!=1)
       {
        if(hs.contains(n))
         return false;

        hs.add(n);
        int sum=0;
        while(n>0)
        {
          int temp=n%10;
        sum+=(temp*temp);
        n=n/10;
        } 
       n=sum;
       } 
       return true;
    }
}
