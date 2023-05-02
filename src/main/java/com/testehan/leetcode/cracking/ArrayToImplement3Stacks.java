package com.testehan.leetcode.cracking;

// Three in One: Describe how you could use a single array to implement three stacks

public class ArrayToImplement3Stacks {

    private static final int NO_OF_STACKS =3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ArrayToImplement3Stacks(int stacksize){
        this.stackCapacity = stacksize;
        values=new int[stacksize*NO_OF_STACKS];

        sizes = new int[NO_OF_STACKS];
    }

    public boolean isFull(int stackNumber){
        if (sizes[stackNumber] == stackCapacity){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(int stackNumber){
        return (sizes[stackNumber]==0);
    }

    private int indexOfTop(int stackNumber){
        int offset = stackNumber*stackCapacity;
        int size = sizes[stackNumber];

        return offset+size-1;
    }

    public void push(int element, int stackNumber){
        if (isFull(stackNumber)){
            System.out.println("The stack " + stackNumber + " is full !!!");
        } else {
            sizes[stackNumber]++;
            int index = indexOfTop(stackNumber);
            values[index] = element;
        }
    }

    public int pop(int stackNumber){
        if (isEmpty(stackNumber)){
            System.out.println("The stack " + stackNumber + " is empty !!!");
            return -1;
        } else {
            int index = indexOfTop(stackNumber);
            int value = values[index];

            // deletion of element
            values[index] = 0;
            sizes[stackNumber]--;
            return value;
        }
    }

    public int peek(int stackNumber){
        if (isEmpty(stackNumber)){
            System.out.println("The stack " + stackNumber + " is empty !!!");
            return -1;
        } else {
            int index = indexOfTop(stackNumber);
            int value = values[index];
            return value;
        }
    }

    public static void main(String[] args) {
        ArrayToImplement3Stacks stacks = new ArrayToImplement3Stacks(3);

        System.out.println(stacks.isFull(1));
        System.out.println(stacks.isEmpty(1));

        stacks.push(3,0);
        stacks.push(4,0);
        stacks.push(5,1);
        stacks.push(6,1);

        System.out.println(stacks.pop(0));
        System.out.println(stacks.pop(0));
        System.out.println(stacks.pop(1));
        System.out.println(stacks.pop(1));

    }

}
