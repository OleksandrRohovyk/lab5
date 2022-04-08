package com.company;
public class z6 {
    public static void main(String[] args){
        //5
        int[][] z = new int[15][];
        z[0] = new int[5];
        z[1] = new int[5];
        z[2] = new int[5];
        z[3] = new int[5];
        //8
        z[4] = new int[8];
        z[5] = new int[8];
        z[6] = new int[8];
        z[7] = new int[8];
        //3
        z[8] = new int[3];
        z[9] = new int[3];
        z[10] = new int[3];
        z[11] = new int[3];
        //9
        z[12] = new int[9];
        z[13] = new int[9];
        z[14] = new int[9];
        //
        for (int i = 0; i < z.length; i++){
            for (int j = 0; j < z[i].length; j++){
                z[i][j] = (int)(Math.random() * 15);
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}