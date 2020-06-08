package threadCountLatch;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@link java.util.concurrent.CountDownLatch} Java class to synchronize your threads� activities.
 * <br><br>
 * Source:
 * <em>http://stackoverflow.com/questions/17827022/what-is-countdown-latch-in-java-multithreading</em><br>
 *
 * Any thread, usually main thread of application, which calls
 * {@link java.util.concurrent.CountDownLatch#await()} will wait until count reaches zero or its interrupted
 * by another thread. All other thread are required to do count down by calling
 * {@link java.util.concurrent.CountDownLatch#countDown()} once they are completed or ready.
 * <br>
 * As soon as count reaches zero, Thread awaiting starts running. One of the
 * disadvantage of {@link java.util.concurrent.CountDownLatch} is that it's
 * not reusable once the count reaches to
 * zero you can not use {@link java.util.concurrent.CountDownLatch} any more.
 * <br><br>
 * Use {@link java.util.concurrent.CountDownLatch} when one thread, like main
 * thread, require to wait for one or more threads to complete, before it can
 * start processing.
 * <br><br>
 * Classical example of using {@link java.util.concurrent.CountDownLatch} in
 * Java is any server side core  Java application which uses services
 * architecture, where multiple services
 * are provided by multiple threads and application can not start processing
 * until all services have started successfully.
 * <br><br>
 * Codes with minor comments are from <em>http://www.caveofprogramming.com/youtube/</em><br>
 * also freely available at
 * <em>https://www.udemy.com/java-multithreading/?couponCode=FREE</em>
 *
 * @author Z.B. Celik <celik.berkay@gmail.com>
 */
class Processor implements Runnable {

    private CountDownLatch latch;

    public Processor(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        System.out.println("Started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignored) {}
        latch.countDown();
    }
}

public class App {

    public static void main(String[] args) {
    	int tasks = 5;
        CountDownLatch latch = new CountDownLatch(tasks);
        //two threads at a time
        //5 tasks 
        //main thread to wat untill all threads complete
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < tasks; i++) {
            executor.submit(new Processor(latch));
        }
        executor.shutdown();

        try {
            // Application�s main thread waits, till other service threads which are
            // as an example responsible for starting framework services have completed started all services.
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Completed.");
    }

}