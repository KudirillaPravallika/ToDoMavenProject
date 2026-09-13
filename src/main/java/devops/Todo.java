package devops;

public class Todo {

    private String task;
    private boolean completed;

    public Todo(String task) {
        this.task = task;
        this.completed = false;
    }

    public String getTask() {
        return task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void completeTask() {
        completed = true;
    }

    public String getStatus() {
        return completed ? "Completed" : "Pending";
    }
}