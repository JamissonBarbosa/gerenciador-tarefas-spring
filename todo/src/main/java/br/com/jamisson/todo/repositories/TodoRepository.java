package br.com.jamisson.todo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jamisson.todo.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}
