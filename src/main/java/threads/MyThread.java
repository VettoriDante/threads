package threads;
public class MyThread extends Thread {
    private int[] add;
    private int pos;
    public MyThread(int[] addTo,int pos){
        this.add = addTo;
        this.pos = pos;
    }

    public void run(){
        int n = (int)(Math.random()*100+1);
        add[pos] = n;
    }
}