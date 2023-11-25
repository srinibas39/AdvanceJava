package concurrencyAndMultiThreading;

public class DownloadFile implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading File "+Thread.currentThread().getName());


        for(var i=0;i<Integer.MAX_VALUE;i++){
            if(Thread.currentThread().isInterrupted()) return;
            System.out.println("Downloading byte "+i);
        }

        System.out.println("Download Complete"+ Thread.currentThread().getName());
    }


}
