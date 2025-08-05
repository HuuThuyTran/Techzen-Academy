package homework;

import java.util.Arrays;

public class MyArrayList {
    private int[] data;
    private int size;


    public MyArrayList() {
        data = new int[10]; // mặc định ban đầu
        size = 0;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    // 1. add(int element)
    public void add(int element) {
        ensureCapacity();
        data[size++] = element;
    }

    //    3. add(int index, int element)
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = element;
        size++;
    }

    // 4. set(int index, int element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        data[index] = element;
    }

    // 5. get(int index)
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return data[index];
    }

    // 6. indexOf(int element)
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element) return i;
        }
        return -1;
    }

    // 7. lastIndexOf(int element)
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (data[i] == element) return i;
        }
        return -1;
    }

    // 8. remove(int index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    // 9. removeElement(int element)
    public void removeElement(int element) {
        int i = 0;
        while (i < size) {
            if (data[i] == element) {
                remove(i);
            } else {
                i++;
            }
        }
    }

    // 2. toString()
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(data[i]).append(", ");
        }
        sb.append(data[size - 1]).append("]");
        return sb.toString();
    }
}

