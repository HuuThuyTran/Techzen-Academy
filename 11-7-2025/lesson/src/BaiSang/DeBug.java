package BaiSang;

import java.util.Scanner;

public class DeBug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";

        // a.
        System.out.println("Bài a: " + str.substring(6));

        // b.
        System.out.println("Bài b: " + str.replace("o", "f"));

        // c.
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("Bài c: " + count);

        // d.
        for (int i = 0; i < str.length(); i++) {

        }


        // e.
        System.out.println("Bài e: " + str.replace(" ", ""));

        // f.
        System.out.println("Bài f: " + str.trim());

        // g.
        String strNew = "dlroW";
        String reverted = "";
        for (int i = strNew.length(); i > 0; i--) {
            reverted += strNew.charAt(i - 1);
        }
        System.out.println("Bài g: " + reverted);

        // h.
        String strNew1 = "SQC";
        System.out.println("Bài h: " + strNew1.concat(" " + str));

        // i.
        String S = "Sussojuma";
        System.out.println("Bài i: " + S.toUpperCase());

        // k.
        System.out.println("Bài k: " + S.toLowerCase());

        // l.
        int n, m;
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        System.out.print("Nhập m: ");
        m = sc.nextInt();

        System.out.println("Bài l: " + S.substring(n - 1, m));
    }
}
