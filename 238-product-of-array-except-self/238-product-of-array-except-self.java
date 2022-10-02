class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int temp=1;
        int[] toret= new int[nums.length]; 
        
        for(int i=0;i<nums.length;i++)
        {
            toret[i]=temp;
            temp=temp*nums[i];
        }
        
        temp=1;
        
        for(int i=nums.length-1;i>=0;i--)
        {
            toret[i]=temp*toret[i];
            temp=temp*nums[i];
        }
        
        return toret;
        
    }
}