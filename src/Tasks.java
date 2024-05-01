public class Tasks implements Comparable<Tasks>{
    private String name;
    private String description;
    private int priority;

    public Tasks(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "\nTask: " + this.getName() +
                "\nDescription: " + this.getDescription() +
                "\nPriority: " + this.getPriority();
    }

    @Override
    public int compareTo(Tasks other) {
        if (this.priority < other.priority) {
            return this.priority;
        }
        else
            return this.name.compareTo(other.name);
    }
}