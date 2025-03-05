public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else return false;
            }
            if(ch==']'){
                 if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else return false;
            }
            if(ch=='}'){
                 if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
