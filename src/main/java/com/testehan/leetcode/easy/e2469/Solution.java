package com.testehan.leetcode.easy.e2469;

// 2469. Convert the Temperature

public class Solution {

    /*
            Kelvin = Celsius + 273.15
            Fahrenheit = Celsius * 1.80 + 32.00
     */
    public static double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15d;
        result[1] = celsius * 1.80d + 32;

        return result;
    }

    public static void main(String[] args) {
        double[] result =convertTemperature(36.50d);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
