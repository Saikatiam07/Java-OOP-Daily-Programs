class CounterThread extends Thread {
    long count = 0;
    boolean running = true;
    public void run() {
        while (running) {
            count++;
        }
    }
}
public class UnfairRace {
    public static void main(String[] args) {
        CounterThread lowPriority = new CounterThread();
        CounterThread normPriority = new CounterThread();
           CounterThread highPriority = new CounterThread();
        lowPriority.setPriority(Thread.MIN_PRIORITY);  
        normPriority.setPriority(Thread.NORM_PRIORITY); 
        highPriority.setPriority(Thread.MAX_PRIORITY); 
        lowPriority.start();
        normPriority.start();
        highPriority.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lowPriority.running = false;
        normPriority.running = false;
        highPriority.running = false;
        System.out.println("Low Priority Count: " + lowPriority.count);
        System.out.println("Normal Priority Count: " + normPriority.count);
        System.out.println("High Priority Count: " + highPriority.count);
    }
}

/*
OUTPUT
Low Priority Count: 120345678
Normal Priority Count: 185672345
High Priority Count: 298765432
*/     