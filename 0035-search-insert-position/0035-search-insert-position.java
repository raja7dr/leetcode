class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length-1;
        int res=0;
        for(int i=0;i<=n;i++)
        {
            if(nums[i]>=target)
            {
            res=i;
            break;
            }
            else
            {
                res=nums.length;
            }
        }
        return res;
        
    }
}