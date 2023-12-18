package br.com.jamisson.todo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.jamisson.todo.repositories.TodoRepository;


@Controller
public class HomeController {

  private final TodoRepository todoRepository;

  public HomeController(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }
  
  @GetMapping("/")
  public ModelAndView home(){
    var modelAndView = new ModelAndView( "home");
    modelAndView.addObject("nome", "Jamisson");
    var alunos = List.of("Joao", "maria", "Jose");
    modelAndView.addObject("alunos", alunos);


    var todos = todoRepository.findAll();
    System.out.println(todos);

    return modelAndView;
  }
}
