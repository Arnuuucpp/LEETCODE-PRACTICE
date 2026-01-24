class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}


//if ((c - '0') % 2 == 1) checks if the character c represents an odd digit by converting it to its integer value and checking the remainder when divided by 2.//If the remainder is 1, the digit is odd.//If an odd digit is found, the method returns the substring of num from the start to that index (inclusive).//If no odd digit is found, the method returns an empty string.
//The method iterates through the string from the end to the beginning to find the largest odd number possible by truncating the string at the first odd digit encountered.
//dry run:
//Input: num = "524684"    
//Iteration 1: i = 5, c = '4' (even, continue)    //here '4' - '0' = 4, 4 % 2 = 0 (even) '4' - '0' converts the character '4' to its integer value 4.
//Iteration 2: i = 4, c = '8' (even, continue)    //here '8' - '0' = 8, 8 % 2 = 0 (even)
//Iteration 3: i = 3, c = '6' (even, continue)
//Iteration 4: i = 2, c = '4' (even, continue)
//Iteration 5: i = 1, c = '2' (even, continue)
//Iteration 6: i = 0, c = '5' (odd, return "5")
//Output: "5"

//                return num.substring(0, i + 1); it  means that when an odd digit is found at index i, then 
//we  harde   coded the substring method to extract the portion of the string from the start (index 0) to the index i + 1 (inclusive of the odd digit found).
//in hindi mtlb ki jab odd digit mil jata h at index i to hum string ka wo hissa return karte h jo start se lekar i+1 tak hota h (jisme wo odd digit bhi shamil hota h).
// The method returns the substring from index 0 to i + 1, which is "5" in this case

