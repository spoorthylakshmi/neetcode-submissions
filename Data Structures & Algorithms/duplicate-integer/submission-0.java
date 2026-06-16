class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> li=new ArrayList<Integer>();
        for(int n:nums)
        {
           if(li.contains(n) )
           {
              return true;
           }
           li.add(n);
        }
        
       return false;
    }
}