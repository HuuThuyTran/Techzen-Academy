package BaiSang;

public class ConvertDataType {
    public static void main(String[] args) {
//        String a = "10";
//        System.out.println(a.getClass().getSimpleName()); // in ra kiểu dữ liệu c1
//        double b = 10;
//        System.out.println(((Object) b).getClass().getSimpleName()); // in ra kiểu dữ liệu c1

        System.out.println("String to int: " + Integer.parseInt("10"));
        System.out.println("String to long" + Long.parseLong("20"));
        System.out.println("String to float");
        System.out.println("String to double");
        System.out.println("String to short");
        System.out.println("Int to String");
        System.out.println("Long to String");
        System.out.println("Float to String" + String.valueOf(20.4));
        System.out.println("short to String");
    }
}
