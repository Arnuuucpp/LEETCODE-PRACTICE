class Solution {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        int n = address.length();
        for(int  i = 0; i<n; i++){
        char ch = address.charAt(i);
        if(ch == '.'){
        builder.append("[.]");
        }else{
        builder.append(ch);
        }
        }
        return builder.toString();
        //means: “Give me the final, immutable string result”
    }
}




//................notes.................

//pattern for this problem is String Traversal + Conditional Replacement (using StringBuilder)
//string buildeer for building new string and it  dont modify original string it chnages the string in place
//time complexity is o(n) and space complexity is o(n)

//.append() is used to add characters to the StringBuilder object.
//.charAt() is used to access individual characters in the string.
//stringbuilder is mutable whereas string is immutable
//stringbuilder is more efficient when we have to do multiple modifications to a string
//when using stringbuilder we return the final string using toString() method

//in this problem we are iterating through each character of the string if we find '.' we append "[.]" to the stringbuilder else we append the character itself 

//also when we use stringbuilder we append characters to it rather than modifying the original string which is immutable in java





