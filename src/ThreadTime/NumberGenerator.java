package ThreadTime;

public class NumberGenerator implements Runnable{
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try{
            for(int i = 0;i<=10;i++){
                System.out.println("Printing the count"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("My thread  interrupted");
        }
        System.out.println("My thread run is over");
    }
}

