//Class: CSE 1321L
//Section: 06
//Term: 2020 Fall
//Instructor: Keerthi Manchukonda
//Name: Ryan James Bibby
//Lab#: 7

import java.util.Scanner;
import static java.lang.System.*;

public class Lab7B {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        float gpa = 0;
        out.print("Enter the number of GPAs: ");
        int size = input.nextInt();

        float[] myNum = new float[size];

        //this is where the error is, i think
        for (int i = 0; i < myNum.length; i++) {
            out.println("GPA #" + i +": ");
            myNum[i] = input.nextFloat();
        }

        //this for loop is only for testing
        for (int i = 0; i < myNum.length; i++) {
            if (myNum[i] >= 3.9){
                out.println("Student #" + i + ": Summa Cum Laude");
            }else if (myNum[i] >= 3.7){
                out.println("Student #" + i + ": Magna Cum Laude");
            }else if (myNum[i] >= 3.5){
                out.println("Student #" + i + ": Cum Laude");
            }else if (myNum[i] >= 2){
                out.println("Student #" + i + ": Graduating");
            }else{
                out.println("Student #" + i + ": Not graduating");
            }
        }
    }
}
