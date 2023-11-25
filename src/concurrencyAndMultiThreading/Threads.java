package concurrencyAndMultiThreading;

public class Threads {
    public static void main(String[] args) {
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());

//        System.out.println(Thread.currentThread().getName());
//
//        for(int i=0; i<10;i++){
//            Thread thread = new Thread(new DownloadFile());
//            thread.start();
//        }

        //joining a thread
        //Suppose For download a file => 1 thread
        // and after file is downloaded then I want to scan the file
        //for viruses .I can achieve this using thread.join()

        Thread thread = new Thread(new DownloadFile());
        thread.start();

        try {
            thread.join(5000);
            //threading is waiting for file to be downloaded
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File is ready to be scanned");

    }
}
