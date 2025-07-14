package BaiChieu;

public class Bai1 {
    public static void main(String[] args) {
        String text = "Trong bốn mùa, mùa xuân là mùa đẹp nhất trong năm. " +
                      "Đối với em điều tuyệt vời nhất là được ngắm nhìn buổi sáng của mùa xuân trên quê hương của em. " +
                      "Không khí buổi sáng vô cùng trong lành và mát mẻ. " +
                      "Vì sao em lại thích mùa xuân ? " +
                      "Bởi vì em yêu nó, nó là mùa mà em nhận được tiền mừng lì xì ! " +
                      "Thật vậy à ? ";

        // a.
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                count1++;
            } else if (text.charAt(i) == '!'){
                count2++;
            } else if (text.charAt(i) == '?'){
                count3++;
            }
        }
        System.out.println("Tổng số câu: " + count1 * 2);
        // b.
        System.out.println("Tổng số câu trần thuần: " + count1);
        System.out.println("Tổng số câu cảm thán: " + count2);
        System.out.println("Tổng số câu hỏi: " + count3);
    }
}
