package Stack.StackUsingArray;
import java.util.Scanner;

public class $4_Infix_to_postfix {

    static int getPriority(char c){
        if(c == '+' || c=='-'){
            return 1;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter expression:: ");
        Scanner scan=new Scanner(System.in);

        String s=scan.next();
        StringBuffer postfix=new StringBuffer();
        stringStack st=new stringStack(s.length());

        char [] arr= s.toCharArray();

        for(char i:arr){
            if(i=='+' || i=='-'|| i=='/' || i=='*'){
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    while (getPriority(st.peek()) >= getPriority(i)){
                        postfix.append(st.pop());
                    }
                    st.push(i);
                }
            }
            else{
                postfix.append(i);
            }
        }
        while (st.isEmpty()==false){
            postfix.append(st.pop());
        }
        System.out.println("Postfix form:: "+postfix);

    }
}
