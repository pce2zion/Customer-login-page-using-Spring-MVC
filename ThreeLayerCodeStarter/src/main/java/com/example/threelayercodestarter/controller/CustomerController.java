package com.example.threelayercodestarter.controller;

import com.example.threelayercodestarter.entity.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

//    This method is used to remove any white space in form elements
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showForm")
    public String showForm(Model model){
        Customer customer = Customer.builder().build();
        model.addAttribute("customer", customer);
        return "customer-form";
    }

    @GetMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult theBindingResult){
        if(theBindingResult.hasErrors()){
            return "customer-form";
        }
        else {
            return "customer-view";
        }

    }

}
