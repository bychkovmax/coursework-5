package com.example.shop.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GameController {
    @RequestMapping("/game")
    @GetMapping("/game")
    public String game(Model model){
        model.addAttribute("game", "game");
        return "game";
    }
}
