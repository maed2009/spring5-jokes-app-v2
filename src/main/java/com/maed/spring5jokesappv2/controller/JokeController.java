package com.maed.spring5jokesappv2.controller;

import com.maed.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

//    @RequestMapping({"/", ""})
//    String getJoke(Model model) {
//        model.addAttribute("joke", jokeService.getMeAJoke());
//        return "index";
//    }
}
