package com.kasun.funnyString;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by kasun on 6/12/18.
 */
public class Demo {

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int count = user_input.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(checkFunny(user_input.next()));
        }
        user_input.close();
    }

    public static String checkFunny(String text) {
        char[] charArray = text.toCharArray();
        //17,18,19,20,21,22,23,24
        for (int i = 0; i < charArray.length-1; i++) {
            if (Math.abs(charArray[i] - charArray[i + 1]) != Math.abs(charArray[charArray.length - 1 - i] -
                    charArray[charArray.length - 2 - i])) {
                return "Not Funny";
            }
        }
        return "Funny";
    }
        /*int[] diffASCI = new int[text.length() - 1];
        int[] diffASCIReverse = new int[text.length() - 1];


        for (int i = 0; i < text.length(); i++) {
            textASCI[i] = text.charAt(i);

        }
        for (int i = 0; i < text.length(); i++) {
            int f = textASCI[i + 1] - textASCI[i];
            diffASCI[i] = f;
        }

        if (diffASCI.equals(diffASCIReverse)) {
            System.out.println("funny");
        } else {
            System.out.println("not funny");
        }
    }*/

}
