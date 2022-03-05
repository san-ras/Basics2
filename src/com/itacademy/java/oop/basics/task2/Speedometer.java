package com.itacademy.java.oop.basics.task2;

public class Speedometer {


    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            return mountainBike.getBike();
        } else if (roadBike.getSpeed() > mountainBike.getSpeed()) {
            return roadBike.getBike();
        } else {
            System.out.println("Its a tie!");
            return null;
            //To lecturers: what should be returned instead of null in this case?
            //I can't return anything since no one has won :)
        }
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if (roadBikeSpeed > mountainBikeSpeed) {
            return Bike.ROAD;
        } else {
            System.out.println("Its a tie!");
            return null;
        }
    }

}


