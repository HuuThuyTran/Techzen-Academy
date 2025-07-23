package array2;

import java.util.Arrays;

public class Array2DExample {

    public static void main(String[] args) {
        // 1. KHAI BÁO VÀ KHỞI TẠO MẢNG 2 CHIỀU

        // Cách 1: Khai báo và khởi tạo với kích thước cố định
        int[][] matrix1 = new int[3][4]; // 3 hàng, 4 cột

        // Cách 2: Khai báo và khởi tạo với giá trị
        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Cách 3: Khai báo riêng
        int[][] matrix3;
        matrix3 = new int[2][3];

        // Cách 4: Mảng jagged (các hàng có độ dài khác nhau)
        int[][] jaggedArray = {
                {1, 2},
                {3, 4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("=== KHỞI TẠO VÀ GÁN GIÁ TRỊ ===");

        // 2. GÁN GIÁ TRỊ CHO MẢNG
        // Gán từng phần tử
        matrix1[0][0] = 100;
        matrix1[0][1] = 200;
        matrix1[1][2] = 300;

        // Gán giá trị cho toàn bộ mảng
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = i * 10 + j;
            }
        }

        // 3. IN MẢNG
        System.out.println("Matrix1:");
        printMatrix(matrix1);

        System.out.println("Matrix2:");
        printMatrix(matrix2);

        System.out.println("Jagged Array:");
        printMatrix(jaggedArray);

        // 4. CÁC THAO TÁC CƠ BẢN
        System.out.println("\n=== CÁC THAO TÁC CƠ BẢN ===");

        // Lấy kích thước
        System.out.println("Số hàng của matrix2: " + matrix2.length);
        System.out.println("Số cột của matrix2: " + matrix2[0].length);

        // Tìm giá trị lớn nhất
        int max = findMax(matrix2);
        System.out.println("Giá trị lớn nhất: " + max);

        // Tìm giá trị nhỏ nhất
        int min = findMin(matrix2);
        System.out.println("Giá trị nhỏ nhất: " + min);

        // Tính tổng các phần tử
        int sum = calculateSum(matrix2);
        System.out.println("Tổng các phần tử: " + sum);

        // Tìm kiếm phần tử
        int target = 7;
        int[] position = findElement(matrix2, target);
        if (position != null) {
            System.out.println("Tìm thấy " + target + " tại vị trí: [" +
                    position[0] + "][" + position[1] + "]");
        }

        // 5. CÁC THAO TÁC NÂNG CAO
        System.out.println("\n=== CÁC THAO TÁC NÂNG CAO ===");

        // Chuyển vị ma trận
        int[][] transposed = transposeMatrix(matrix2);
        System.out.println("Ma trận chuyển vị:");
        printMatrix(transposed);

        // Nhân hai ma trận
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Tích hai ma trận:");
        printMatrix(product);

        // Sắp xếp mảng 2D theo hàng
        int[][] matrixToSort = {
                {3, 1, 4},
                {6, 2, 8},
                {9, 5, 7}
        };
        System.out.println("Ma trận trước khi sắp xếp:");
        printMatrix(matrixToSort);

        sortMatrixByRows(matrixToSort);
        System.out.println("Ma trận sau khi sắp xếp từng hàng:");
        printMatrix(matrixToSort);

        // 6. THAO TÁC VỚI CHUỖI
        System.out.println("\n=== MẢNG 2D VỚI CHUỖI ===");
        String[][] stringMatrix = {
                {"Java", "Python", "C++"},
                {"HTML", "CSS", "JavaScript"},
                {"MySQL", "MongoDB", "Redis"}
        };

        System.out.println("Ma trận chuỗi:");
        printStringMatrix(stringMatrix);

        // Tìm chuỗi dài nhất
        String longest = findLongestString(stringMatrix);
        System.out.println("Chuỗi dài nhất: " + longest);
    }

    // Phương thức in ma trận số nguyên
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Phương thức in ma trận chuỗi
    public static void printStringMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%12s", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Tìm giá trị lớn nhất
    public static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Tìm giá trị nhỏ nhất
    public static int findMin(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    // Tính tổng các phần tử
    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Tìm kiếm phần tử
    public static int[] findElement(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null; // Không tìm thấy
    }

    // Chuyển vị ma trận
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    // Nhân hai ma trận
    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        // Kiểm tra điều kiện nhân ma trận
        if (colsA != b.length) {
            System.out.println("Không thể nhân hai ma trận này!");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    // Sắp xếp từng hàng của ma trận
    public static void sortMatrixByRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }

    // Tìm chuỗi dài nhất trong ma trận
    public static String findLongestString(String[][] matrix) {
        String longest = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].length() > longest.length()) {
                    longest = matrix[i][j];
                }
            }
        }
        return longest;
    }
}
