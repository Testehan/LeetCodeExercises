package com.testehan.leetcode.cracking.animalShelter;

import java.util.LinkedList;

public class AnimalShelter {

    private LinkedList<Dog> dogs = new LinkedList<>();
    private LinkedList<Cat> cats = new LinkedList<>();
    private int order = 0; // acts as timestamp

    public void enqueue(Animal a) {
         /* Order is used as a sort of timestamp, so that we can compare the insertion order of a dog to a cat. */
         a.setOrder(order);
         order++;

         if (a instanceof Dog) {
             dogs.addLast( (Dog)  a);
         }
         else if (a instanceof Cat) {
             cats.addLast((Cat)a);
         }
    }

    public Animal dequeueAny() {
        if (dogs.isEmpty()){
            return dequeueCats();
        } else if (cats.isEmpty()){
            return dequeueDogs();
        }

        Dog dog= dogs.peek();
        Cat cat= cats.peek();

        if (dog.isOlderThan(cat)) {
             return dequeueDogs();
        } else {
            return dequeueCats();
        }
    }

    public Dog dequeueDogs() {
        return dogs.poll();
    }

    public Cat dequeueCats() {
        return cats.poll();
    }

}
