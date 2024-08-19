package com.stoicpath.TheStoicPath.product;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class StoicPhrases {

    private final List<String> phrases = Arrays.asList(
        "\"You have power over your mind.\"",
        "\"The happiness of your life depends on thoughts.\"",
        "\"Waste no more time arguing about virtue.\"",
        "\"Think of the privilege to be alive.\"",
        "\"The best revenge is to be unlike.\"",
        "\"Do not waste time on what you cannot control.\"",
        "\"Everything we hear is an opinion.\"",
        "\"You are a citizen of the world.\"",
        "\"Our life is what our thoughts make it.\"",
        "\"He who lives in harmony with himself.\"",
        "\"The soul becomes dyed with its thoughts.\"",
        "\"It is not death that a man should fear.\"",
        "\"The impediment to action advances action.\"",
        "\"If you are pained, it is your estimate.\"",
        "\"To live is the rarest thing in the world.\"",
        "\"If you seek tranquillity, do not add.\"",
        "\"The more we value things outside control.\"",
        "\"Find one's passion to deal meaningfully with life.\"",
        "\"What we do now echoes in eternity.\"",
        "\"The universe is change; our life is thoughts.\""
    );

    private final Random random = new Random();

    public String getRandomPhrase() {
        return phrases.get(random.nextInt(phrases.size()));
    }
}
