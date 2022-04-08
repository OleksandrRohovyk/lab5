package com.company;
public class z2 {
    public static void main(String[] args) {

        int []max = new int[20];
        for (int z/*xc*/ = 0; z < max.length; z++){
            max[z] = (int)(Math.random()*9);
            System.out.print(max[z] + " ");
        }

        System.out.println(" ");

        for(int z = 0; z < max.length; z++){
            if(z%2 == 0) max[z] = 0;
            System.out.print(max[z] + " ");
        }
    }
}