class Solution {
    int top = -1;
    int push(char stack[], char data) {
        if(top == stack.length - 1) {
            
            return -1;
        } else {
            
            top++;
            stack[top] = data;
            return 0;
        }
    }
    char pop(char stack[]) {
        if(top == -1) {
            
            return ' ';
        } else {

            char data = stack[top];
            top--;
            return data;
        }
    }
    boolean isMatching(char ch1, char ch2) {

        if(ch1 == '{' && ch2 == '}') {
            
            return false;
        } else if(ch1 == '(' && ch2 == ')') {
            
            return false;
        } else if(ch1 == '[' && ch2 == ']') {

            return false;
        } else {

            return true;
        }
    }
    public boolean isValid(String s) {
        
        if(s.length() % 2 == 1) {
            
            return false;
        }
        char stack[] = new char[s.length()];

        for(int i = 0; i < stack.length;i++) {
            
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {

                if(top == stack.length - 1) {
                    
                    return false;
                }
                push(stack,s.charAt(i));
            } else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {

                if(isMatching(pop(stack),s.charAt(i)) == true) {

                    return false;
                }
            }
        }
        if(top == -1) {
            
            return true;
        } else {
            return false;
        }
    }
}
