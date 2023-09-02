import java.lang.Thread;

class NewThread implements Runnable {
    @Override
    public void run() {
        System.out.println("This is in a new Thread");
        for (int i = 10; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\t\t\t\tNewThread Index: " + i);
        }
    }
}

public class ThreadLearner {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new NewThread());
//        thread.start();

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10; i < 20; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("\t\t\t\tNewThread Index: " + i);
                }
            }
        });

        myThread.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("First Index: " + i);
            thread.join();
        }

    }
}
