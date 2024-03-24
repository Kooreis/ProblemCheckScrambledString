Here is a simple Java console application that checks if one string is a scrambled version of another:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        if (isScramble(str1, str2)) {
            System.out.println("The second string is a scrambled version of the first string.");
        } else {
            System.out.println("The second string is not a scrambled version of the first string.");
        }
    }

    public static boolean isScramble(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
```

This program works by first checking if the two strings are the same length. If they are not, it immediately returns false, as a scrambled version of a string must be the same length as the original string. If the strings are the same length, it converts each string to a character array, sorts the arrays, and then checks if the sorted arrays are equal. If they are, it means that the second string is a scrambled version of the first string.