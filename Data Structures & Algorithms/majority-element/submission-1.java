class Solution {
    public int majorityElement(int[] nums) {
       int k=nums.length/2;
      
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int n:nums)
      {
        hm.put(n,hm.getOrDefault(n,0)+1);
      }
      for(Map.Entry<Integer,Integer> e:hm.entrySet())
      {
        if(e.getValue()>k)
         return e.getKey();
      }
      return -1;
    }
}