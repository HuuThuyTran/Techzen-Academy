package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Array:
        int[] numbers = {11, 22, 33, 44, 55, 66};
        int[] numbers2 = new int[5];

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Array: " + Arrays.toString(numbers2));
        System.out.println("Array[1]: " + numbers[1]);
//        System.out.println("Array[6]: " + numbers[6]);

        // Browse array:
        System.out.println("Browse array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Browse array with for-each:
        for (int number: numbers) {
            System.out.println("number = " + number);
        }

        // Array with String:
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Array of Strings: " + Arrays.toString(names));
        System.out.println("First name: " + names[0]);
        
        // Browse array of Strings:
        System.out.println("Browse array of Strings:");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

    }
}
