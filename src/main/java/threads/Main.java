package threads;

public class Main {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        MyThread t = new MyThread();
        for(int i = 0; i<= 2 ; i++){
            m.start();
            t.start();
        }
    }
}