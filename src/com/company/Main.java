package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = new int[3][5];
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = rand.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}