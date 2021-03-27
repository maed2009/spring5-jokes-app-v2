package com.maed.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeService {

    public String getMeAJoke(ChuckNorrisQuotes chuckNorrisQuotes) {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
