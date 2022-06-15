package Stack.StackUsingArray;


import java.util.Scanner;

class stringStack{
    private int size,top;
    private char arr[];

    stringStack(int lengthofArray){
        top=-1;
        size=lengthofArray;
        arr=new char[size];
    }

    int push(char data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return -1;
        }
        else{
            //System.out.println("Element pushed::"+data);
            top++;
            arr[top]=data;
        }
        return 1;
    }

    char pop(){
        char x;
        if(top==-1){
            System.out.println("Stack Underflow");
            return '\0';
        }
        else{
            x=arr[top];
            arr[top]=0;
            top--;
            //System.out.println("Element popped::"+x);
        }
        return x;
    }

    char peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
        }
        else{
            return arr[top];
        }
        return '\0';
    }
//
//    void display(){
//        System.out.print("Stack:: ");
//        System.out.println("\\       /");
//        for(int i= arr.length-1;i>=0;i--){
//            System.out.println(" | "+arr[i]+" | ");
//        }
//        System.out.println("  ----- ");
//    }

    boolean isEmpty(){
        if(top==-1){
            return  true;
        }
        return  false;
    }
//
//    boolean isFull(){
//        if(top==size-1){
//            return  true;
//        }
//        return  false;
//    }

    boolean checkParenthesis(char arr[]){
        for(int i=0;i< arr.length;i++){
            if(arr[i]=='('){
                push(arr[i]);
            }
            if(arr[i]==')'){
                if(isEmpty()){return false;}
                else{
                    pop();
                }
            }
        }
        if(isEmpty()){
            return true;
        }
        return false;
    }
}

public class $2_Paranthesis_Matching {
    public static void main(String[] args) {

        char arr[];
        System.out.print("Enter expression in String ::");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        arr=s.toCharArray();

        stringStack st=new stringStack(arr.length);
        boolean res=st.checkParenthesis(arr);
        System.out.println(res);
    }
}
