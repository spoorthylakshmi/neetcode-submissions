class Solution {
    public int[] plusOne(int[] digits) {
        int []ans=new int[digits.length+1];
        for (int i = digits.length - 1; i >= 0; i--)
        {
            digits[i]++;
            if(digits[i]<10)
            return digits;
            digits[i] = 0;
        }
        
      ans[0] = 1;
      return ans;
        
    }
}
