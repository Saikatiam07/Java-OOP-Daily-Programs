class NumberPrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class LetterPrinter implements Runnable {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
        }
    }
}

public class DualTasker {
    public static void main(String[] args) {

        NumberPrinter t1 = new NumberPrinter();
        Thread t2 = new Thread(new LetterPrinter());

        t1.start();
        t2.start();
    }
}

/*
OUTPUT (order may vary due to threading)
Number: 1
Letter: A
Letter: B
Number: 2
Letter: C
Number: 3
Letter: D
Letter: E
Number: 4
Number: 5
*/

    

