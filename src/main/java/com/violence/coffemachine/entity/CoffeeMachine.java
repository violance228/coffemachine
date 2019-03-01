package com.violence.coffemachine.entity;

import java.util.Set;

/**
 * created by user violence
 * created on 01.03.2019
 * class created for project coffemachine
 */

public class CoffeeMachine {
    private Coffee coffe;
    private Set<Composition> compositions;
    private static CoffeeMachine coffeeMachine;

    public static CoffeeMachine machine() {
        if (coffeeMachine == null)
            coffeeMachine = new CoffeeMachine();
        return coffeeMachine;
    }

    private CoffeeMachine() {}
}
