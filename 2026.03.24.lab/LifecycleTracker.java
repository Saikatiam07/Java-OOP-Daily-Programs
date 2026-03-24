class TaskRunner implements Runnable{
    public void run(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
    }
}
public class LifecycleTracker{
    public static void main(String[] args){
        Thread t = new Thread(new TaskRunner());
        System.out.println("State after creation" + t.getState());
        t.start();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("State after starting" + t.getState());
        try{
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("State after completion" + t.getState());
    }
}

/*
OUTPUT
State after creation NEW
State after starting TIMED_WAITING
State after completion TERMINATED
*/

