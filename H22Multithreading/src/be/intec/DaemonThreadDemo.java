package be.intec;

public class DaemonThreadDemo {
    public static void main(String[] args) {    // main thread
//        NoDaemonThread();
        DaemonThread();     // if this only thing that will run then shouldn't print unless it starts faster then the main thread can close
    }

    private static void NoDaemonThread() {      // normal thread. app stops once main + this thread done
        Thread thread = new Thread(() -> {  // new thread
            for (int i = 0; i < 100; i++){
                System.out.println("Hello " + i);
            }
        });
        thread.start();
    }

    private static void DaemonThread() {      // daemon thread. app stops once main thread done (and all normal threads are done too. basically when daemon are last active threads)
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                System.out.println("Daemon Hello " + i);
            }
        });
        thread.setDaemon(true);
        thread.start();
    }
}
