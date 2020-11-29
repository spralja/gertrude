import java.util.ArrayList;
import java.util.Random;



public class Mathcer {
    private Random random = new Random();
    private ArrayList<ArrayList <String> > keyWords = new ArrayList<ArrayList< String >>();;
    private ArrayList< ArrayList< String> > answers = new ArrayList< ArrayList< String > >();;
    private static final String NO_ANSWER = "Sorry, I do not understand, could you elaborate?";
    public Mathcer() {
        newMatch();
        addKeyWordTop(" hi ");
        addKeyWordTop(" hello ");
        addAnswersTop("Hello. What's up?");
        addAnswersTop("Hi, how are you doing?");
        /*

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" hi ");
        keyWords.get(keyWords.size() - 1).add(" hello ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Hello. What's up?");
            answers.get(answers.size() - 1).add("Hi, how are you doing?");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i like ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Hmm, interesting why do you like that?");
            answers.get(answers.size() - 1).add("I like that too! what are the odds?");


        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" hate ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Hate is a strong word. Maybe you should rephrase that.");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" love ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Wow, I love that too! What's your favorite thing about it?");
            answers.get(answers.size() - 1).add("I love love you know.... just to love something is incredible, whatever it is.. whatever the context... \n its just so nice to know that I, as a fully sentient being, can also feel!");


        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" nothing ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Okay.");
            answers.get(answers.size() - 1).add("Come on man give me something to work with here");


        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" how are you");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("I'm a robot, I don't have feelings. How about you?");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i am happy ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Great, what else is going on?");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i need ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("what is it that you need?");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" help ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("What do you need help with?");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i feel ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Feelings are good, you should tell me more about it");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" thank you ");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("you are most welcome my dear");

        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add("!");
            answers.add(new ArrayList<String>());
            answers.get(answers.size() - 1).add("Shouting is rude!");

         */
    }

    public String match(String question) {
        question = " " + question.toLowerCase() + " ";
        for(int i = 0; i < keyWords.size(); ++i) {
            for(int j = 0; j < keyWords.get(i).size(); ++j){
                if(question.contains(keyWords.get(i).get(j))) {
                    return answers.get(i).get(random.nextInt(answers.get(i).size()));
                }
            }
        }

        return NO_ANSWER;
    }

    public void addKeyWordTop(String string) {
        keyWords.get(keyWords.size() - 1).add(string);
    }

    public void addAnswersTop(String string) {
        answers.get(answers.size() - 1).add(string);
    }

    public void newMatch() {
        keyWords.add(new ArrayList< String >());
        answers.add(new ArrayList< String >());
    }
}
