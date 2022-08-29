package lesson14.WaitNotifyMethod;

public class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        WaitNotifyConversation waitNotifyConversation = new WaitNotifyConversation();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                waitNotifyConversation.printHello();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                waitNotifyConversation.printHowAreYou();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                waitNotifyConversation.printWhatAreYouDoing();
            }
        });

        t3.start();
        t2.start();
        t1.start();
    }
}
