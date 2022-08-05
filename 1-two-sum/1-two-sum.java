import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // <Value,Index>
        HashMap<Integer,Integer> hmap= new HashMap<>();
        int[] toret=new int[2];
        
        for(int i=0;i<nums.length;i++)
        {
            if(hmap.containsKey(target-nums[i]))
            {
                toret[0]=hmap.get(target-nums[i]);
                toret[1]=i;
                break;
            }
            hmap.put(nums[i],i);
        }
        
        return toret;
        
        
        
    }
}