package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike();
        mountainBike.setSpeed(30);
       // mountainBike.setGear(20);
        mountainBike.applyBrakes();
        mountainBike.changeGear(mountainBike.getGearIncrement());
        mountainBike.speedUp(mountainBike.getSpeedIncrement());

        RoadBike roadBike = new RoadBike();
        roadBike.setSpeed(35);
        roadBike.applyBrakes();
        roadBike.changeGear(roadBike.getGearIncrement());
        roadBike.speedUp((roadBike.getSpeedIncrement()));
       // roadBike.setGear(9);

        System.out.println("And the winner is: " + Speedometer.chooseWinner(mountainBike, roadBike));
        System.out.println("Double checking the winner: " + Speedometer.chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed()));

    }

}
