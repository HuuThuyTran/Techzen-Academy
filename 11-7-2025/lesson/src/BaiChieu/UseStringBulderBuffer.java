package BaiChieu;

public class UseStringBulderBuffer {
    public static void main(String[] args) {
        String str = "Hello World";

//        StringBuffer sbf = new StringBuffer(str);
//        StringBuilder sbd = new StringBuilder(str);
        StringBuffer sbf = new StringBuffer();
        StringBuilder sbd = new StringBuilder();

//        // a. Cách sử dụng giống nhau
//        System.out.println("Lấy chữ world sử dụng StringBuffer: " + sbf.substring(6));
//        System.out.println("Lấy chữ world sử dụng StringBuilder: " + sbd.substring(6, 11));
//
//        // b.
//        System.out.println("Thay chữ o thành chữ f sử dụng StringBuffer: " + sbf.toString().replace('o', 'f'));
//        System.out.println("Thay chữ o thành chữ f sử dụng StringBuilder: " + sbf.toString().replace('o', 'f'));

        // c.
        String str1 = "Hello";
        String str2 = "World";
        // Sử dụng String
        System.out.println("1/ String: " + str1.concat(" " + str2));

        // Sử dụng StringBuffer
        sbf.append("Hello ");
        sbf.append("World");
        System.out.println("2/ StringBuilder: " + sbf);

        // Sử dụng StringBuilder
        sbd.append("Hello ");
        sbd.append("World");
        System.out.println("3/ StringBuffer: " + sbd);
    }
}
