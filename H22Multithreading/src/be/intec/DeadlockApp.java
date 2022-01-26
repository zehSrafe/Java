package be.intec;

public class DeadlockApp {
    public static void main(String[] args) {
        NumberCounter numberCounter = new NumberCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                numberCounter.incrementBoth();
                System.out.println(numberCounter.toString());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                numberCounter.decrementBoth();
                System.out.println(numberCounter.toString());
            }
        });

        Thread threadDeadlock = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                numberCounter.canCreateDeadlockDecrement();
                System.out.println(numberCounter.toString());
            }
        });

        Thread threadDeadlock1 = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                numberCounter.canCreateDeadlockIncrement();
                System.out.println(numberCounter.toString());
            }
        });

//        thread1.start();
//        thread2.start();

        threadDeadlock.start(); // will have the same effect as an infinite loop. app will appear to do nothing. happens bcs indented sync blocks (happens when trying to run this on two thread)
        threadDeadlock1.start(); // will have the same effect as an infinite loop. app will appear to do nothing. happens bcs indented sync blocks (happens when trying to run this on two thread)
    }
}
