package org.example;

import lombok.*;


@Getter
@Setter
@ToString
@AllArgsConstructor

public class Train extends Transport{
    private String id;
    private int carriageCount;
    private boolean isExpress;
    @Override
    float getPrice(City city) {
        return getCostOfKm() * city.getDistanceKm();
    }
}
