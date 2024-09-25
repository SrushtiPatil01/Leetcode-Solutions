//25 September 2024
/* 387. First Unique Character in a String 

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Constraints:
1 <= s.length <= 105
s consists of only lowercase English letters.

Example 1:
Input: s = "loveleetcode"
Output: 2
*/

Actual Way:
The idea is to go through the string and save in a hash map the number of times each character appears in the string. 
That would take O(N) time, where N is the number of characters in the string.

Then we go through the string the second time, this time we use the hash map as a reference to check if a character is unique or not. 
If the character is unique, one could just return its index. The complexity of the second iteration is O(N) as well.
*/

//Solution:
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0)+1);
        }

        for(int i=0; i<s.length(); i++){
            if(count.get(s.charAt(i)) == 1) return i;
        }
        return -1;

    }
}


/* Complexity Analysis
Time complexity: O(N) since we go through the string of length N two times.
Space complexity: O(1) because English alphabet contains 26 letters.
*/
