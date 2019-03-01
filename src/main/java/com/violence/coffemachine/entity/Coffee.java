package com.violence.coffemachine.entity;

import com.violence.coffemachine.factory.CompositionFactory;

import java.util.Objects;
import java.util.Set;

/**
 * created by user violence
 * created on 01.03.2019
 * class created for project coffemachine
 */

public class Coffee {
    private String name;
    private Set<Composition> compositions;
    private Double capacity;

    public String getName() {
        return name;
    }

    public Set<Composition> getCompositions() {
        return compositions;
    }

    public Double getCapacity() {
        return capacity;
    }

    public static Builder newBuilder() {
        return new Coffee().new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffe = (Coffee) o;
        return Objects.equals(name, coffe.name) &&
                Objects.equals(compositions, coffe.compositions) &&
                Objects.equals(capacity, coffe.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, compositions, capacity);
    }

    public class Builder {

        private String name;
        private Set<Composition> compositions;
        private Double capacity;

        public Coffee.Builder setName(String substance) {
            Coffee.this.name = substance;
            return this;
        }

        public Coffee.Builder setCompositions(Integer id) {
            Coffee.this.compositions.add(new CompositionFactory().getCoffee(id));
            return this;
        }

        public Coffee.Builder setCapacity(Double capacity) {
            Coffee.this.capacity = capacity;
            return this;
        }

        public Coffee build() {
            return Coffee.this;
        }
    }
}
