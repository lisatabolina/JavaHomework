package lesson14.JoinMethod;

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        JoinConversation conversation = new JoinConversation();

        for (int i = 0; i < 20; i++) {
            Thread t1 = new Thread(() -> {

                conversation.printWhatAreYouDoing();

            });

            Thread t2 = new Thread(() -> {

                conversation.printHowAreYou();

            });

            Thread t3 = new Thread(() -> {
                conversation.printHello();
            });

            t3.start();
            t3.join();
            t2.start();
            t2.join();
            t1.start();
            t1.join();
        }
    }
}
