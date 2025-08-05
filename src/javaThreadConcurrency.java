public class javaThreadConcurrency extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        javaThreadConcurrency thread = new javaThreadConcurrency();
        thread.start();
        //wait for the thread to finish
        while(thread.isAlive()) {
            System.out.println("Waiting..");
        }
        //update amount and print its value
        System.out.println("Main: " + amount);
        amount++;
        System.out.println("Main: " + amount);
    }
    public void run() {
        amount++;
    }

}
