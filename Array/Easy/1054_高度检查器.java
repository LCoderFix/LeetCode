
/**
 *解法1
 *Time:84.38%
 *Memory:10%
 */
class Solution {
    public int heightChecker(int[] heights) {
        int length=heights.length;
        int a[]=new int[heights.length];
        int count=0;
       for(int i=0;i<heights.length;i++){
           a[i]=heights[i];
       }
        Arrays.sort(a);
        
        for(int i=0;i<heights.length;i++){
            if(a[i]!=heights[i])
                count++;
        }
        return count;
    }
    //快排递归超时
    public void quickSort(int[] heights,int _left,int _right){
        int left=_left;
        int right=_right;
        int temp=0;
        if(left<right){
            temp=heights[left];
            while(left!=right){
                while(right>left&&heights[right]>=temp){
                    right--;
                }
                heights[left]=heights[right];
                while(left<right&&heights[left]<=temp){
                    left++;
                }
                heights[right]=heights[left];
            }
            heights[right]=temp;
            quickSort(heights,0,right);
            quickSort(heights,right+1,_right);
        }
    }
}
/**
 *解法2
 *Time:100%
 *Memory:10%
 */
class Solution {
    
    public int heightChecker(int[] heights) {
        int a[]=new int[101];
        int count=0;
        int j=0;
        for(int i=0;i<heights.length;i++){
            a[heights[i]]++;
        }
        for(int i=0;i<101;i++){
            while((a[i]--)!=0){
                if(heights[j++]!=i)
                    count++;
            }
        }
        return count;
    }
}