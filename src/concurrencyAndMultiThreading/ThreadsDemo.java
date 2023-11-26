package concurrencyAndMultiThreading;

import java.util.ArrayList;

public class ThreadsDemo {

    public static void show() {


        ArrayList<Thread> allThreads = new ArrayList<>();
        ArrayList<DownloadFile> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            var task = new DownloadFile();
            tasks.add(task);
            Thread thread = new Thread(task);
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

        var taskCount=tasks.stream().
                map(t->t.getStatus().getCount())
                .reduce(0,(a,b)->a+b);

       System.out.println(taskCount);
    }
}
