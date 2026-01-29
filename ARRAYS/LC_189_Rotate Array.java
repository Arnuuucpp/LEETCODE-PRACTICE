class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse( nums , 0 , nums.length-1);
        reverse( nums , 0 , k-1 );
        reverse( nums , k , nums.length-1);
    }

    public static void reverse(int[] nums , int start , int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;

        }

        // return nums;


    }
}

/*
📝 Pattern for notebook (Rotate Array – LeetCode 189)

Rotation via reversal:

Reverse the whole array.

Reverse first k elements.
(So k counts elements, not indices.
That’s why you always adjust to k-1 when using indices.) example k=3 , then k-1 = 2 means till index 2  i.e. 3 elements hogye )

Reverse last n - k elements.
k to nums.length-1 tk 
👉 Make sure to do k = k % n (handles cases where k >= n).



*/