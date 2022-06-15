package Stack.StackUsingArray;

import java.util.Scanner;

class stringStackBracket extends stringStack{
    stringStackBracket(int stacklength){
        super(stacklength);
    }

    @Override
    boolean checkParenthesis(char[] arr) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                push(arr[i]);
            }
            if(arr[i]==')' || arr[i]=='}' ||arr[i]==']'){
                if(isEmpty()){return false;}
                else{
                    if(checkBracketsMatch(arr[i])){
                        pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(isEmpty()){
            return true;
        }
        return false;
    }

    boolean checkBracketsMatch(char c){
        char d;
        switch (c){
            case '}':
                d='{';
                break;
            case ')':
                d='(';
                break;
            case ']':
                d='[';
                break;
            default:
                d='\0';
        }
        if(d==peek()){
            return true;
        }
        return false;
    }
}

public class $3_Brackets_Matching{
    public static void main(String[] args) {

        char arr[];
        System.out.print("Enter expression in String ::");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        arr=s.toCharArray();

        stringStackBracket st=new stringStackBracket(arr.length);
        boolean res=st.checkParenthesis(arr);
        System.out.println(res);
    }
}

