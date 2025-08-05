//Creating a Thread
//It can be created by extending the Thread class and overriding its run() method
public class JavaThread extends Thread {
    public static void main(String[] args) {
        JavaThread thread = new JavaThread();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

//Another way to create a thread is to implement the Runnable interface:
class Mainy implements Runnable {
    public static void main(String[] args) {
        Mainy obj = new Mainy();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
