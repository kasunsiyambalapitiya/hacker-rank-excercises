package com.kasun.palindromindex;

import java.util.Scanner;

/**
 * Created by kasun on 6/7/18.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int noOfQueries = user_input.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            System.out.println(palindrom(user_input.next()));
        }
    }

    // first checkt the string is equal in reverse order then -1
    // aa
    // aa aa
    // avid diva

    // avideedxiva
    // avid efd xiva

    // avix efd diva
    // avix eed diva
    // avbiddiva
    public static int palindrom(String sampleText) {
        int index = -1;
        int reverseIndex = sampleText.length() - 1;
        for (int i = 0; i < sampleText.length(); i++) {
            if (((i + 1) == reverseIndex) && (sampleText.charAt(i + 1) == sampleText.charAt(reverseIndex))) {
                break;
            } else if (((i + 1) == reverseIndex) && (sampleText.charAt(i + 1) != sampleText.charAt(reverseIndex)) &&
                    (index > -1)) {
                return -1;
            } else {
                index = -1;
                if (sampleText.charAt(i) != sampleText.charAt(reverseIndex)) {
                    if (sampleText.charAt(i) == sampleText.charAt(--reverseIndex)) {
                        index = reverseIndex + 1;
                    }

                } else {
                    index = -1;
                }
            }
            --reverseIndex;
        }


/*        if (sampleText.charAt(0) == sampleText.charAt(sampleText.length()))
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
        return -1;*/
        return index;
    }

}
