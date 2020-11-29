import java.util.Scanner;

public class Gertrude {
    public Scanner in = new Scanner(System.in);
    public final int I = 20;
    public KeyWords keyWords = new KeyWords();
    public static void main(String[] args) {
        Gertrude gertrude = new Gertrude();
        gertrude.loop(args);
    }

    public void loop(String[] args) {
        initialisation();
        for(int i = 0; i < I; ++i) {
            answerQuestion(inputQuestion());
        }
    }

    public String inputQuestion() {
        System.out.print("You: ");
        String question = in.nextLine();
        question = question.replace('?', ' ').replace('.', ' ');
        return question;
    }

    public void answerQuestion(String question) {
        System.out.print("Gertrude: ");
        System.out.println(keyWords.match(question));
    }

    public void initialisation() {
        System.out.println("Gertrude: Hi, my name is Gertrude. Ask me a question.");
    }
}