package com.testehan.leetcode.cracking.animalShelter;

// Animal Shelter

public class Solution {

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Dog("ham"));
        shelter.enqueue(new Dog("ham2"));
        System.out.println(shelter.dequeueAny());

        shelter.enqueue(new Cat("meaow"));
        shelter.enqueue(new Cat("meaow2"));
        shelter.enqueue(new Cat("meaow3"));
        System.out.println(shelter.dequeueDogs());
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueCats());
    }
}
