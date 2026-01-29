class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
    }
    

/*
//int count = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n])  // did this cuz When i = nums.length - 1, i+1 goes out of range.
//✅ Fix: use modulo ((i+1) % nums.length) to wrap around.
                count++;
            if (count > 1) 
                return false;
        }
        
        return true;



Walk through the array and count how many times the order breaks (i.e., when nums[i] > nums[i+1]).

If the array is perfectly sorted and rotated:

This “drop” (break in order) can happen at most once.

If it happens more than once → return false.




dry run nums = [3, 4, 5, 1, 2]
Step 1: Initialize
count = 0

n = 5

We loop i = 0 → 4, and compare nums[i] with nums[(i+1) % n].

Step 2: Iteration
i = 0: compare 3 and 4 → 3 > 4? ❌ no → count = 0

i = 1: compare 4 and 5 → 4 > 5? ❌ no → count = 0

i = 2: compare 5 and 1 → 5 > 1? ✅ yes → count = 1

i = 3: compare 1 and 2 → 1 > 2? ❌ no → count = 1

i = 4: compare 2 and nums[(4+1) % 5] = nums[0] = 3 → 2 > 3? ❌ no → count = 1

Step 3: After loop
count = 1

Since count <= 1 → ✅ return true.

Check another case
java
Copy code
nums = [2, 1, 3, 4]
(2 > 1) ✅ count = 1

(1 > 3) ❌

(3 > 4) ❌

(4 > 2) ✅ count = 2

Now count = 2 → ❌ return false.

👉 That’s how the count approach works:

If the array is sorted and rotated, there will be at most one “drop”.

More than one drop → not sorted+rotated.

*/