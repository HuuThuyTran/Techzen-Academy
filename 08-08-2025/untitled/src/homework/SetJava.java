package homework;

import java.util.*;

public class SetJava {
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    private static void showMenu() {
        System.out.println("===== MENU CHƯƠNG TRÌNH =====");
        System.out.println("1. Loại bỏ các phần tử trùng lặp");
        System.out.println("2. Tính tổng các phần tử không trùng");
        System.out.println("3. Tìm phần tử chung của hai mảng");
        System.out.println("4. Tìm giá trị lớn nhất và nhỏ nhất");
        System.out.println("5. Kết thúc chương trình");
        System.out.print("-> Nhập các lựa chọn trên: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    private static void handleChoice(Integer[] arr1, Integer[] arr2) {
        while (true) {
           try {
               showMenu();
               switch (choice) {
                case 1 -> removeDuplicateElements(arr1);
                case 2 -> calculateSumElements(arr1);
                case 3 -> findCommonElementOfTwoArrays(arr1, arr2);
                case 4 -> findMaxAndMin(arr1);
                   case 5 -> {
                       System.err.println("Kết thúc chương trình!");
                       return;
                   }
                   default -> System.out.println("-> Bạn nhập sai số, hãy nhập lại!");
               }
           } catch (NumberFormatException e) {
               System.out.println("-> Bạn phải nhập số, hãy nhập lại! ");
               System.out.println("-> Lỗi: " + e.getMessage());
           }
        }
    }

    private static void removeDuplicateElements(Integer[] arr) {
        System.out.println("Danh sách các phần tử ban đầu: " + Arrays.toString(arr));
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(arr));
        System.out.println("Danh sách các phần tử không trùng lặp: " + uniqueNumbers);
    }

    private static void calculateSumElements(Integer[] arr) {
        System.out.println("Danh sách các phần tử ban đầu: " + Arrays.toString(arr));
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(arr));

        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        System.out.println("Danh sách các phần tử không trùng lặp: " + uniqueNumbers);
        System.out.println("Tổng các phần tử không trùng là: " + sum);
    }

    private static void findCommonElementOfTwoArrays(Integer[] arr1, Integer[] arr2) {
        System.out.println("Danh sách ban đầu của arr1: " + Arrays.toString(arr1));
        System.out.println("Danh sách ban đầu của arr2: " + Arrays.toString(arr2));

        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));

        Set<Integer> common = new HashSet<>();
        // C1
        for (Integer num : set1) {
            if (set2.contains(num)) {
                common.add(num);
            }
        }
        // C2
        // set2.retainAll(set1);
        System.out.println("Các phần tử chung: " + common);
    }

    private static void findMaxAndMin(Integer[] arr) {
        System.out.println("Danh sách ban đầu của arr: " + Arrays.toString(arr));
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(arr));

        Integer max = numbers.last();
        System.out.println("Giá trị lớn nhất: " + max);

        Integer min = numbers.first();
        System.out.println("Giá trị nhỏ nhất: " + min);
    }

    public static void main(String[] args) {
        Integer[] numbers1 = {33, 80, 90, 44, 11, 66};
        Integer[] numbers2 = {11, 22, 33, 55, 22, 44};
        handleChoice(numbers1, numbers2);
    }

}
