package Thread;

public class OldThread extends Thread {
    
    @Override
    public void run() {
        super.run();
        try{
            for(int i=0;i<10;i++){
                System.out.println("count"+i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println("My thread  interrupted");
        }System.out.println("My thread run is over");
    }
}
