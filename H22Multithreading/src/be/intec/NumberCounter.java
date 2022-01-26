package be.intec;

import java.util.Scanner;

public class NumberCounter {
    private static int counter;
    private static int counter2;
    private Object monitorObject = new Object();    // same as talking pillow from breaking bad
    private Object secondMonitorObject = new Object();    // same as talking pillow from breaking bad

    public void incrementBoth() {
        synchronized (monitorObject) {
            counter ++;
        }
        synchronized (secondMonitorObject) { // not same monitorObj bcs can be edited by other thread and if another thread is using counter at the same
                                            // time as we want to use counter2 is gonna give problem
            counter2 ++;
        }
    }

    public void decrementBoth() {
        synchronized (monitorObject) {
            counter --;
        }
        synchronized (secondMonitorObject) { // same as above
            counter2 --;
        }
    }

    public void increment() {
        synchronized (monitorObject) {
            counter++;
        }
    }

    public void decrement() {
        synchronized (monitorObject) {
            counter--;
        }
    }

    public void canCreateDeadlockIncrement() {   // will have the same effect as an infinite loop. app will appear to do nothing. happens bcs indented sync blocks (happens when trying to run this on two thread)
        synchronized (monitorObject) {
            counter2++;
            synchronized (secondMonitorObject) {
                counter++;
            }
        }
    }

    public void canCreateDeadlockDecrement() {   // will have the same effect as an infinite loop. app will appear to do nothing. happens bcs indented sync blocks (happens when trying to run this on two thread)
        synchronized (secondMonitorObject) {
            counter2--;
            synchronized (monitorObject) {
                counter--;
            }
        }
    }

    @Override
    public String toString() {
        return "counter 1: " + counter + " | counter 2: " + counter2;
    }
}


















