package com.example.chatbot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ResponseGenerator {

    private final List<String> jokes;
    private final Random random;

    public ResponseGenerator() {
        jokes = new ArrayList<>();
        jokes.add("Why don't scientists trust atoms? Because they make up everything!");
        jokes.add("What do you get if you cross a snowman and a vampire? Frostbite.");
        jokes.add("Why was the math book sad? Because it had too many problems.");
        jokes.add("What do you call a lazy kangaroo? Pouch potato!");
        jokes.add("What do you call a fake noodle? An impasta!");
        jokes.add("What do you call a cow with no legs? Ground beef!");
        jokes.add("Why did the chicken cross the playground? To get to the other slide!");
        jokes.add("Why did the book win an award? Because it was outstanding in its field!");
        jokes.add("What do you call a fish with no legs? Fillet mignon!");
        jokes.add("Why did the man quit his job at the bank? Because he didn't like the vault!");
        jokes.add("Why did the belt win the award? Because it was the best dressed at the party!");
        jokes.add("Did you hear about the restaurant on the moon? Great food, no atmosphere!");
        jokes.add("What do you call a computer that sings? A dell!");
        jokes.add("Parallel lines have so much in common. It’s a shame they’ll never meet.");
        jokes.add("I told my wife she should embrace her mistakes. She gave me a hug.");
        jokes.add("I'm reading a book on anti-gravity. It's impossible to put down!");
        jokes.add("Why don't eggs tell jokes? Because they might crack up.");
        jokes.add("I used to play piano by ear, but now I use my hands.");
        jokes.add("I'm writing a book. I've got the page numbers done.");
        jokes.add("How do you catch a squirrel? Climb up a tree and act like a nut!");
        jokes.add("Why was the broom late? It swept in!");
        jokes.add("What did one ocean say to the other ocean? Nothing, they just waved.");
        jokes.add("How does a penguin build its house? Igloos it together!");
        jokes.add("What do you call a nosey pepper? A jalapeno business!");
        jokes.add("Why did the golfer wear two pairs of pants? In case he got a hole in one!");
        jokes.add("I used to be addicted to soap, but I’m clean now.");
        jokes.add("What do you call a fish with no eyes? Fsh!");
        jokes.add("When does a joke become a dad joke? When it’s groan up!");
        jokes.add("Why did the scarecrow win an award? Because he was outstanding in his field!");
        jokes.add("Why did the coffee file for a divorce? Because it grounds for beans!");
        jokes.add("What do you call a parade of rabbits hopping backwards? A receding hare-line!");
        jokes.add("What do you call a bear with no teeth? A gummy bear!");
        jokes.add("Why did the scarecrow win an award? Because he was outstanding in his field!");
        jokes.add("Why did the scarecrow win an award? Because he was outstanding in his field!");
        jokes.add("What did the left eye say to the right eye? Between you and me, something smells!");
        jokes.add("Why did the golfer wear two pairs of pants? In case he got a hole in one!");
        jokes.add("Did you hear about the restaurant on the moon? Great food, no atmosphere!");
        jokes.add("What do you call a cheese that isn't yours? Nacho cheese!");
        random = new Random();
    }

    public String getJoke(String input) {
        input = input.toLowerCase();
        if (input.equals("hi")) {
            return "You should not get bored in life. Here is a game: you give me a lucky number from 1-100, and I will give you a joke and make you smile.";
        } else if (isLuckyNumber(input)) {
            return getRandomJoke();
        } else {
            return "I'm sorry, I don't understand that. Please enter 'hi' to start or give me a lucky number from 1-100 for a joke that will make you smile";
        }
    }

    private boolean isLuckyNumber(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 1 && number <= 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String getRandomJoke() {
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    }
}
