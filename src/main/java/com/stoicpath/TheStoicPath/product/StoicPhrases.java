package com.stoicpath.TheStoicPath.product;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class StoicPhrases {

    private final List<String> phrases = Arrays.asList(
           "You have power over your mind.",
           "The happiness of your life depends on thoughts.",
           "Waste no more time arguing about virtue.",
           "Think of the privilege to be alive.",
           "The best revenge is to be unlike.",
           "Do not waste time on what you cannot control.",
           "Suffering is part of the human condition.",
           "Fortune favors the bold, but the wise are prudent.",
           "Control your desires to achieve tranquility.",
           "The wise man is always content.",
           "A man who overcomes himself is truly free.",
           "To rule is to make difficult decisions.",
           "Focus on what is within your control.",
           "Life is a battle; fight it wisely.",
           "Accept your fate and find peace."
    );

    private final Random random = new Random();

    public String getRandomPhrase() {
        return phrases.get(random.nextInt(phrases.size()));
    }
}
