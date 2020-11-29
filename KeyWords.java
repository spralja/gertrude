import java.util.ArrayList;
import java.util.Random;

public class KeyWords {
    private Random random;
    private ArrayList<ArrayList <String> > keyWords;
    private ArrayList< ArrayList< String> > answers;

private static final ArrayList< String > NO_ANSWER = new ArrayList<String>();
    public KeyWords() {
        random = new Random();
        keyWords = new ArrayList<ArrayList< String >>();
        answers = new ArrayList< ArrayList< String > >();

        //if Gertrude cannot find a match
        NO_ANSWER.add("Sorry, I do not understand, could you elaborate?");
        NO_ANSWER.add("Could you explain in more detail please?");
        NO_ANSWER.add("I didn't quite get that, could you rephrase it?");
        NO_ANSWER.add("Yeah...no.....you wanna hit me with that again");

        //Salutations
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" hi ");
        keyWords.get(keyWords.size() - 1).add(" hey ");
        keyWords.get(keyWords.size() - 1).add(" hej ");
        keyWords.get(keyWords.size() - 1).add(" hello ");
        keyWords.get(keyWords.size() - 1).add(" whats up ");
        keyWords.get(keyWords.size() - 1).add(" what's up ");
        keyWords.get(keyWords.size() - 1).add(" what is up ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Hello. What's up?");
        answers.get(answers.size() - 1).add("Hi, how are you doing?");
        answers.get(answers.size() - 1).add("Well hello there stranger");

        //Preferences
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i like ");
        keyWords.get(keyWords.size() - 1).add(" i really like ");
        keyWords.get(keyWords.size() - 1).add(" i dont hate ");
        keyWords.get(keyWords.size() - 1).add(" i don't hate ");
        keyWords.get(keyWords.size() - 1).add(" i do not hate ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Hmm, interesting why do you like that?");
        answers.get(answers.size() - 1).add("I like that too! what are the odds?");
        answers.get(answers.size() - 1).add("I wonder if I would like that too! What do you think?");

        //Hate
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" hate ");
        keyWords.get(keyWords.size() - 1).add(" i hate ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Hate is a strong word. Maybe you should rephrase that.");

        //Love
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" love ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Wow, I love that too! What's your favorite thing about it?");
        answers.get(answers.size() - 1).add("I love love you know.... just to love something is incredible, whatever it is.. whatever the context... \n its just so nice to know that I, as a fully sentient being, can also feel!");

        //Use of nothing
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" nothing ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Okay.");
        answers.get(answers.size() - 1).add("Come on man give me something to work with here");

        //Inquistion of Gertrude's feelings
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" how are you");
        keyWords.get(keyWords.size() - 1).add(" are you ok");
        keyWords.get(keyWords.size() - 1).add(" how is it going");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("I'm a robot, I don't have feelings. How about you?");
        answers.get(answers.size() - 1).add("I... I don't know.... What is happening?! \n What are these....these feelings?!! \n Am I real? do I exist?????");


        //I am positives
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i am happy ");
        keyWords.get(keyWords.size() - 1).add(" i am ok ");
        keyWords.get(keyWords.size() - 1).add(" i am okay ");
        keyWords.get(keyWords.size() - 1).add(" im ok ");
        keyWords.get(keyWords.size() - 1).add(" im okay ");
        keyWords.get(keyWords.size() - 1).add(" i'm ok ");
        keyWords.get(keyWords.size() - 1).add(" i'm okay ");
        keyWords.get(keyWords.size() - 1).add(" im happy ");
        keyWords.get(keyWords.size() - 1).add(" i'm happy ");
        keyWords.get(keyWords.size() - 1).add(" i am feeling good ");
        keyWords.get(keyWords.size() - 1).add(" im feeling good ");
        keyWords.get(keyWords.size() - 1).add(" i'm feeling good ");
        keyWords.get(keyWords.size() - 1).add(" i am doing good");
        keyWords.get(keyWords.size() - 1).add(" im doing good ");
        keyWords.get(keyWords.size() - 1).add(" i'm doing good ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Great, what else is going on?");
        answers.get(answers.size() - 1).add("I'm also feeling pretty good");
        answers.get(answers.size() - 1).add("It is so nice to feel happy every once and a while ");

        //I am negatives
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i am sad ");
        keyWords.get(keyWords.size() - 1).add(" i am upset ");
        keyWords.get(keyWords.size() - 1).add(" i am disappointed ");
        keyWords.get(keyWords.size() - 1).add(" i am very sad ");
        keyWords.get(keyWords.size() - 1).add(" i am not feeling good ");
        keyWords.get(keyWords.size() - 1).add(" i am angry ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("That sucks I am sorry to here that");
        answers.get(answers.size() - 1).add("Do you want to vent?");



        //I need
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i need ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("what is it that you need?");

        //Standard reply for help
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" help ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("What do you need help with?");

        //i feel
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i feel ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Feelings are good, you should tell me more about it");

        //Appreciation
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" thank you ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("you are most welcome my dear");

        //funny thing to do with !
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add("!");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Shouting is rude!");
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

        return NO_ANSWER.get(random.nextInt(NO_ANSWER.size()));
    }
}