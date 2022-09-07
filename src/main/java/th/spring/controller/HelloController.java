package th.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // controller annotation 해줘야 함
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "bye");
        return "hello";
    }
    // ./gradlew build
    // cd build/libs
    // java -jar hello-spring-0.0.1-SNAPSHOT.jar -> build and start
}
