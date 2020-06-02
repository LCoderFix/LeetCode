//16:28 100%  O(n)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums3[]=new int[m+n];
        int i=0,j=0,temp=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                nums3[temp++]=nums1[i];
                i++;
            } 
            else{
                nums3[temp++]=nums2[j];
                j++;
            }    
        }
       
        for(;i<m;i++)
            nums3[temp++]=nums1[i];
        for(;j<n;j++)
            nums3[temp++]=nums2[j];
        for( i=0;i<m+n;i++)
            nums1[i]=nums3[i];
    }
}
//解法2 O(nlogn)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       for(int i=m;i<m+n;i++){
           nums1[i]=nums2[i-m];
       }
        Arrays.sort(nums1);
    }
}