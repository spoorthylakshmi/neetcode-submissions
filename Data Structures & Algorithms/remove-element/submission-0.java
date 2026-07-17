class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> li=new ArrayList<Integer>();
        for(int n:nums)
        {
            if(n!=val)
            {
                li.add(n);
            }
        }
        for(int i=0;i<li.size();i++)
        {
            nums[i]=li.get(i);
        }

       return li.size();
    }
}