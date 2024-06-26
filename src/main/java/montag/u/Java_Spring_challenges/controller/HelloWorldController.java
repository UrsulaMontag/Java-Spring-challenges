package montag.u.Java_Spring_challenges.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloWorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public String helloSomeone(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
