package com.kasun.palindromindex;

import java.util.Scanner;

/**
 * Created by kasun on 6/7/18.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int noOfQueries = user_input.nextInt();
        for (int i=0; i< noOfQueries;i++){
            String sampleText= user_input.next();
            System.out.println(palindrom(sampleText));
        }
    }
    // first checkt the string is equal in reverse order then -1
    // aaaaa
    // aviddiva
    public static int palindrom(String sampleText) {
        for (int i=0; i< sampleText.length())
        if (sampleText.charAt(0) == sampleText.charAt(sampleText.length()))
            if (new StringBuilder(sampleText).reverse().toString().equals(sampleText)) {
                return -1;
            } else {
                // aba bnem
                for (int i = 0; i < sampleText.length(); i++) {
                    String tempText1 = sampleText.substring(0, i);
                    String tempText2 = sampleText.substring(i + 1, sampleText.length());
                    String newText = tempText1 + tempText2;
                    if (new StringBuilder(newText).reverse().toString().equals(newText)) {
                        return i;
                    }
                }
            }
        return -1;
    }
}
