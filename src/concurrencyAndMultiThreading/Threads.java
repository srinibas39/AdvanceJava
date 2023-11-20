package concurrencyAndMultiThreading;

public class Threads {
    public static void main(String[] args) {
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println(Thread.currentThread().getName());

        for(int i=0; i<10;i++){
            Thread thread = new Thread(new DownloadFile());
            thread.start();
        }

    ;

    }
}
