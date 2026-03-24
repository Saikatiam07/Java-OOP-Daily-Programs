class TrafficLight implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("RED");
                Thread.sleep(2000);
                System.out.println("GREEN");
                Thread.sleep(2000);
                System.out.println("YELLOW");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Emergency Override Activated!");
            while (true) {
                try {
                    System.out.println("BLINKING YELLOW... (Emergency Mode)");
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                }
            }
        }
    }
}
public class SmartTrafficLight {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        Thread t = new Thread(light);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}

/*
OUTPUT
RED
GREEN
YELLOW
RED
GREEN
YELLOW
RED
Emergency Override Activated!
BLINKING YELLOW... (Emergency Mode)
BLINKING YELLOW... (Emergency Mode)
BLINKING YELLOW... (Emergency Mode)
BLINKING YELLOW... (Emergency Mode)
...
*/