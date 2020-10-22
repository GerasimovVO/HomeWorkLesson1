package Lesson2HomeWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 2);

        }
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;

            } else a[i] = 0;

        }

        for (int element : a) {
            System.out.print(element + " ");

        }

        int[] b = new int[8];
        for (int i = 0, j = 0; j < b.length; i += 3, j++) {
            b[j] = i;

        }
        System.out.println();
        for (int element : b) {
            System.out.print(element + " ");
        }
        int[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < c.length; i++) {
            if (c[i] < 6) {
                c[i] *= 2;
            }
        }


        System.out.println();
        for (int element : c) {
            System.out.print(element + " ");

        }

        int[][] box = new int[9][9];
        for (int i = 0; i < box.length; i++) {
            for (int j = 0; j < box[i].length; j++) {
                if (i == j) {
                    box[i][j] = 1;
                } else if (i == box.length - j - 1) {
                    box[i][j] = 1;
                }

            }
        }
        System.out.println();
        for (int i = 0; i < box.length; i++) {
            System.out.println();
            for (int j = 0; j < box[i].length; j++) {
                System.out.printf("%3d", box[i][j]);

            }

        }

        arrayMaxMin();

        int[] arrayTen = new int[20];
        for (int i = 0; i < arrayTen.length; i++) {
            arrayTen[i] = (int) (Math.random() * 10);
        }

        int[] massiveOne = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] massiveTwo = {1, 1, 1, 2, 1};
        System.out.println();
        System.out.println(sumOfHalves(massiveTwo));
        System.out.println(sumOfHalves(massiveOne));
        System.out.println(sumOfHalves(arrayTen));
        int n = (int) (Math.random() * 200) * (Math.random() > 0.5 ? 1 : -1);
        System.out.println(Arrays.toString(arrayTen));
        offsetArray(arrayTen, n);
        System.out.println("Число сдвига " + n);
        System.out.println(Arrays.toString(arrayTen));


    }

    public static void arrayMaxMin() {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println();
        System.out.println();
        for (int element : array) {
            System.out.print(element + " ");
        }
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        System.out.println();
        System.out.println("Максимальное число в массиве " + max + " Минимальное число в масиве " + min);

    }

    public static boolean sumOfHalves(int[] array) {
        boolean equality = false;
        int left = 0;
        int right = 0;
        int counter = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - counter; j++) {
                right = right + array[j + counter];
            }
            left = array[i] + left;
            counter++;
            if (left == right) {
                equality = true;
                break;

            } else right = 0;


        }


        return equality;
    }


    public static void offsetArray(int[] array, int offset) {
        offset = offset%array.length;
        if (offset == 0){
            System.out.println(Arrays.toString(array));
        } else if (offset > 0){
            for (int i = 0; i < offset ; i++) {
                int count = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array [j - 1];

                }
                array [0] = count;
            }
        }
        else {
            offset = offset * -1;
            for (int i = array.length; i > offset ; i--) {
                int count = array[array.length -1];
                for (int j = array.length - 1; j > 0 ; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = count;
            }
        }



    }
}




