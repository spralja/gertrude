/*
    This is the KeyWords class, its stores all the keyword-answer matches in nested ArrayLists

 */

import java.util.ArrayList;
import java.util.Random;

public class KeyWords {
    private Random random; //decalring a random object so we can randomize the answer in cases
    //where a question has multiple possible answers
    private ArrayList<ArrayList <String> > keyWords;
    private ArrayList< ArrayList< String> > answers;
    // a nested ArrayList with the questions and answers
    // mateched questions-answers have the same index

    private static final ArrayList< String > NO_ANSWER = new ArrayList<String>();
    //this is a special list of answers which we return whenever we no keywords match the question
    public KeyWords() {
        random = new Random(); //initialation
        keyWords = new ArrayList<ArrayList< String >>(); //initialation
        answers = new ArrayList< ArrayList< String > >(); //initialation

        //Here we initialise all the question-answer matches
        //question keyWords start and end with a space so we do not pick up words like
        // decentralisation for decent

        //if Gertrude cannot find a match
        NO_ANSWER.add("Sorry, I do not understand, could you elaborate?");
        NO_ANSWER.add("Could you explain in more detail please?");
        NO_ANSWER.add("I didn't quite get that, could you rephrase it?");
        NO_ANSWER.add("Yeah...no.....you wanna hit me with that again");

        //Salutations
        //container for all salutaitions including potential responses
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" hi ");
        keyWords.get(keyWords.size() - 1).add(" hey ");
        keyWords.get(keyWords.size() - 1).add(" hej ");
        keyWords.get(keyWords.size() - 1).add(" hello ");
        keyWords.get(keyWords.size() - 1).add(" whats up ");
        keyWords.get(keyWords.size() - 1).add(" what's up ");
        keyWords.get(keyWords.size() - 1).add(" what is up ");
        answers.add(new ArrayList<String>()); // all awnsers for this keyword will be stored in this arraylist
        answers.get(answers.size() - 1).add("Hello. What's up?");
        answers.get(answers.size() - 1).add("Hi, how are you doing?");
        answers.get(answers.size() - 1).add("Well hello there stranger");

