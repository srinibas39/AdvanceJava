package concurrencyAndMultiThreading;

public class DownloadFile implements Runnable {

    private final DownloadStatus status;

    public DownloadFile(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading File " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementCount();

        }

        System.out.println("Download Complete" + Thread.currentThread().getName());
    }
}
