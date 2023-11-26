package concurrencyAndMultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {

    private Lock lock = new ReentrantLock();
    private int count;
    public int getCount() {
        return count;
    }

    public void incrementCount(){
        lock.lock();
        try{
            this.count++;
        }
        finally {
            lock.unlock();
        }


    }


}
