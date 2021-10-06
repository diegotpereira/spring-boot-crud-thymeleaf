package br.com.java.springbootcrudthymeleaf.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class HomeControlle {
    
    @GetMapping(value = "/")
    public String Home(Model model) {
        return "index";
    }
}
