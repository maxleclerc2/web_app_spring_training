package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {
    private final ArrayList<Todo> todoList = new ArrayList<>();

    @PostMapping("/api/todo")
    public void addTodo(Todo newTodo) {
        this.todoList.add(newTodo);
    }

    @GetMapping("/api/todo")
    public ArrayList<Todo> getTodoList() {
        return todoList;
    }
}
