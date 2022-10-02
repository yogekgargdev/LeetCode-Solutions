class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        //-> form a HashMap
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        //-> Initialising the hashmap for key value set
        for(int i=0;i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        
        HashMap<Integer, ArrayList<Integer>> bucket= new HashMap<>();
        int freq=0;
        for(Integer key: hmap.keySet())
        {
            freq=hmap.get(key); //-> frequency
            if(!bucket.containsKey(freq))
            {
                bucket.put(freq, new ArrayList<>());
            }
            bucket.get(freq).add(key);
        }
        
        int[] toret= new int[k];
        k=k-1;
        
        outerloop:
        for(int i=nums.length;i>0;i--)
        {
            if(bucket.containsKey(i))
            {
                for(Integer j: bucket.get(i))
                {
                    if(k>=0)
                    {
                        toret[k]=j;
                        k--;
                    }
                    else
                    {
                        break outerloop;
                    }
                    
                }
                
            }
        }
        
        return toret;
        
        
        

    }
}