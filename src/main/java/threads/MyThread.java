package threads;
public class MyThread extends Thread {

    public MyThread(){
    }

    public void run(){
        for(int i = 0; i <= 9 ; i++){
            System.out.println(i);
        }
    }
}