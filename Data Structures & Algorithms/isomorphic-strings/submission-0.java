class Solution {
    public boolean isIsomorphic(String s, String t) {
      if(s.length() != t.length())
      {
        return false;
      } 
      HashMap<Character,Character> st=new HashMap<>();
       HashMap<Character,Character> ts=new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
        char schar=s.charAt(i);
        char tchar=t.charAt(i);
       if(st.containsKey(schar))
       {
        if(st.get(schar)!=tchar)
        {
            return false;
        }
       
      } 
      if(ts.containsKey(tchar))
       {
        if(ts.get(tchar)!=schar)
        {
            return false;
        }
       
      } 
      st.put(schar,tchar);
      ts.put(tchar,schar);
    }
    return true;
    }     
}