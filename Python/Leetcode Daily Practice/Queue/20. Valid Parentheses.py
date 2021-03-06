"""
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
"""
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) <= 1:
            return False
        stack = []
        p_map = {"(":")", "{":"}", "[":"]"}
        for i in range(len(s)):
            if s[i] in p_map:
                stack.append(p_map[s[i]])
            else:
                if stack[-1] == s[i]:
                    stack.pop()
                else:
                    return False 
        return True 

print(Solution().isValid("()[]{}"))
