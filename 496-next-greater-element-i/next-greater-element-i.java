class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int num=-1;
            int c=0;
           for(int j=0;j<nums2.length;j++){
            if(c==1){
              if(nums2[j]>nums1[i]){
                num=nums2[j];
                break;
              }
            }
            if(nums1[i]==nums2[j]) c=1;
        }
        arr[i]=num;
        }
    return arr;
    }
}