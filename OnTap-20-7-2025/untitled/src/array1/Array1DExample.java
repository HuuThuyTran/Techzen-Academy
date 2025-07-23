package array1;

import java.util.Arrays;

public class Array1DExample {
    public static void main(String[] args) {

        // 1. KHAI BÁO VÀ KHỞI TẠO MẢNG 1 CHIỀU
        System.out.println("=== KHAI BÁO VÀ KHỞI TẠO MẢNG ===");

        // Cách 1: Khai báo và khởi tạo với kích thước cố định
        int[] arr1 = new int[5]; // Mảng 5 phần tử, giá trị mặc định là 0

        // Cách 2: Khai báo và khởi tạo với giá trị
        int[] arr2 = {10, 20, 30, 40, 50};

        // Cách 3: Khai báo riêng
        int[] arr3;
        arr3 = new int[]{1, 2, 3, 4, 5, 6};

        // Cách 4: Sử dụng từ khóa new với giá trị
        int[] arr4 = new int[]{100, 200, 300};

        // Các kiểu dữ liệu khác
        double[] doubleArray = {1.5, 2.7, 3.9, 4.1};
        String[] stringArray = {"Java", "Python", "C++", "JavaScript"};
        boolean[] boolArray = {true, false, true, false};

        System.out.println("Kích thước arr2: " + arr2.length);
        System.out.println("Mảng arr2: " + Arrays.toString(arr2));

        // 2. GÁN GIÁ TRỊ CHO MẢNG
        System.out.println("\n=== GÁN GIÁ TRỊ CHO MẢNG ===");

        // Gán từng phần tử
        arr1[0] = 11;
        arr1[1] = 22;
        arr1[2] = 33;
        arr1[3] = 44;
        arr1[4] = 55;

        // Gán giá trị bằng vòng lặp
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // Các số chẵn: 0, 2, 4, 6...
        }

        System.out.println("Mảng arr1: " + Arrays.toString(arr1));
        System.out.println("Mảng numbers: " + Arrays.toString(numbers));

        // 3. TRUY CẬP VÀ IN MẢNG
        System.out.println("\n=== TRUY CẬP VÀ IN MẢNG ===");

        // Truy cập từng phần tử
        System.out.println("Phần tử đầu tiên của arr2: " + arr2[0]);
        System.out.println("Phần tử cuối cùng của arr2: " + arr2[arr2.length - 1]);

