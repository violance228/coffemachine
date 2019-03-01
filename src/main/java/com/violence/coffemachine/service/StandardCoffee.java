package com.violence.coffemachine.service;

import com.violence.coffemachine.entity.Coffee;

/**
 * created by user violence
 * created on 01.03.2019
 * class created for project coffemachine
 */

public class StandardCoffee {
    public static Coffee getAmericano() {
        return Coffee.newBuilder()
                .setCapacity(0.5D)
                .setName("Americano")
                .setCompositions(1)
                .setCompositions(3)
                .setCompositions(2)
                .build();
    }

    public static Coffee getLatte() {
        return Coffee.newBuilder()
                .setCapacity(0.5D)
                .setName("Latte")
                .setCompositions(1)
                .setCompositions(2)
                .build();
    }
}
