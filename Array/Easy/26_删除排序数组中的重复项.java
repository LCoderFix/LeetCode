/**
 *Tiem:98%
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i])
            {
                count++;
                nums[count]=nums[i+1];
            }    
        }
        return count+1;
    }
}