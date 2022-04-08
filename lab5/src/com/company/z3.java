package com.company;
public class z3 {
    public static void main(String[] args) {

        int max1[] = new int[5];
        int max2[] = new int[5];
        int max3[] = new int[5];
        double z = 0,x = 0,c = 0;
        for(int i = 0; i < 5; i++){
            max1[i] = (int)(Math.random()*5);
            max2[i] = (int)(Math.random()*5);
            max3[i] = (int)(Math.random()*5);
            z += max1[i];
            x += max2[i];
            c += max3[i];
        }

        z /= 5;
        x /= 5;
        c /= 5;
        for(int i = 0; i < 5; i++){System.out.print(max1[i] + " ");}
        System.out.print(" mas1 = " + z);
        System.out.println(" ");
        for(int i = 0; i < 5; i++) {System.out.print(max2[i] + " ");}
        System.out.print(" mas2 = " + x);
        System.out.println(" ");
        for(int i = 0; i < 5; i++) {System.out.print(max3[i] + " ");}
        System.out.print( " mas3 = " + c);
        System.out.println(" ");

        if ((z > x) & (z > c)){
            System.out.println("mas1");
        }else if((x > z) & (x > c)){
            System.out.println("mas2");
        }else if((c > x) & (c > z)){
            System.out.println("mas3");
        }else if (z == x){
            System.out.println("mas1 = mas2");
        }else if(z == c){
            System.out.println("mas1 = mas3");
        }else if(x == c){
            System.out.println("mas2 = mas3");
        }else{
            System.out.println("mas1 = mas2 = mas3");
        }
    }
}