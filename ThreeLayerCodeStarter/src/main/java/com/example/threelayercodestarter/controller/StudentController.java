package com.example.threelayercodestarter.controller;

import com.example.threelayercodestarter.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/showForm")
    public String ShowForm(Model model){
        Student student = Student.builder().build();
        model.addAttribute("student", student);
        return "student-form";
    }

    @GetMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("student = " + student.getLastName() + student.getFirstName());
        return "student-view";
    }
}
