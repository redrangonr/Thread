package ThreadTime;

import ThreadTime.NumberGenerator;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        thread.run();

    }
}
