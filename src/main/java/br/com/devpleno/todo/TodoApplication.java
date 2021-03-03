package br.com.devpleno.todo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.devpleno.todo.model.Todo;
import br.com.devpleno.todo.repository.TodoRepository;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
	
	@Autowired
	private TodoRepository repo;
	

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Todo todo = new Todo();
		todo.setDescription("Estudar Spring");
		todo.setCreateDate(LocalDateTime.now());
		repo.save(todo);
		
	}

}
