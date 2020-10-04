//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 7

import java.util.Scanner;
import static java.lang.System.*;

public class Lab7A {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] myNum = new int[size];

        for (int i = 0; i < myNum.length; i++) {
            myNum[i]= i*i;
        }

        for (int i = 0; i < myNum.length; i++) {
            out.print("|" + myNum[i]);
        }
    }
}