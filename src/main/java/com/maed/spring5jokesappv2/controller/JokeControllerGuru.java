package com.maed.spring5jokesappv2.controller;

import com.maed.spring5jokesappv2.services.JokeServiceGuru;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeControllerGuru {

    private final JokeServiceGuru jokeServiceGuru;

    public JokeControllerGuru(JokeServiceGuru jokeServiceGuru) {
        this.jokeServiceGuru = jokeServiceGuru;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeServiceGuru.getJoke());

        return "index";
    }

}
