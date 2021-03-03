package br.com.devpleno.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devpleno.todo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
