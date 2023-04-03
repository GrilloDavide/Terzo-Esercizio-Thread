public class Fattoriale extends Thread{

    private int val;

    public Fattoriale(int val){
        this.val=val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public void run() {
        int n = val;
        for(int i = 1; i<n; val*=i, i++);

    }
}
