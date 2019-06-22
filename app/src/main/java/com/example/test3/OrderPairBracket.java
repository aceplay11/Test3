package com.example.test3;
//1. Create a program which checks if the string has the correct order of parenthesis/brackets.
//        ({})[] = true, []{]}[ = false


import java.util.Stack;

public class OrderPairBracket {

    static boolean checkBalance(String string) {
        Stack stack = new Stack();


        for (int i = 0; i < string.length(); i++) {

            char charAt = string.charAt(i);

            if (charAt == '{' || charAt == '(' || charAt == '[') {
                stack.push(charAt);
            }else
                if (charAt == '}' || charAt == ')' || charAt == ']') {

                if (stack.empty()) {
                    System.out.println("Order is not correct");
                    return false;

                } else if (charAt == ')' && (char) stack.peek() != '(' ) {
                    System.out.println("Order is not correct");
                    return false;
                }
                    if(charAt == ']' && (char) stack.peek() != '['){
                        System.out.println("Order is not correct");
                        return false;
                    }

                    else if(charAt == '}' && (char) stack.peek() != '{') {

                    System.out.println("Order is not correct");
                    return false;
                }

                stack.pop();

            }


        }
        if (stack.empty()){
            System.out.println("Oder is correct");}
        return true;
    }

    public static void main(String[] args) {
        String test = "(({{}[]}))";
        String test2 ="[[[[[]]]]]";

        checkBalance(test);
        checkBalance(test2);
    }
}


