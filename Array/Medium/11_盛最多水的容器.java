//暴力法  O(n^2)
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length;i++)
            for(int j=i+1;j<height.length;j++)
                if(max<(j-i)*Math.min(height[i],height[j]))
                    max=(j-i)*Math.min(height[i],height[j]);
        return max;
    }
}