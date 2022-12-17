class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack();
        for(String s: tokens){
            if(s.equals("+")){
                int val1 = stk.pop();
                int val2 = stk.pop();
                stk.push(val1+val2);
            }
            else if(s.equals("-")){
                int val1 = stk.pop();
                int val2 = stk.pop();
                stk.push(val2-val1);
            }
            else if(s.equals("*")){
                int val1 = stk.pop();
                int val2 = stk.pop();
                stk.push(val1*val2);
            }
            else if(s.equals("/")){
                int val1 = stk.pop();
                int val2 = stk.pop();
                stk.push(val2/val1);
            }
            else
                stk.push(Integer.parseInt(s));
        }
        return stk.pop();
    }
}