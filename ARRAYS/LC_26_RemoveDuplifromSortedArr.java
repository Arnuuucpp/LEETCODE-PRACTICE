class Solution {
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int n = arr.length;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                //This means we found a new unique element.Increment i

                i++;
                arr[i] = arr[j];

            }
        }
        return i + 1;
    }

    //      i = last index of unique values.
    //      i + 1 = number of unique values.
}


/*📝 Pattern for notebook:
Use two pointers (slow + fast).

slow tracks position of last unique element.

fast scans the array.

If nums[fast] != nums[slow] → move slow forward and copy elem

update the arr[i] = arr[j]

At the end, return i + 1 because i is index, but we need length/count. 
 */