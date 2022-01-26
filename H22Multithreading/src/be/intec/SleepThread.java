package be.intec;

public class SleepThread extends Thread {
    @Override
    public void run(){
        int counter = 0;

        while (true) {
            System.out.println("Hello " + counter);
            counter ++;
            try {
//                Thread.sleep(500);      // will timeout for 0.5 seconds
                Thread.sleep(5000);      // will timeout for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
