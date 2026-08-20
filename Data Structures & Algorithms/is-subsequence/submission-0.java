class Solution {
    public boolean isSubsequence(String s, String t) {
      int l=0,j=0;
      while(l<s.length() && j<t.length())
      {
        if(s.charAt(l)==t.charAt(j))
        {
          l++;
        }
        j++;
      }
      return l==s.length();
    }
}