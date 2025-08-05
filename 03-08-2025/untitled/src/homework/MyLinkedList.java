package homework;

public class MyLinkedList {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size = 0;

    // 1. addFirst(int element)
    public void addFirst(int element) {
        Node newNode = new Node(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 3. addLast(int element)
    public void addLast(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
        size++;
    }

    // 4. add(int index, int element)
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        Node p = head;
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }
        newNode.next = p.next;
        p.next = newNode;
        size++;
    }

    // 5. removeFirst()
    public void removeFirst() {
        if (head == null) return;
        head = head.next;
        size--;
    }

    // 6. removeLast()
    public void removeLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
        } else {
            Node p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            p.next = null;
        }
        size--;
    }

    // 7. remove(int index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node p = head;
        for (int i = 0; i < index - 1; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        size--;
    }

    // 8. getFirst()
    public int getFirst() {
        if (head == null) throw new IllegalStateException("Empty list");
        return head.data;
    }

    // 9. getLast()
    public int getLast() {
        if (head == null) throw new IllegalStateException("Empty list");
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        return p.data;
    }

    // 10. get(int index)
    public int get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }

    // 11. set(int index, int element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.data = element;
    }

    // 12. indexOf(int element)
    public int indexOf(int element) {
        Node p = head;
        int index = 0;
        while (p != null) {
            if (p.data == element) return index;
            p = p.next;
            index++;
        }
        return -1;
    }

    // 13. lastIndexOf(int element)
    public int lastIndexOf(int element) {
        Node p = head;
        int index = 0;
        int lastIndex = -1;
        while (p != null) {
            if (p.data == element) {
                lastIndex = index;
            }
            p = p.next;
            index++;
        }
        return lastIndex;
    }

    // 2. toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        while (p != null) {
            sb.append(p.data);
            if (p.next != null) sb.append(", ");
            p = p.next;
        }
        sb.append("]");
        return sb.toString();
    }
}


