package com.example.threelayercodestarter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController {

    @GetMapping("/showForm")
    public String showMyPage(Model model){
        return "Home";
    }

    @GetMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @GetMapping("/processFormVersionTwo")
        public String letsShoutDude(HttpServletRequest request , Model model){
        String name = request.getParameter("studentName").toUpperCase();

        String message = "Yo" + name;

        model.addAttribute("mess", message);

        return "helloworld";
    }

    @GetMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model){
        String newName = "Yo" + name.toUpperCase() ;
        model.addAttribute("mess", newName);
        return "helloworld";
    }


//    @GetMapping("/processFormVersionThree")
//    public String processFormVersionThree(@RequestParam("studentName") String name, Model model){
////        String name = request.getParameter("studentName").toUpperCase();
//
//        String message = "Hey" + name.toUpperCase();
//
//        model.addAttribute("mess", message);
//
//        return "helloworld";
//    }

}
