package lesson14.WaitNotifyMethod;

public class WaitNotifyConversation {
    public int lines = 1;

    public synchronized void printHello() {
        while (lines != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Привет");
        lines = 2;
        notifyAll();
    }

    public synchronized void printHowAreYou() {
        while (lines != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Как дела?");
        lines = 3;
        notifyAll();
    }

    public synchronized void printWhatAreYouDoing() {
        while (lines != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Что делаешь?");
        lines = 1;
        notifyAll();
    }
}

