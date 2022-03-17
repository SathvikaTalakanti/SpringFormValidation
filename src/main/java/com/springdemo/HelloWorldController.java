package com.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController
{
    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
   public  String showForm()
   {
       return "helloworld-form";
   }

   // need a controller method to process the HTML form
   @RequestMapping("/processForm")
   public String processForm()
   {
       return "helloworld";
   }



   @RequestMapping("/processForm2")
   // read form data and adds it to model
    public String processForm2(HttpServletRequest request , Model model)
   {
       // HttpServletRequest is used to read form data in Controller class
       // Model is just a container that holds form data

       String name=request.getParameter("StudentName");
       name= name.toUpperCase();
       model.addAttribute("message",name);
       return "helloworld";
   }


    @RequestMapping("/processForm3")
    // read form data and adds it to model
    public String processForm3(@RequestParam("StudentName") String name, Model model)
    {
        // RequestParam will read the form data and bind it to the variable name
        // Model is just a container that holds form data

       //  there is no need of binding  String name=request.getParameter("StudentName");
        name= name.toUpperCase();
        String result ="HI "+name;
        model.addAttribute("message",result);
        return "helloworld";
    }

}
