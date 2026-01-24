//To solve the problem of removing the outermost parentheses from a valid parentheses string, you can use a counter to track the depth of the parentheses as you iterate through the string.
//when count is 0 it means we are at outermost level
//increment the counter when you encounter an opening parenthesis '('
//decrement the counter when you encounter a closing parenthesis ')'
//only add the parentheses to the result when the counter is greater than 0


//why we are  doing this way?
//By using a counter, you can easily determine the depth of the parentheses without needing to maintain a stack or additional data structures. This approach is efficient and straightforward, allowing you to process the string in a single pass (O(n) time complexity) while using constant space (O(1) space complexity) for the counter. It simplifies the logic needed to identify and remove the outermost parentheses, making the code cleaner and easier to understand.

class Solution {
    public String removeOuterParentheses(String s) {
        int  count = 0;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i < s.length();  i++){
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count != 0){
                ans.append(s.charAt(i));
            }
            if(s.charAt(i) == '('){
                count++;
            }
        }
        return ans.toString();
    }
}

//we took ) first because we want to avoid adding the outermost ( to the result when we encounter it. If we checked for '(' first, we would increment the count before checking if it's outermost, leading to incorrect results. By checking for ) first, we ensure that we only add parentheses to the result when we are inside a valid nested structure, effectively removing the outermost parentheses.

//and we append only when count is not equal to 0 because when count is 0, it indicates that we are at the outermost level of the parentheses. At this level, we want to exclude the outermost parentheses from the result. By appending characters only when count is not equal to 0, we ensure that only the inner parentheses and their contents are included in the final output, effectively removing the outermost parentheses from the valid parentheses string. 


//pattern for this  typo ques 
/*
Depth Counting / Balance Counter (Stack Simulation)

We simulate a stack using an integer counter.

Recognition clues (3–4 points)
Parentheses string is guaranteed valid
Nested structure → depth matters
Need to remove characters based on nesting level
Stack can be replaced with a counter


tips
Handle closing bracket FIRST
Append a bracket only if depth is not zero after handling ) and before handling (.”
*/