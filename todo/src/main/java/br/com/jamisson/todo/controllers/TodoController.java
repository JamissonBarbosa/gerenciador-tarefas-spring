package br.com.jamisson.todo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jamisson.todo.repositories.TodoRepository;


@Controller
public class TodoController {

  private final TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }
  
  @GetMapping("/")
  public ModelAndView list(){
    //var modelAndView = new ModelAndView("todo/list");
    //modelAndView.addObject( "todo", todoRepository.findAll());
    //return modelAndView;

    return new ModelAndView(
      "todo/list",
      Map.of("todos", todoRepository.findAll())
    );
  }
}
