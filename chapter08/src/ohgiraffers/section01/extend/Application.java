package ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {

        Car car=new Car();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        FireCar fireCar = new  FireCar();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();

        fireCar.sprayWater();

        RacingCar racingCar = new  RacingCar();
        racingCar.run();
        racingCar.soundHorn();
    }
}
