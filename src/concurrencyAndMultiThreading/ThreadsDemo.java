package concurrencyAndMultiThreading;

public class ThreadsDemo {

    public static void show(){

        Thread thread = new Thread(new DownloadFile());
        //starting the dowbloading thread
        thread.start();

        //Now after 1 sec . I want to interrupt the thread

        try {
            thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();

    }

}
