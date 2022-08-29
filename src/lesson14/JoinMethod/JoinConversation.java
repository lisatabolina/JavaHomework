package lesson14.JoinMethod;

public class JoinConversation {
    public synchronized void printHello() {
        System.out.println("Привет");
    }

    public synchronized void printHowAreYou() {
        System.out.println("Как дела?");
    }

    public synchronized void printWhatAreYouDoing() {
        System.out.println("Что делаешь?");
    }

}
