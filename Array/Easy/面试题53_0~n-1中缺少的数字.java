/**
 * 解法1
 *桶排序原理
 *Time:100%
 *Memory:100%
 */
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
       for(;i<nums.length;i++){
           if(nums[i]!=i)
               return i;
       }
        return nums.length;
    }
}


/**
 *解法2 同1054解法2
 *Time:10%
 *Memory:100%
 */
class Solution {
    public int missingNumber(int[] nums) {
        int a[]=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
            a[nums[i]]++;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                return i;
        }
        return 0;
    }
}
