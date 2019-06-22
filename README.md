# Test3

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


package com.example.test3;

//2. Given a string and a non-empty substring sub,
//        compute recursively if at least n copies of sub appear in the string somewhere,
//        possibly with overlapping. N will be non-negative.
//
//        strCopies("catcowcat", "cat", 2) → true
//        strCopies("catcowcat", "cow", 2) → false
//        strCopies("catcowcat", "cow", 1) → true*/

public class StringCopy {
    static int count = 0;
    static int position = 0;

    static boolean strCopies(String passInString, String copy, int i) {

        int pISLength = passInString.length();
        int copyLength = copy.length();


        if (copyLength <= pISLength) {

            if (passInString.substring(position, position + copyLength).equals(copy)) {
                count++;

                return strCopies(passInString.substring(position + 1), copy, i);

            } else if (!passInString.substring(position, position + copyLength).equals(copy)) {

                return strCopies(passInString.substring(position + 1), copy, i);
            }
        }
        if (count == i) {
            count = 0;

            System.out.println("true");
            return true;

        } else {
            System.out.println("false");
            count = 0;
            return false;
        }

    }


    public static void main(String[] args) {
        strCopies("catcowcat", "cat", 1);
        strCopies("catcowcat", "cat", 2);
        strCopies("aaa", "aa", 2);


    }
}
