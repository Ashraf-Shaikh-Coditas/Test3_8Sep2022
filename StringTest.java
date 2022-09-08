package Test3_8Sep2022;

import java.util.Arrays;

public class StringTest {
    public void sortLengthWise(String s1) {
        String[] array = s1.split(" ");

        for (int outer = 0; outer < array.length - 1; outer++) {
            for (int inner = 0; inner < array.length - 1 - outer; inner++) {
                if (array[inner].length() > array[inner + 1].length()) {
                    String temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                }
            }
        }

        System.out.println("Sorted length wise ...");
        for (String s : array) {
            System.out.println(s);
        }
    }

    public void sortAlphabetically(String s1) {
        String[] array = s1.split(" ");

        Arrays.sort(array);

        System.out.println("Sorted Lexicographically wise ...");

        for (String s : array) {
            System.out.println(s);
        }

    }

    public void appendAtEnd(String s1) {
        String[] array = s1.split(" ");

        Arrays.sort(array);

        for (int outer = 0; outer < array.length; outer++) {

            array[outer] = array[outer] + "$";
        }

        System.out.println("Added $ at end ...");

        for (String s : array) {
            System.out.println(s);
        }
    }

    public void reverseString(String s1) {
        char[] array = s1.toCharArray();

        String answer = "";

        for (int outer = s1.length() - 1; outer >= 0; outer--) {
            answer += array[outer];
        }

        System.out.println("Reversed string is : " + answer);
    }

}
