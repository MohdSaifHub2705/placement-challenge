class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=m-1;
       int j=n-1;
       int lastPos=nums1.length-1;
       
       // travrese nums2 array
       while(j >= 0) {
           if(i >= 0 && nums1[i] > nums2[j]) {
               nums1[lastPos] = nums1[i];
               lastPos--;
               i--; // update pointer for another camparision
           } else {
               nums1[lastPos] = nums2[j];
               lastPos--;
               j--;
           }
       }
    }
}
