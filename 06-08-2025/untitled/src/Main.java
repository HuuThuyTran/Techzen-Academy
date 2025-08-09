import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>();
//        integerMyLinkedList.addLast(10);
//
//        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();
//        stringMyLinkedList.addLast("hello");
        Stack<Integer> integers = new Stack<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số thập phân: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n != 0) {
            integers.push(n % 2);
            n /= 2;
        }

        while (!integers.isEmpty()) {
            System.out.print(integers.pop());
        }

    }
}
