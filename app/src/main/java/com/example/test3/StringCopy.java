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
