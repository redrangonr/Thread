package RacingCar;

import java.util.Random;

public class RacingCar implements Runnable {
private String name;
public RacingCar(String name){
    this .name = name;
}

    @Override
    public void run() {
          int Distance = 100;

          int Step = 2;
        int runDistance = 0;
        long startTime = System.currentTimeMillis();
        while (runDistance <Distance){
            try{
                int speed =(new Random().nextInt(20));
                runDistance +=speed;
                String log ="|";
                int percentTravel=(runDistance*100)/Distance;
                for(int i =0;i<Distance;i+=Step){
                    if(percentTravel >= i+Step){
                        log +="=";
                    }else if(percentTravel >=i  && percentTravel < i + Step){
                        log+="o";
                    }else {
                        log +="-";
                    }
                }
                log += "|";
                System.out.println("Car"+this.name+":"+log+""+Math.min(Distance,runDistance)+"KM");
                Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("Car"+this.name+"Broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }

}
