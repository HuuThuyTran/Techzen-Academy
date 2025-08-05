package homework;

public class Test {
    public static void main(String[] args) {
        // Bài số 1:
        MyArrayList list = new MyArrayList();
        System.out.println("========== MY ARRAYLIST ==========");
        System.out.println("=== Test add(element) ===");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println(list); // [10, 20, 30, 20]

        System.out.println("=== Test add(index, element) ===");
        list.add(1, 15);
        System.out.println(list); // [10, 15, 20, 30, 20]

        System.out.println("=== Test set(index, element) ===");
        list.set(2, 99);
        System.out.println(list); // [10, 15, 99, 30, 20]

        System.out.println("=== Test get(index) ===");
        System.out.println("Element at index 3: " + list.get(3)); // 30

        System.out.println("=== Test indexOf(element) ===");
        System.out.println("First index of 20: " + list.indexOf(20)); // 4

        System.out.println("=== Test lastIndexOf(element) ===");
        list.add(20);
        System.out.println("Last index of 20: " + list.lastIndexOf(20)); // 5

        System.out.println("=== Test remove(index) ===");
        list.remove(1);
        System.out.println(list); // [10, 99, 30, 20, 20]

        System.out.println("=== Test removeElement(element) ===");
        list.removeElement(20);
        System.out.println(list); // [10, 99, 30]

        // Bài số 2:
        MyLinkedList list1 = new MyLinkedList();
        System.out.println("========== MY LINKED LIST ==========");
        System.out.println("=== Test addFirst, addLast ===");
        list1.addFirst(30);
        list1.addFirst(20);
        list1.addLast(40);
        list1.addFirst(10);
        System.out.println(list1); // [10, 20, 30, 40]

        System.out.println("=== Test add(index, element) ===");
        list1.add(2, 25);
        System.out.println(list1); // [10, 20, 25, 30, 40]

        System.out.println("=== Test removeFirst & removeLast ===");
        list1.removeFirst();
        list1.removeLast();
        System.out.println(list1); // [20, 25, 30]

        System.out.println("=== Test remove(index) ===");
        list1.remove(1);
        System.out.println(list1); // [20, 30]

        System.out.println("=== Test getFirst & getLast ===");
        System.out.println("First: " + list1.getFirst()); // 20
        System.out.println("Last: " + list1.getLast());   // 30

        System.out.println("=== Test get(index) ===");
        System.out.println("Element at index 1: " + list1.get(1)); // 30

        System.out.println("=== Test set(index, element) ===");
        list1.set(1, 99);
        System.out.println(list1); // [20, 99]

        System.out.println("=== Test indexOf & lastIndexOf ===");
        list1.addLast(20);
        list1.addLast(99);
        System.out.println("Index of 20: " + list1.indexOf(20)); // 0
        System.out.println("Last index of 99: " + list1.lastIndexOf(99)); // 3
        System.out.println(list1); // [20, 99, 20, 99]
    }
}
