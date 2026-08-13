class Solution {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        HashSet<Character> hs=new HashSet<>();

      while(right<s.length())
       {
        if(!hs.contains(s.charAt(right)))
        {
            hs.add(s.charAt(right));
            max=Math.max(max,(right-left+1));
            right++;
        }
        else
        {
            hs.remove(s.charAt(left));
            left++;
        }
       }
       return max==Integer.MIN_VALUE?0:max;  
    }
}
