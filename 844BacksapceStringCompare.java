/* Problem 844 - BackSpaceStringCompare(Easy)  
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Constraints:
1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

*/

/*
Actual Way:
There are two ways to solve this problem. The one is using stack. We will push the elements in stack till we get #. Once we get # we will pop the elements in the stack.
once all the string is parsed we will check if the strings are equal.
*/

//Solution:
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s){
        Stack<Character> result = new Stack<>();
        for(char c: s.toCharArray()){
            if(c != '#'){
                result.push(c);
            }
            else if(!result.isEmpty()){
                result.pop();
            }
        }
        return String.valueOf(result);
    }
}


/* Complexity Analysis
Time complexity: O(M+N), where M,N are the lengths of S and T respectively.
Space complexity:  O(M+N), where M,N are the lengths of S and T respectively.
*/

/* New concepts:


*/
