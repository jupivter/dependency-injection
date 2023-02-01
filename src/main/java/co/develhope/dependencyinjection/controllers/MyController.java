package co.develhope.dependencyinjection.controllers;

import co.develhope.dependencyinjection.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        System.out.println("MyController constructor has been called");
        this.service = service;
    }

    @GetMapping
    public String helloMsg(){
        System.out.println("MyController helloMsg has been called");
        return "Hello, thanks for visiting us!";
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController getName has been called");
        return service.getName();
    }

}