        // In mảng bằng vòng lặp for
        System.out.print("In arr2 bằng for: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // In mảng bằng enhanced for (for-each)
        System.out.print("In arr2 bằng for-each: ");
        for (int value : arr2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // In mảng bằng Arrays.toString()
        System.out.println("In arr2 bằng Arrays.toString(): " + Arrays.toString(arr2));

        // 4. CÁC THAO TÁC CƠ BẢN
        System.out.println("\n=== CÁC THAO TÁC CƠ BẢN ===");

        int[] data = {45, 23, 78, 12, 67, 34, 89, 56};
        System.out.println("Mảng data: " + Arrays.toString(data));

        // Tìm giá trị lớn nhất
        int max = findMax(data);
        System.out.println("Giá trị lớn nhất: " + max);

        // Tìm giá trị nhỏ nhất
        int min = findMin(data);
        System.out.println("Giá trị nhỏ nhất: " + min);

        // Tính tổng các phần tử
        int sum = calculateSum(data);
        System.out.println("Tổng các phần tử: " + sum);

        // Tính trung bình
        double average = calculateAverage(data);
        System.out.println("Trung bình: " + average);

        // Đếm số phần tử chẵn
        int evenCount = countEvenNumbers(data);
        System.out.println("Số phần tử chẵn: " + evenCount);

        // Tìm kiếm tuyến tính
        int target = 67;
        int index = linearSearch(data, target);
        if (index != -1) {
            System.out.println("Tìm thấy " + target + " tại vị trí: " + index);
        } else {
            System.out.println("Không tìm thấy " + target);
        }

        // 5. SẮP XẾP MẢNG
        System.out.println("\n=== SẮP XẾP MẢNG ===");

        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(unsorted));

        // Sắp xếp bằng Arrays.sort()
        int[] sorted1 = unsorted.clone();
        Arrays.sort(sorted1);
        System.out.println("Sắp xếp bằng Arrays.sort(): " + Arrays.toString(sorted1));

        // Sắp xếp nổi bọt (Bubble Sort)
        int[] sorted2 = unsorted.clone();
        bubbleSort(sorted2);
        System.out.println("Sắp xếp nổi bọt: " + Arrays.toString(sorted2));

        // Sắp xếp chọn (Selection Sort)
        int[] sorted3 = unsorted.clone();
        selectionSort(sorted3);
        System.out.println("Sắp xếp chọn: " + Arrays.toString(sorted3));

        // 6. THAO TÁC NÂNG CAO
        System.out.println("\n=== THAO TÁC NÂNG CAO ===");

        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Mảng gốc: " + Arrays.toString(originalArray));

        // Đảo ngược mảng
        int[] reversed = reverseArray(originalArray.clone());
        System.out.println("Mảng đảo ngược: " + Arrays.toString(reversed));

        // Xoay mảng sang phải
        int[] rotated = rotateRight(originalArray.clone(), 2);
        System.out.println("Xoay phải 2 vị trí: " + Arrays.toString(rotated));

        // Loại bỏ phần tử trùng lặp
        int[] withDuplicates = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int[] unique = removeDuplicates(withDuplicates);
        System.out.println("Mảng có trùng lặp: " + Arrays.toString(withDuplicates));
        System.out.println("Sau khi loại bỏ trùng lặp: " + Arrays.toString(unique));

        // Tìm phần tử xuất hiện nhiều nhất
        int[] frequency = {1, 2, 3, 2, 2, 1, 3, 2};
        int mostFrequent = findMostFrequent(frequency);
        System.out.println("Mảng: " + Arrays.toString(frequency));
        System.out.println("Phần tử xuất hiện nhiều nhất: " + mostFrequent);

        // 7. THAO TÁC VỚI MẢNG CHUỖI
        System.out.println("\n=== THAO TÁC VỚI MẢNG CHUỖI ===");

        String[] languages = {"Java", "Python", "C++", "JavaScript", "Go"};
        System.out.println("Mảng ngôn ngữ: " + Arrays.toString(languages));

        // Tìm chuỗi dài nhất
        String longest = findLongestString(languages);
        System.out.println("Chuỗi dài nhất: " + longest);

        // Sắp xếp theo thứ tự alphabet
        String[] sortedLangs = languages.clone();
        Arrays.sort(sortedLangs);
        System.out.println("Sắp xếp theo alphabet: " + Arrays.toString(sortedLangs));

        // Tìm kiếm chuỗi
        String searchStr = "Python";
        int strIndex = Arrays.asList(languages).indexOf(searchStr);
        System.out.println("Vị trí của '" + searchStr + "': " + strIndex);

        // 8. NHẬP MẢNG TỪ NGƯỜI DÙNG (Demo)
        System.out.println("\n=== DEMO NHẬP MẢNG TỪ NGƯỜI DÙNG ===");
        demonstrateUserInput();
    }

    // Tìm giá trị lớn nhất
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Tìm giá trị nhỏ nhất
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Tính tổng các phần tử
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Tính trung bình
    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    // Đếm số phần tử chẵn
    public static int countEvenNumbers(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Tìm kiếm tuyến tính
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Không tìm thấy
    }

    // Sắp xếp nổi bọt
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Sắp xếp chọn
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Đảo ngược mảng
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // Xoay mảng sang phải
    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Xử lý trường hợp k > n

        // Đảo ngược toàn bộ mảng
        reverseArray(arr);

        // Đảo ngược k phần tử đầu
        reverseSubArray(arr, 0, k - 1);

        // Đảo ngược n-k phần tử còn lại
        reverseSubArray(arr, k, n - 1);

        return arr;
    }

    // Đảo ngược một phần của mảng
    private static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Loại bỏ phần tử trùng lặp
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return arr;

        Arrays.sort(arr); // Sắp xếp trước
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1]; // Thêm phần tử cuối

        return Arrays.copyOf(temp, j);
    }

    // Tìm phần tử xuất hiện nhiều nhất
    public static int findMostFrequent(int[] arr) {
        int maxCount = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        return mostFrequent;
    }

    // Tìm chuỗi dài nhất
    public static String findLongestString(String[] arr) {
        String longest = arr[0];
        for (String str : arr) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    // Demo nhập mảng từ người dùng
    public static void demonstrateUserInput() {
        // Chỉ là demo, không thực thi Scanner trong ví dụ này
        System.out.println("Demo code nhập mảng từ người dùng:");
        System.out.println("Scanner scanner = new Scanner(System.in);");
        System.out.println("System.out.print(\"Nhập số phần tử: \");");
        System.out.println("int n = scanner.nextInt();");
        System.out.println("int[] arr = new int[n];");
        System.out.println("for (int i = 0; i < n; i++) {");
        System.out.println("    System.out.print(\"Nhập phần tử thứ \" + (i+1) + \": \");");
        System.out.println("    arr[i] = scanner.nextInt();");
        System.out.println("}");

        // Ví dụ với dữ liệu mẫu
        int[] sampleInput = {10, 5, 8, 3, 9};
        System.out.println("Ví dụ với dữ liệu mẫu: " + Arrays.toString(sampleInput));
    }
}