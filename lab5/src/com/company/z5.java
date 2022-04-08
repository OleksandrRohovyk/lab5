package com.company;
public class z5 {
    public static void main(String[] args) {

        int []max = new  int[15];
        int x = 0;
        for (int i = 0; i < max.length; i++){
            max[i] = (int)(Math.random()*10);
            if (max[i] % 2 == 0)x += 1;
            System.out.print(max[i] + " ");
        }

        System.out.println();
        System.out.println("x = " + x);
    }
}