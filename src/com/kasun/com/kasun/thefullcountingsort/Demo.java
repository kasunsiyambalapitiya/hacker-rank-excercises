package com.kasun.com.kasun.thefullcountingsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kasun on 6/19/18.
 */
public class Demo {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int x = user_input.nextInt();
        List<String> allInputs = new ArrayList<>();
        String[] array1 = new String[]{};
        String[] array2 = new String[]{};
        String[] array3 = new String[]{};
        Object[] result = new Object[]{array1, array2, array3};
        for (int i = 0; i < x; i++) {
            allInputs.add(user_input.next());
        }
        int index =0;
        for (String text: allInputs){
            String textArr[]= text.split("\\s+",2);
            index= Integer.valueOf(textArr[1]);

        }



/*
        int counter = 0;

        allInputs.add(input);
        if (i < x / 2) {
            String
        }
*/

    }

}
