/**
 *Tiem:100%
 */
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)return 0;
        int i=0;
        int max=1;
        int count=1;
        for(int j=0;j<nums.length-1;j++){
            if(nums[j+1]>nums[j])
            {
                count++;
                if(max<count)max=count;
                
            }else
                count=1;
        }
        return max;
    }
}