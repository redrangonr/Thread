package Thread;

public class Main {
    public static void main(String[] args) {
 OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();
        oldThread.run();
        evenThread.run();
    }
}
