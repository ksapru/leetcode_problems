class Solution {
    public int search(int[] nums, int target) {
        
        
        int first = 0; 
        int last = nums.length - 1;
        
         
        while (first <= last) {
            // mid point classic binary search porblem 
            int mid = first + (last - first) / 2; 
            
            
            // if nums[4] == target
            // then return the mid index 
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // if nums[4] > 9
            // go backwards 
            else if (nums[mid] > target) {
                last = mid - 1;
            }
            
            // else we're going to assume otherwise 
            // it is less than so it will traverse 
            // and find the index from 0 + 1
            // 1 + 2.... 
            
            else if (nums[mid] < target) {
                first = mid + 1;
            
            }
        }
         
        // base case value 
        return -1; 
    }
}
