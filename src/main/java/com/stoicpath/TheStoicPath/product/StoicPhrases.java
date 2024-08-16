package com.stoicpath.TheStoicPath.product;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class StoicPhrases {

    private final List<String> phrases = Arrays.asList(
        "The happiness of your life depends upon the quality of your thoughts.",
        "Waste no more time arguing about what a good man should be. Be one.",
        "He who lives in harmony with himself lives in harmony with the universe.",
        "You have power over your mind—not outside events. Realize this, and you will find strength.",
        "The only way to deal with this life meaningfully is to find one's passion and put everything into it.",
        "The best revenge is to be unlike him who performed the injustice.",
        "It is not death that a man should fear, but he should fear never beginning to live.",
        "Our life is what our thoughts make it.",
        "The universe is change; our life is what our thoughts make it.",
        "You are a little soul carrying around a corpse.",
        "Accept the things to which fate binds you, and love the people with whom fate brings you together.",
        "To be calm is the ultimate achievement.",
        "Be like the rock that the waves keep crashing over. It stands unmoved and the raging of the sea falls still around it.",
        "The soul becomes dyed with the color of its thoughts.",
        "The more we value things outside our control, the less control we have.",
        "Life is neither good nor evil, but only a place for good and evil.",
        "Everything that happens happens as it should, and if you observe carefully, you will find this to be so.",
        "You must learn to be indifferent to what makes no difference.",
        "He who is brave is free.",
        "The things you think about determine the quality of your mind.",
        "Do not waste time on what you cannot control.",
        "Let thy chief terror be of thine own soul.",
        "The only way to deal with fear is to face it head-on.",
        "He who has a why to live can bear almost any how.",
        "If you want to be rich, do not add to your possessions, but subtract from your desire.",
        "The good man is the man who can face whatever happens with courage.",
        "If you are distressed by anything external, the pain is not due to the thing itself, but to your estimate of it.",
        "The obstacle is the way.",
        "No man is free who is not master of himself.",
        "The life of the dead is placed in the memory of the living.",
        "A man’s worth is no greater than his ambitions.",
        "He who does not get upset by trifles will be happy.",
        "Be not a slave to your body.",
        "He who is not a good servant will not be a good master.",
        "The wise man is indifferent to things he cannot control.",
        "We suffer more in imagination than in reality.",
        "The unexamined life is not worth living.",
        "Your task is to stand straight, not to be held straight.",
        "The whole future lies in uncertainty: live immediately.",
        "Do not be a philosopher merely in words but also in actions.",
        "Those who are brave are not afraid of death.",
        "Learn to be indifferent to what makes no difference.",
        "You are a little soul carrying a corpse.",
        "It is not the events themselves that trouble us, but our interpretation of them.",
        "A wise man is content with what he has.",
        "Life is a journey, not a destination."
    );

    private final Random random = new Random();

    public String getRandomPhrase() {
        return phrases.get(random.nextInt(phrases.size()));
    }
}
