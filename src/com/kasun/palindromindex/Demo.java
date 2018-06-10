package com.kasun.palindromindex;

import java.util.Scanner;

/**
 * Created by kasun on 6/7/18.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int noOfQueries = user_input.nextInt();
        String query[] = new String[noOfQueries];
        int result[] = new int[noOfQueries];
        for (int i = 0; i < noOfQueries; i++) {
            query[i] = user_input.next();
        }
        for (int i = 0; i < query.length; i++) {
            result[i] = palindrom(query[i]);
        }
        for (int i : result) {
            System.out.println(i);
        }
    }
    // first checkt the string is equal in reverse order then -1

    public static int palindrom(String text) {
        if (new StringBuilder(text).reverse().toString().equals(text)) {
            return -1;
        } else {
            // aba bnem
            for (int i = 0; i < text.length(); i++) {
                String tempText1 = text.substring(0, i);
                String tempText2 = text.substring(i + 1, text.length());
                String newText = tempText1 + tempText2;
                if (new StringBuilder(newText).reverse().toString().equals(newText)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
