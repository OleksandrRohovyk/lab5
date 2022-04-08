package com.company;
public class z4 {
    public static void main(String[] args) {

        int z[] = new int[10];
        int x[] = new int[10];
        int c[] = new int[10];
        for(int i = 0; i < z.length; i++){
            z[i] = (int)(Math.random()*10);
            x[i] = (int)(Math.random()*10);
            c[i] = z[i] + x[i];
        }

        for(int i = 0; i < z.length; i++) System.out.print(z[i] + " ");
        System.out.println();
        for(int i = 0; i < x.length; i++) System.out.print(x[i] + " ");
        System.out.println();
        for(int i = 0; i < c.length; i++) System.out.print(c[i] + " ");
        System.out.println();
    }
}