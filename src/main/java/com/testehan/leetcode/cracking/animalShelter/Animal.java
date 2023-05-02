package com.testehan.leetcode.cracking.animalShelter;

public abstract class Animal {

    private int order;
    protected String name;

    public Animal(String n) {
        name = n;
    }

    public void setOrder(int ord) {
        this.order= ord;
    }
    public int getOrder() { return order; }

    /* Compare orders of animals to return the older item. */
    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "order=" + order +
                ", name='" + name + '\'' +
                '}';
    }
}
