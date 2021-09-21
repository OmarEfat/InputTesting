/*
This program created for personal purposes only for helping me in testing my inputs in any contest I participate in
It helps in testing the inputs of integers and String ( specific charters or unspecified )
It is created on 20th of September, 2021.
It is created by OMAR TAHA
*/

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 's' for String testing, else enter any letter");
        char c = scn.next().charAt(0);
        if(c=='S' || c=='s') {
            System.out.println("Enter number of tests");
        int t = scn.nextInt();
            System.out.println("Do you have a maximum size of String to test?\nif No please enter 0");
            int max = scn.nextInt();
            System.out.println("Do you need specific letters? Y/N");
            char decision = scn.next().charAt(0);
            char[]a= new char[0];
            int size = 0;
            if(decision=='Y')
            {
                System.out.println("Please enter the number of the letters then the letters seperated by space or enter");
                 size= scn.nextInt();
                a = new char[size];
                for(int i = 0 ; i<size ; i++)
                    a[i]=scn.next().charAt(0);
            }
            System.out.println(t);
                for (int i = 0; i < t; i++) {
                    String word = "";
                    int length=0;
                    if(max==0)
                     length = (int) (Math.random() * 100);
                    else
                        length=max;
                    System.out.println(length);
                    if(decision=='N')
                    for (int j = 0; j < length; j++)
                        word += (char) ((int) (Math.random() * 26) + 'a');
                    else
                        for(int j = 0 ; j<length;j++)
                            word+=a[(int)(Math.random()*size)];
                    System.out.println(word);
                }

        }
        else {
            System.out.println("Enter number of tests ");
            int t = scn.nextInt();
            System.out.println(t);
            for (int i = 0; i < t; i++)
                System.out.println((int) (Math.random() * 2147483647));
        }

    }
}
