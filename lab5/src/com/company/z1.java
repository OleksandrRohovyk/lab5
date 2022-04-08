package com.company;
public class z1 {
    public static void main(String[] args) {

        int[] max = new int[50];
        for (int z = 0, x = 1; x <= 99; z++, x += 2){
            max[z] = x;
            System.out.println(max[z]);
        }
    }
}