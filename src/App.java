import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Ejercicio 0");
        menu(scan);

    }

    // READ 2 STRING AND PRINT IF ARE EQUAL OR NOT
    public static void compare2strings(Scanner scan) {
        System.out.println("\nEnter 2 string and compare if are equal or not");
        System.out.println("Enter first String");
        String str1 = scan.nextLine();
        System.out.println("Enter second String");
        String str2 = scan.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The strings are the same.");
        } else {
            System.out.println("The strings are not the same.");
        }
    }

    // EXERCISE 1
    public static void countCharacters(Scanner scan) {
        System.out
                .println("\nEnter a string and a character and then count the number of times the character in string");
        System.out.println("enter a String");
        String str1 = scan.nextLine();
        System.out.println("Enter a character");
        char chtr = scan.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == chtr) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("the character: " + chtr + " apperas: " + count + " times.");
        } else {
            System.out.println("There is no coincidences, try again.");
        }

    }

    // EXERCISE 2
    public static void reverseString(Scanner scan) {
        System.out.println("\nrever a string and print reversed");
        System.out.println("enter a string: ");
        String str1 = scan.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(str1.length() - i));
        }
    }

    // EXERCISE 3
    public static void subStrings(Scanner scan) {
        System.out.println("\nshow if string 2 is a substring of string 1:");
        System.out.println("enter a string: ");
        String str1 = scan.nextLine();
        System.out.println("enter a second string: ");
        String str2 = scan.nextLine();

        if (str1.length() <= str2.length()) {
            System.out.println("The first string's length must be greater than the second string.");
        } else {
            System.out.println((str1.contains(str2) ? "The first string contains the second string"
                    : "The first string doesn't contains second string"));

        }
    }

    // EXERCISE 4
    public static void printPosition(Scanner scan) {
        System.out.println("\nChek the position of string2 and string 3 in string 1");
        String str1 = "Esta es una prueba de string, que verifica donde esta un string";
        String str2 = "Esta";
        String str3 = "string";
        System.out.println((str1.indexOf(str2) >= 0) ? "El string 2 esta en la posicion: " + str1.indexOf(str2)
                : "there is no coincidence. ");
        System.out.println((str1.indexOf(str3) >= 0) ? "El string 3 esta en la posicion: " + str1.indexOf(str3)
                : "there is no coincidence. ");
    }

    // EXCESICE 5
    public static void strReversed(Scanner scan) {
        System.err.println("Create a new string reversed form the fisrt string");
        System.err.println("Enter a string: ");
        String str1 = scan.nextLine();
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            // System.err.println(str1.charAt(str1.length()-i-1));
            str2 = str2 + str1.charAt(str1.length() - i - 1);
            System.out.println(str2);
        }
        System.err.println("String reversed: " + str2);
    }

    // EXCESICE 6
    public static void charGame(Scanner scan) {
        System.out.println("Case of string length even or odd print characters in determined positions");
        System.out.println("Enter a string: ");
        String str1 = scan.nextLine();
        System.out.println((str1.length() % 2 == 0) ? (str1.substring(0, 1) + str1.substring(str1.length() - 1))
                : (str1.substring(0, 1) + str1.substring((str1.length() / 2), (str1.length() / 2 + 1))
                        + str1.substring(str1.length() - 1)));

    }

    // MENU
    public static void menu(Scanner scan) {
        System.out.println("\nEnter the exercise you want to run: ");
        System.out.println("0. Compare 2 strings ");
        System.out.println("1. Count character in String ");
        System.out.println("2. Reverse String ");
        System.out.println("3. String1 substring strig2");
        System.out.println("4. Substring position");
        System.out.println("5. Reverse string in new string ");
        System.out.println("6. Length string even, odd");
        System.out.println("7. End program");
        System.out.println("enter your option: ");
        int c = scan.nextInt();
        scan.nextLine();// CLEAN BUFFER
        switch (c) {
            case 0:
                compare2strings(scan);
                menu(scan);
            case 1:
                countCharacters(scan);
                menu(scan);
            case 2:
                reverseString(scan);
                menu(scan);
            case 3:
                subStrings(scan);
                menu(scan);
            case 4:
                printPosition(scan);
                menu(scan);
            case 5:
                strReversed(scan);
                menu(scan);
            case 6:
                charGame(scan);
                menu(scan);
            case 7:
                System.out.println("Closing the program... ");
                break;
            default:
                System.out.println("Not valid option, try again.");
                menu(scan);
        }

    }
}