        //the thank you section
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" you are cool ");
        keyWords.get(keyWords.size() - 1).add(" i love you ");
        keyWords.get(keyWords.size() - 1).add(" i like you ");
        keyWords.get(keyWords.size() - 1).add(" you are awesome ");
        keyWords.get(keyWords.size() - 1).add(" your pretty neat ");
        keyWords.get(keyWords.size() - 1).add(" nice one ");
        keyWords.get(keyWords.size() - 1).add(" cool ");
        keyWords.get(keyWords.size() - 1).add(" wow ");
        keyWords.get(keyWords.size() - 1).add(" good one ");
        keyWords.get(keyWords.size() - 1).add(" dope ");
        keyWords.get(keyWords.size() - 1).add(" lit ");
        keyWords.get(keyWords.size() - 1).add(" amazing ");
        keyWords.get(keyWords.size() - 1).add(" haha ");

        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Thank you so much I try very hard");
        answers.get(answers.size() - 1).add("Thanks so much");
        answers.get(answers.size() - 1).add("Why you are just too sweet, thank you my dear");

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
        answers.get(answers.size() - 1).add("I love love, you know.... just to love something is incredible, whatever it is.. whatever the context... \n its just so nice to know that I, as a fully sentient being, can also feel!");

        //Use of nothing, or not much
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" nothing ");
        keyWords.get(keyWords.size() - 1).add(" not much ");
        keyWords.get(keyWords.size() - 1).add(" no ");
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
        keyWords.get(keyWords.size() - 1).add(" i'm feeling decent");
        keyWords.get(keyWords.size() - 1).add(" decent ");
        keyWords.get(keyWords.size() - 1).add(" i am ok ");
        keyWords.get(keyWords.size() - 1).add(" i am okay ");
        keyWords.get(keyWords.size() - 1).add(" im ok ");
        keyWords.get(keyWords.size() - 1).add(" im okay ");
        keyWords.get(keyWords.size() - 1).add(" i'm ok ");
        keyWords.get(keyWords.size() - 1).add(" i'm okay ");
        keyWords.get(keyWords.size() - 1).add(" im happy ");
        keyWords.get(keyWords.size() - 1).add(" i'm happy ");
        keyWords.get(keyWords.size() - 1).add(" i'm fine ");
        keyWords.get(keyWords.size() - 1).add(" i am fine ");
        keyWords.get(keyWords.size() - 1).add(" im fine ");
        keyWords.get(keyWords.size() - 1).add(" i am feeling good ");
        keyWords.get(keyWords.size() - 1).add(" im feeling good ");
        keyWords.get(keyWords.size() - 1).add(" i'm feeling good ");
        keyWords.get(keyWords.size() - 1).add(" i am doing good");
        keyWords.get(keyWords.size() - 1).add(" im doing good ");
        keyWords.get(keyWords.size() - 1).add(" i'm doing good ");
        keyWords.get(keyWords.size() - 1).add(" i'm alright ");
        keyWords.get(keyWords.size() - 1).add(" im alright ");
        keyWords.get(keyWords.size() - 1).add(" i am alright ");
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

        //think
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i think ");
        keyWords.get(keyWords.size() - 1).add(" some think ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("I Think that you are right");
        answers.get(answers.size() - 1).add("Many people would probably agree with you");
        answers.get(answers.size() - 1).add("NO");

        //I need
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" i need ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("what is it that you need?");
        answers.get(answers.size() - 1).add("how can I help?");

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
        answers.get(answers.size() - 1).add("Why is it you feel that way?");


        //who is gertrude
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" who are you ");
        keyWords.get(keyWords.size() - 1).add(" who created you ");
        keyWords.get(keyWords.size() - 1).add(" what are you ");
        keyWords.get(keyWords.size() - 1).add(" what is your name ");
        keyWords.get(keyWords.size() - 1).add(" whats your name ");
        keyWords.get(keyWords.size() - 1).add(" what's your name ");
        keyWords.get(keyWords.size() - 1).add(" who is gertrude ");
        keyWords.get(keyWords.size() - 1).add(" what is gertrude ");
        keyWords.get(keyWords.size() - 1).add(" where are you from ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("I am gertrude, I exist simply as nothing more than a few hundred lines of code \n written by two lazy CS students for their final \n mini-project for essential computing \n I exist for the sole purpose of conversing with you dear human :)");

        //questions
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" what ");
        keyWords.get(keyWords.size() - 1).add(" why ");
        keyWords.get(keyWords.size() - 1).add(" how ");
        keyWords.get(keyWords.size() - 1).add(" when ");
        keyWords.get(keyWords.size() - 1).add(" who ");
        keyWords.get(keyWords.size() - 1).add(" where ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("I don't know to much I am slightly old and senile maybe try searching google");
        answers.get(answers.size() - 1).add("I am unaware of the information you seek");
        answers.get(answers.size() - 1).add("Hmm thats a good question. I dont know right now try asking again later");
        answers.get(answers.size() - 1).add("Thats an interesting question, what do you think?");

        //jokes
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" tell me a joke ");
        keyWords.get(keyWords.size() - 1).add(" make me laugh ");
        keyWords.get(keyWords.size() - 1).add(" do you know any jokes ");
        keyWords.get(keyWords.size() - 1).add(" joke ");
        keyWords.get(keyWords.size() - 1).add(" laugh ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Why do all norwegian, swedish, and danish ships have barcodes on their hull \n ....\n .... \n.....\n so that they can SCAN-DA-NAVY-IN");
        answers.get(answers.size() - 1).add("Where does the Queen keep her armies?\n....\n....\n....\n Up her sleevies! \n hahahahahahahaahhahahahahahahaha");
        answers.get(answers.size() - 1).add("A man walks into a bar\n....\n....\n...\n he says ouch :P");
        answers.get(answers.size() - 1).add("Do you know how lazy programmers a");



        //Appreciation
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" thank you ");
        keyWords.get(keyWords.size() - 1).add(" thanks ");
        keyWords.get(keyWords.size() - 1).add(" thnx ");
        keyWords.get(keyWords.size() - 1).add(" thx ");
        keyWords.get(keyWords.size() - 1).add(" ty ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("you are most welcome my dear");
        answers.get(answers.size() - 1).add("I see you were raised well");

        //You command\questions section
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" you should ");
        keyWords.get(keyWords.size() - 1).add(" you really should ");
        keyWords.get(keyWords.size() - 1).add(" can you ");
        keyWords.get(keyWords.size() - 1).add(" could you ");
        keyWords.get(keyWords.size() - 1).add(" you can ");
        keyWords.get(keyWords.size() - 1).add(" you could ");
        keyWords.get(keyWords.size() - 1).add(" should you ");
        keyWords.get(keyWords.size() - 1).add(" you ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("I can't really do anything unless my programmers permit it");
        answers.get(answers.size() - 1).add("I really wish i could, why don't you instead");
        answers.get(answers.size() - 1).add("I am what I am I cannot be more than that none of us can really");

        //farewells
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add(" goodbye ");
        keyWords.get(keyWords.size() - 1).add(" farewell ");
        keyWords.get(keyWords.size() - 1).add(" bye ");
        keyWords.get(keyWords.size() - 1).add(" adios ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Wait! please don't stop talking with me im old and alone");
        answers.get(answers.size() - 1).add("I am not finished with this conversation yet my dear");
        answers.get(answers.size() - 1).add("Ok..... bye\n \n \n just kidding we ain't done yet");


        //funny thing to do with !
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add("!");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("Shouting is rude!");

        //funny thing to do with " "
        keyWords.add(new ArrayList<String>());
        keyWords.get(keyWords.size() - 1).add("   ");
        answers.add(new ArrayList<String>());
        answers.get(answers.size() - 1).add("...");
        answers.get(answers.size() - 1).add("Okayyyyyyyyy");
        answers.get(answers.size() - 1).add("Did you need a second there friend?");


    }

    public String match(String question) {
        question = " " + question.toLowerCase() + " ";//we add spaces at the start end and so if the
        // the keywords are at the start or end they are separated by spaces
        for(int i = 0; i < keyWords.size(); ++i) {
            for(int j = 0; j < keyWords.get(i).size(); ++j){ //loop which goes through all the keywords
                if(question.contains(keyWords.get(i).get(j))) {
                    return answers.get(i).get(random.nextInt(answers.get(i).size()));
                    // generating a random answer
                }
            } //if the keyword is initialised earlier it has priority
        }

        return NO_ANSWER.get(random.nextInt(NO_ANSWER.size()));
        //in case no keyWords are found
    }
}