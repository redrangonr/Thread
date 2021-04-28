package RacingCar;


    public class Main {


        public static void main(String[] args) {
            RacingCar carA = new RacingCar("A");
            RacingCar carB = new RacingCar("B");
            RacingCar carC = new RacingCar("C");

            Thread thread1 = new Thread(carA);
            Thread thread2 = new Thread(carB);
            Thread thread3 = new Thread(carC);

            System.out.println("Distance: 100KM");
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }

