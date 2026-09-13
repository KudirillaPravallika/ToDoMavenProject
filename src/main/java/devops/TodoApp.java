package devops;

import java.util.ArrayList;
import java.util.List;

public class TodoApp {

    private List<Todo> todos = new ArrayList<>();

    public void addTask(String task) {
        todos.add(new Todo(task));
    }

    public void completeTask(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.get(index).completeTask();
        }
    }

    public void displayTasks() {
        for (int i = 0; i < todos.size(); i++) {
            Todo todo = todos.get(i);

            System.out.println(
                (i + 1) + ". " +
                todo.getTask() +
                " - " +
                todo.getStatus()
            );
        }
    }

    public int getTaskCount() {
        return todos.size();
    }

    public static void main(String[] args) {

        TodoApp app = new TodoApp();

        app.addTask("Complete DevOps assignment");
        app.addTask("Study for exam");
        app.addTask("Push project to GitHub");

        app.completeTask(0);

        System.out.println("TO-DO LIST";
        System.out.println("----------");

        app.displayTasks();
    }
}