package clbo.ex_hellospring.controller;

import clbo.ex_hellospring.services.CalculateWeekDay;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Introduction {

    CalculateWeekDay cw;

    public Introduction(CalculateWeekDay cw){
        this.cw = cw;
    }

    // Exercise 1
    // Create an endpoint that greets the user with a friendly message
    @GetMapping("/")
    public String index(){
        return "<h1>Hi, Welcome to this introduction</h1>";
    }

    // Exercise: Echo
    // Create an endpoint that echo’s the users GET parameter from the URL.
    // E.g:  http://localhost:8080/echo?input=HelloWorldWill
    // display a message ”HelloWorld” on screen.
    @GetMapping("/echo")
    public String echo(@RequestParam String input){
        return input;
    }

    // Exercise: ErDetFredag?
    // Create an endpoint to mimic www.erdetfredag.dk with plain text
    @GetMapping("erdetfredag")
    public String erDetFredag(){
        return cw.erDetFredag();
    }

}
