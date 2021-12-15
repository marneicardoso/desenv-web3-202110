package web.java_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    
    /*@RequestMapping("/")
    public String home() {
        return "index";
    }*/

    @RequestMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @RequestMapping("/contato")
    public String contato() {
        return "contato";
    }

    @RequestMapping("/")
    public String home(Model model) {
        // Adiciona um texto na variável mensagem
        model.addAttribute("mensagem", "Mensagem vinda do Model");
        return "index";
    }
}
