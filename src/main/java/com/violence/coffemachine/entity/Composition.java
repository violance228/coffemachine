package com.violence.coffemachine.entity;

import java.util.Objects;

/**
 * created by user violence
 * created on 01.03.2019
 * class created for project coffemachine
 */

public class Composition {
    private String substance;
    private Integer count;
    private Double cost;

    public Composition(String substance, Integer count, Double cost) {
        this.substance = substance;
        this.count = count;
        this.cost = cost;
    }

    public String getSubstance() {
        return substance;
    }

    public Integer getCount() {
        return count;
    }

    public Double getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Composition that = (Composition) o;
        return Objects.equals(substance, that.substance) &&
                Objects.equals(count, that.count) &&
                Objects.equals(cost, that.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(substance, count, cost);
    }

    @Override
    public String toString() {
        return "Composition{" +
                "substance='" + substance + '\'' +
                ", count=" + count +
                ", cost=" + cost +
                '}';
    }
}
