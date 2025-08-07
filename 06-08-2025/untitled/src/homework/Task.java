package homework;

class Task {
    private String name;
    private int priority; // Số nhỏ hơn = ưu tiên cao hơn

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getters
    public String getName() { return name; }
    public int getPriority() { return priority; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPriority(int priority) { this.priority = priority; }

    @Override
    public String toString() {
        return String.format("Task { name='%s', priority=%d }",
                name, priority);
    }
}