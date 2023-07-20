package com.testehan.leetcode.easy.e1603;

public class ParkingSystem {

    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType){
            case 1:
                if (this.big>0){
                    big--;
                    return true;
                }
                return false;
            case 2:
                if (this.medium>0){
                    medium--;
                    return true;
                }
                return false;
            case 3:
                if (this.small>0){
                    small--;
                    return true;
                }
                return false;
        }
        return false;
    }

}
