package cl.praxis.DesafioSpring1.controller;

import cl.praxis.DesafioSpring1.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentController {

    @GetMapping("{name}/{lastname}/{age}")
    public String studentDetails (@PathVariable("name") String name,
                                  @PathVariable("lastname") String lastname,
                                  @PathVariable("age") int age,
                                  Model model){

        Student student= new Student(name,lastname, age);
        System.out.println(student);
        model.addAttribute("student", student);
        return  "index";
    }

    @GetMapping("saludo")
    public String saludo(){

        System.out.println("Hola, saludos");
        return "saludo";
    }
}
