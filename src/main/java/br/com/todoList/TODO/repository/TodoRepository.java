package br.com.todoList.TODO.repository;

import br.com.todoList.TODO.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
