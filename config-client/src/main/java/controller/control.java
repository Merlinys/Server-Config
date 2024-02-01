package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
    @GetMapping("${hola}")
    public String string(){
        return "hola";
    }
}
