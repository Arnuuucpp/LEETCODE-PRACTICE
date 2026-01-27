// 704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + ((end - start) >> 1); // faster bit shift for divide by 2
            int val = nums[mid]; // reduce repeated array lookup
            
            if (val == target) return mid;
            else if (val < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
