class Solution {
    public boolean isValid(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                // Pop the top element and see if it matches the correct pairs
                char top = st.pop();
                if (ch == ')' && top != '(')
                    return false;
                if (ch == ']' && top != '[')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
            }
        }
        // If the stack is completely empty, all brackets were matched perfectly
        return st.isEmpty();
    }
}