package Stack.StackUsingArray;

import java.util.Scanner;

public class $5_Infix_to_Postfix_with_parenthesis_and_associativity {
    static int outsideStackGetPriority(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 3;
        }
        else if(c=='^'){
            return 6;
        }
        else if(c=='('){
            return  7;
        }
        else if(c==')'){
            return 0;
        }
        else {
            return -1;
        }
    }

    static int insideStackGetPriority(char c) {
        if (c == '+' || c == '-') {
            return 2;
        } else if (c == '*' || c == '/') {
            return 4;
        }
        else if(c=='^'){
            return 5;
        }
        else if(c=='('){
            return  0;
        }
        else if(c==')'){
            return 0;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter expression:: ");
        Scanner scan = new Scanner(System.in);

        String s = scan.next();
        StringBuffer postfix = new StringBuffer();
        stringStack st = new stringStack(s.length());

        char[] arr = s.toCharArray();
        char x='\0';

        for (char i : arr) {
            if (i == '+' || i == '-' || i == '/' || i == '*' || i=='(' || i==')' || i=='^') {
                if (st.isEmpty()) {
                    if(i!=')')
                        st.push(i);
                }
                else {
                    while (insideStackGetPriority(st.peek()) >= outsideStackGetPriority(i)) {
                        x=st.pop();

                        if(x!='(' && x!=')'){
                            postfix.append(x);
                        }
                    }
                    st.push(i);
                }
            } else {
                    postfix.append(i);
            }
        }
        while (st.isEmpty() == false) {
            if(st.peek()==')')
                st.pop();       //TO remove ')' in stack;else stack never gets empty and this will result infinite loop
            else
                postfix.append(st.pop());       //Appending the last elements to postfix
        }
        System.out.println("Postfix form:: " + postfix);

    }
}
