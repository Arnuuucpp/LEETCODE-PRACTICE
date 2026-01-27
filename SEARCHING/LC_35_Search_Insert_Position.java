public class LC_35_Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) /2 ;
            int val = nums[mid]; // reduce repeated array lookup
            
            if (val == target) return mid;
            else if (val < target) start = mid + 1;
            else end = mid - 1;
        }
        return start;      
    }
}



// If not found → return the start pointer.
// Why? Because after the loop, start is exactly the position where target should go


// We return start because, when the target is not found, start holds the insertion index — the position where the target should be inserted to maintain sorted order.


// pattern  
// if kabhi insertion  place na mile  in a sorted array then we return start posi