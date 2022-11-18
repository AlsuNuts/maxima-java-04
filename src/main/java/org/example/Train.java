package org.example;

public class Train extends Transport{
    private String id;
    private int carriageCount;
    private boolean isExpress;

    public Train(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    float getPrice(City city) {
        return getCostOfKm() * city.getDistanceKm();
    }
}
