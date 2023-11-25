package concurrencyAndMultiThreading;

import java.util.ArrayList;

public class ThreadsDemo {

    public static void show() {

        DownloadStatus status = new DownloadStatus();
        ArrayList<Thread> allThreads = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFile(status));
            thread.start();
            allThreads.add(thread);
        }

        for (var thread : allThreads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getCount());
    }
}
