package devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodoTest {

    @Test
    public void testAddTask() {

        TodoApp app = new TodoApp();

        app.addTask("Study Jenkins");

        assertEquals(1, app.getTaskCount());
    }

    @Test
    public void testCompleteTask() {

        Todo todo = new Todo("Complete assignment");

        assertFalse(todo.isCompleted());

        todo.completeTask();

        assertTrue(todo.isCompleted());
    }
}