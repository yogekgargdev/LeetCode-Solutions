class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //-> Improved Solution 
        // Rather than checking for each and every elements .contains() use 'boolean add()' only
        // above function return false, if element already present in the hashset.
        
        HashSet<Integer> hset=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hset.add(nums[i]))
            {
                return true;
            }
        }
        return false;
        
        
    }
}