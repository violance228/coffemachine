package com.violence.coffemachine.factory;

import com.violence.coffemachine.entity.Composition;

/**
 * created by user violence
 * created on 01.03.2019
 * class created for project coffemachine
 */

public class CompositionFactory {
    public Composition getCoffee(Integer id) {
        switch (id) {
            case 1:
                return new Composition("sugar", 1, 0.5d);
            case 2:
                return new Composition("milk", 25, 1d);
            case 3:
                return new Composition("smth", 3, 5d);

        }
        return null;
    }
}
