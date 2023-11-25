package concurrencyAndMultiThreading;

public class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading File "+Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download Complete"+ Thread.currentThread().getName());
    }


}
