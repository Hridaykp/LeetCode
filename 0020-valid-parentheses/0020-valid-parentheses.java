class Solution {
    public boolean isValid(String str) {
        if(str.length() % 2 != 0) 
            return false;
        Stack<Character> stk = new Stack();

        for (char c: str.toCharArray()) {
            if(c == ')' && !stk.isEmpty() && stk.peek() == '(') 
                stk.pop();
            else if (c == '}' && !stk.isEmpty() && stk.peek() == '{') 
                stk.pop();
            else if (c == ']' && !stk.isEmpty() && stk.peek() == '[') 
                stk.pop();
            else
                stk.push(c);
        }
        return stk.isEmpty();
     }
}