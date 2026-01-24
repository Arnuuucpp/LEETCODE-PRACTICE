class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                ++i;
            }
            else if(!Character.isLetterOrDigit(s.charAt(j))){
                --j;
            }
            else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            else{
                ++i;
                --j;
            }
        }
        return true;
    }
}



//......................notes.......................



//palindrome meaning it reads the same forwards and backwards.and we need to ignore non-alphanumeric characters and case differences.

//pattern is to use two pointers to compare characters from start and end, skipping non-alphanumeric characters and ignoring case differences.

//Time Complexity: O(n), where n is the length of the string. We may need to traverse the entire string in the worst case.
//Space Complexity: O(1), as we are using only a constant amount of extra space  🔥 This is optimal
//character.isLetterOrDigit() checks if a character is alphanumeric.
//character.toLowerCase() converts a character to lowercase for case-insensitive comparison.

//we ++i  not i++ because we want to increment the pointer before the next iteration of the loop.