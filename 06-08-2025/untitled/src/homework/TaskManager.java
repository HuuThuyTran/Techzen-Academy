package homework;

import java.util.*;

public class TaskManager<T> {
    private Stack<T> taskStack;
    private Queue<T> taskQueue;
    private Stack<T> redoStack;

    public TaskManager() {
        taskStack = new Stack<>();
        taskQueue = new LinkedList<>();
        redoStack = new Stack<>();
    }

    // ---------------- STACK ----------------
    public void pushToStack(T task) {
        taskStack.push(task);
        redoStack.clear();
        System.out.println("Thêm task vào stack thành công!");
    }

    public T peekStack() {
        return taskStack.peek();
    }

    public T popFromStack() {
        T task = taskStack.pop();
        redoStack.push(task);
        System.out.println("Xóa task bên stack: " + task);
        return task;
    }

    public boolean isStackEmpty() {
        return taskStack.isEmpty();
    }

    public void displayStackTask() {
        while (!taskStack.isEmpty()) {
            System.out.println(taskStack.pop());
        }
    }

    // ---------------- QUEUE ----------------
    public void addToQueue(T task) {
        taskQueue.add(task);
        System.out.println("Thêm task vào queue thành công!");
    }

    public T peekQueue() {
        return taskQueue.peek();
    }

    public T pollFromQueue() {
        T task = taskQueue.poll();
        System.out.println("Xóa task bên queue: " + task);
        return task;
    }

    public boolean isQueueEmpty() {
        return taskQueue.isEmpty();
    }

    // ---------------- REDO TASK ----------------
    public T redoTask() {
        if (redoStack.isEmpty()) {
            System.out.println("Không thể khôi phục cái task đó!");
        }
        T task = redoStack.pop();
        taskStack.push(task);
        System.out.println("Redone task: " + task);
        return task;
    }

    // ---------------- FIND TASK HAVE HIGHEST PRIORITY ----------------
    private int getPriority(T task) {
        if (task instanceof Task) {
            return ((Task) task).getPriority();
        }
        throw new IllegalArgumentException("Task phải có getPriority()");
    }

    public T findTaskHighestPriority() {
        if (taskQueue.isEmpty()) return null;

        Queue<T> tempQueue = new LinkedList<>();
        T highestPriorityTask = null;

        // Bước 1: Tìm task có priority nhỏ nhất
        for (T task : taskQueue) {
            if (highestPriorityTask == null || getPriority(task) < getPriority(highestPriorityTask)) {
                highestPriorityTask = task;
            }
        }

        // Bước 2: Loại task có priority cao nhất khỏi Queue gốc
        for (T task : taskQueue) {
            if (!task.equals(highestPriorityTask)) {
                tempQueue.offer(task);
            }
        }

        // Bước 3: Gán lại tempQueue cho taskQueue
        taskQueue = tempQueue;
        return highestPriorityTask;
    }

    public void displayStack() {
        System.out.println("=== STACK CONTENTS ===");
        if (taskStack.isEmpty()) {
            System.out.println("Stack rỗng");
        } else {
            Stack<T> temp = new Stack<>();
            temp.addAll(taskStack);
            Collections.reverse(temp);
            int index = 0;
            for (T task : temp) {
                System.out.println(index + ": " + task);
                index++;
            }
        }
        System.out.println("======================");
    }

    public void displayStatus() {
        System.out.println("=== TASK MANAGER STATUS ===");
        System.out.println("Stack size: " + taskStack.size());
        System.out.println("Queue size: " + taskQueue.size());
        System.out.println("Redo stack size: " + redoStack.size());
        System.out.println("===========================");
    }
}
