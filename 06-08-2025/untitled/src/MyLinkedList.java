public class MyLinkedList<E> {
    private static class Node<E> {
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void addFirst(E value) {
        Node<E> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(E value) {
        if (head == null) {
            addFirst(value);
        } else {
            Node<E> newNode = new Node<>(value);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        } else if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node<E> temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }

            Node<E> newNode = new Node<>(value);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    public E removeFirst() {
        if (head == null) {
            return null;
        }

        Node<E> temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }

        size--;
        return temp.value;
    }

    public E removeLast() {
        if (head == null) {
            return null;
        }

        if (size == 1) {
            E value = head.value;
            head = null;
            tail = null;
            size--;
            return value;
        }

        Node<E> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        E value = tail.value;
        tail = temp;
        tail.next = null;

        size--;
        return value;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            stringBuilder.append(temp.value);
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
            temp = temp.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}