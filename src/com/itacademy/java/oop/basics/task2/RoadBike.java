package com.itacademy.java.oop.basics.task2;

import java.util.Scanner;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;
    private Bike bike;
    private int[] gearChoices = new int[]{-2, -1, 1, 2};


    public RoadBike() {
        this.gear = 0;
        this.bike = Bike.ROAD;
    }

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
        this.bike = Bike.ROAD;
    }

    @Override
    public void changeGear(int newGear) {
        int minGear = 0;
        int maxGear = 10;
        boolean isValid = true;

        while (isValid) {
            int possibleGear = gear + newGear;
            if (possibleGear >= minGear && possibleGear <= maxGear) {
                gear = possibleGear;
                isValid = false;
                System.out.println("New gear is set to " + gear);
            } else {
                System.out.println("This value is not allowed. Current gear is " + gear);
                if (newGear > 0) {
                    for (int i = gearChoices.length - 1; i > 0; i--) {
                        int possibleEntry = gearChoices[i];
                        int closestPossibleGear = gear + possibleEntry;
                        if (closestPossibleGear >= minGear && closestPossibleGear <= maxGear) {
                            System.out.println("Closest possible entry: " + possibleEntry);
                            newGear = getGearIncrement();
                            break;
                        }
                    }
                } else {
                    for (int j = 0; j < gearChoices.length; j++) {
                        int possibleEntry = gearChoices[j];
                        int closestPossibleGear = gear + possibleEntry;
                        if (closestPossibleGear >= minGear && closestPossibleGear <= maxGear) {
                            System.out.println("Closest possible entry: " + possibleEntry);
                            newGear = getGearIncrement();
                            break;
                        }
                    }
                }
            }
        }
    }


    public int getGearIncrement() {
        int newGear = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter -2, -1 to decrease or 1, 2 to increase the gear of Road Bike.");
        try {
            newGear = scanner.nextInt();
        } catch (Exception e) {
            newGear = 0;
        }
        for (int i = 0; i < gearChoices.length; i++) {
            if (newGear == gearChoices[i]) {
                return newGear;
            }
        }
        return getGearIncrement();


    }

    @Override
    public void speedUp(int increment) {
        boolean isValid = true;

        while (isValid) {
            int maxSpeed = 50;
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
        System.out.println("Enter the increase in speed that should be applied to Road Bike");
        Scanner scanner = new Scanner(System.in);
        int increase = 0;
        try {
            increase = scanner.nextInt();
        } catch (Exception e) {
            return -1;
        }
        return increase;
    }


    @Override
    public void applyBrakes() {
        boolean isValid = true;

        while (isValid) {
            int decrease = 0;
            System.out.println("Enter the decrease in speed that should be applied to Road Bike");
            Scanner scanner = new Scanner(System.in);
            try {
                decrease = scanner.nextInt();
            } catch (Exception e) {
                decrease = 1;
            }
            if (decrease > 0) {
                System.out.println("The entered value is not valid. It must be a negative number.");
            } else if (speed + decrease <= 0) {
                int allowedDecrease = 0 - speed;
                System.out.println("Value is too high, max speed reduce value can be " + allowedDecrease + ".");
            } else {
                speed = speed + decrease;
                System.out.println("Speed decreased by " + -1 * decrease + "; speed now is: " + speed);
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

    public int[] getGearChoices() {
        return gearChoices;
    }

    public void setChoices(int[] gearChoices) {
        this.gearChoices = gearChoices;
    }
}

