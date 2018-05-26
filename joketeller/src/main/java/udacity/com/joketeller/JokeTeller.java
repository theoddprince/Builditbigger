package udacity.com.joketeller;

import java.util.Random;

public class JokeTeller {

    public String[] getJokes() {
        return jokes;
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

    private String[] jokes;
    private Random random;

    public JokeTeller() {
        jokes = new String[6];
        jokes[0] = "Q: What is a programmer's favorite hangout place ? A: Foo Bar.";
        jokes[1] = "Q: What do computers and air conditioners have in common ? A: They both become useless when you open windows.";
        jokes[2] = "Why do Java developers wear glasses? Because they can't C#";
        jokes[3] = "Q: How did the programmer die in the shower? A: He read the shampoo bottle instructions: Lather. Rinse. Repeat.";
        jokes[4] = "Programming is like sex: One mistake and you have to support it for the rest of your life.";
        jokes[5] = "Q: What is the biggest lie in the entire universe? A: I have read and agree to the Terms & Conditions. ";
        random = new Random();
    }

}
