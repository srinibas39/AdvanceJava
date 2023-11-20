package concurrencyAndMultiThreading;

public class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading File "+Thread.currentThread().getName());
    }
}
