package com.kasun.palindromindex;

import java.util.Scanner;

/**
 * Created by kasun on 6/7/18.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
//        int noOfQueries = user_input.nextInt();
//        for (int i = 0; i < noOfQueries; i++) {
//            System.out.println(palindrom(user_input.next()));
//     }
        System.out.println(palindrom("aaa"));
        System.out.println(palindrom("aaaaaa"));
        System.out.println(palindrom("aviddiva"));
        System.out.println(palindrom("avideedxiva"));
        System.out.println(palindrom("avidxeexiva"));
        System.out.println(palindrom("avixderdiva"));
        System.out.println(palindrom("avixefddiva"));
        System.out.println(palindrom("avixeeddiva"));
    }

    // first checkt the string is equal in reverse order then -1
    // aaa
    // aaaaa
    // aviddiva

    // avideedxiva        avixd e rdiva
    // avidefdxiva

    // avix efd diva
    // avix eed diva
    // avbiddiva
    public static int palindrom(String sampleText) {
        int index = -1;
        for (int i = 0; i <= sampleText.length() / 2; i++) {
            if ((sampleText.charAt(i) == sampleText.charAt(sampleText.length() - 1 - i))) {
                continue;
            } else {
                if (index > -1) {
                    return -1;

                } else {
                    if (sampleText.charAt(i) == sampleText.charAt(sampleText.length() - 1 - i - 1)) {
                        index = sampleText.length() - 1 - i;
                        sampleText = sampleText.substring(0,sampleText.length()-i-1) + ""+ sampleText.substring
                                (sampleText.length()-i,sampleText.length());
                    } else if (sampleText.charAt(i + 1) == sampleText.charAt(sampleText.length() - 1 - i)) {
                        index = i;
                        sampleText = sampleText.substring(0,i) + ""+ sampleText.substring
                                (i+1,sampleText.length());
                    } else {
                        return -1;
                    }
                }
            }
        }
        return index;
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


}
