package homework;

public class MyLinkedList {
//    Có bao nhiêu loại liên kết:
//    1. liên kết đơn
//    2. liên kết đôi
//    3. liên kết vòng
    private static class Node {
        private int data;
        private Node next;

        public Node() {}

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, int data) {
        if (index < 0 || index > size) {
            System.out.println("Lỗi: Ngoài phạm vi!");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node currrent = head;
            for (int i = 1; i < index; i++) {
                currrent = currrent.next;
            }

            Node newNode = new Node(data);
            newNode.next = currrent.next;
            currrent.next = newNode;
            size++;
        }
    }

    public Integer removeFirst() {
        if (head == null) {
            return null;
        }

        if (size == 1) {
            head = null;
            tail = null;
        }

        Node temp = head;
        head = head.next;
        size--;
        return temp.data;
    }

    public Integer removeLast() {
        if (head == null) {
            return null;
        }

        if (size == 1) {
            head = null;
            tail = null;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int data = tail.data;
        tail = temp;
        tail.next = null;

        size--;
        return data;
    }

    
    public boolean search(int data) {
        Node current = new Node();
        return current.data == data;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.data).append("\t");
            temp = temp.next;
        }
        return stringBuilder.toString();
    }
}

