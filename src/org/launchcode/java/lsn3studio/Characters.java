package org.launchcode.java.lsn3studio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Characters {

    public static void main(String[] args) {
        String str = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = str.toCharArray();
//        System.out.println(Arrays.toString(charactersInString));

        HashMap<Character, Integer> counts = new HashMap<>();

        for (char currentChar : charactersInString) {
            if (counts.containsKey(currentChar)) {
                counts.put(currentChar, counts.get(currentChar) + 1);
            }else{
                counts.put(currentChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println(count.getKey() + ": " + count.getValue());
        }

    }
}