/*
    This is Gertrude.
    She will chat with the user over then terminal command line.
    She is trying her best to avoid the conversation and prtend she understand what you are talking about
    Like some people she doesn't really care and only listens to keywords and answers accordingly
    Created by: Jonatan Heine Langer and Robert Spralja
    Date: 29 November 2020 20:26
 */

import java.util.Scanner;

public class Gertrude {
    public Scanner in = new Scanner(System.in); //Declaring a scanner so the user can input text
    public final int I = 25; // the number of iterations before the program shuts itself off
    public KeyWords keyWords = new KeyWords(); //instaniating the class KeyWords which matches keywords to answers
    public static void main(String[] args) {
        Gertrude gertrude = new Gertrude(); //instantiating the main class so we can you non static variables
        gertrude.loop(args);
    }

    public void loop(String[] args) {// main loop of the chat-bot
        initialisation();
        for(int i = 0; i < I; ++i) {
            answerQuestion(inputQuestion()); //passing the input question to the matching
        }

        System.out.println("Gertrude: Goodbye!"); // When the programme is done it says godbye
    }

    public String inputQuestion() {
        System.out.print("You: "); //Whenever the user should type a new question a "You: " appears for clarity
        String question = in.nextLine(); //inputing the next line
        question = question.replace('?', ' ').replace('.', ' ');
            //replacing '?' with whitespace, essentially ignoring the question mark because it doesn't signify
            // anything because most people don't use it
        return question;
    }

    public void answerQuestion(String question) {
        System.out.print("Gertrude: "); //Clarifying that Gertrude is responding
        System.out.println(keyWords.match(question)); //matching the question to an answer
    }

    public void initialisation() {
        System.out.println("Gertrude: Hi, my name is Gertrude. Ask me a question.");
        // Starting the conversation, because we werent sure whether anything else was going in this
        // function we decided to have it, even tho its only 1 line
    }
}