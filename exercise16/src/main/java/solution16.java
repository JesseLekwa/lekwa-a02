/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 16
 *  Copyright 2021 jesse lekwa
 */



import java.util.Scanner;

public class solution16{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("What is your age? ");
        int age=s.nextInt();

        if(age<0)
            System.out.println("Enter a valid age");
        else
        {

            String country[]={"Algeria","Canada","Africa","Mexico", "Iran"};
            int valid_age[]= {18,16,17,15,18};

            for(int i=0;i<5;i++)
                System.out.println( age>=valid_age[i] ? "Yoar are old enough to legally drive in " + country[i] : "Yoar are not old enough to legally drive " +country[i]);
        }
    }
}