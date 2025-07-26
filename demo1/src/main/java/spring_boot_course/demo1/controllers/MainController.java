package spring_boot_course.demo1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/hello")
    public String hello(){
        return "Hello, world!";
    }

    @GetMapping("/luck")
    public String goodLuck(){
        return "Good Luck!";
    }

    @GetMapping("/mouse")
    public String mouseInfo(){
        return "Coach name: " + coachName + " / Team name: " + teamName;
    }

}
