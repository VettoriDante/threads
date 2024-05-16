package threads;

public class Main {
    public static void main(String[] args) {
        int[] val = new int[10];

        for(int i = 0; i<val.length; i++){
            new MyThread(val, i).start();
        }

        for(int i = 0; i < val.length; i++){
            System.out.println(val[i]);
        }
    }
}