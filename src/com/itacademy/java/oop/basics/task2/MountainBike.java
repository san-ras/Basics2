package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;
    private Bike bike;

    public MountainBike() {
        this.gear = 0;
        this.bike = Bike.MOUNTAIN;
    }

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.bike = Bike.MOUNTAIN;
    }

    @Override
    public void changeGear(int newGear) {
        boolean isValid = true;
        while (isValid) {
            if (newGear == -1) {
                if (gear > 0) {
                    gear = gear - 1;
                    System.out.println("Gear decreased by 1, current gear is " + gear);
                    isValid = false;
                } else {
                    System.out.println("Gear can not be decreased, it is already at min value of " + gear);
                    newGear = getGearIncrement();
                }
            } else if (newGear == 1) {
                if (gear < 20) {
                    gear = gear + 1;
                    System.out.println("Gear increased by 1, current gear is " + gear);
                    isValid = false;
                } else {
                    System.out.println("Gear can not be increased, it is already at max value of " + gear);
                    newGear = getGearIncrement();
                }
            } else {
                System.out.println("Gear value not acceptable, it must be either 1 or -1.");
                newGear = getGearIncrement();
            }
        }
    }

    public int getGearIncrement() {
        int newGear = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter -1 or 1 to decrease or increase the gear of Mountain Bike.");
        try {
            newGear = scanner.nextInt();
        } catch (Exception e) {
        } finally {
            return newGear;
        }
    }

    @Override
    public void speedUp(int increment) {
        boolean isValid = true;

        while (isValid) {
            int maxSpeed = 100;
            if (increment < 0) {
                System.out.println("The entered value is not valid. It must be a positive number.");
                increment = getSpeedIncrement();
            } else if (speed + increment > maxSpeed) {
                int allowedIncrease = maxSpeed - speed;
                System.out.println("Value is too high, max speed increase value can be " + allowedIncrease + ".");
                increment = getSpeedIncrement();
            } else {
                speed = speed + increment;
                System.out.println("Speed increased by " + increment + "; speed now is: " + speed);
                isValid = false;
            }
        }

    }

    public int getSpeedIncrement() {
        System.out.println("Enter the increase in speed that should be applied to Mountain Bike");
        Scanner scanner = new Scanner(System.in);
        int increase = 0;
        try {
            increase = scanner.nextInt();
        } catch (Exception e) {
            increase = -1;
        } finally {
            return increase;
        }
    }

    @Override
    public void applyBrakes() {
        boolean isValid = true;

        while (isValid) {
            int decrease = 0;
            System.out.println("Enter the decrease in speed that should be applied to Mountain Bike");
            Scanner scanner = new Scanner(System.in);
            try {
                decrease = scanner.nextInt();
            } catch (Exception e) {
                decrease = -1;
            }
            if (decrease < 0) {
                System.out.println("The entered value is not valid. It must be a positive number.");
            } else if (speed - decrease <= -11) {
                int allowedDecrease = speed + 10;
                System.out.println("Value is too high, max speed reduce value can be " + allowedDecrease + ".");
            } else {
                speed = speed - decrease;
                System.out.println("Speed decreased by " + decrease + "; speed now is: " + speed);
                isValid = false;
            }
        }
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }
}