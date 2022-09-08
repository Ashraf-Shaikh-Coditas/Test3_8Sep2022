package Test3_8Sep2022;

import java.util.Scanner;

public class StringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTest stringTest = new StringTest();
        System.out.println("Please enter your String...");
        String string1 = scanner.nextLine();

        System.out.println("1. Sort LengthWise. \n" +
                "2. Sort Lexicographically   \n" +
                "3. Append $ at last  \n" +
                "4. Reverse the String .");

        while (true) {
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stringTest.sortLengthWise(string1);
                    break;

                case 2:
                    stringTest.sortAlphabetically(string1);
                    break;

                case 3:
                    stringTest.appendAtEnd(string1);
                    break;

                case 4:
                    stringTest.reverseString(string1);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}
