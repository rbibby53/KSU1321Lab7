//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 7

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Arrays;

public class Lab7C {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Enter the size of the arrays: ");
        int size = input.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        for (int i = 0; i < size; i++) {
            out.println("Enter array 1 slot " + i + ":");
            arr1[i] = input.nextInt();
            out.println("Enter array 2 slot " + i + ":");
            arr2[i] = input.nextInt();
        }
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The arrays are identical");
        }else
            System.out.println("The arrays are not identical");
    }
}