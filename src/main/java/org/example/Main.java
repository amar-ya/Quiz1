package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q-1 java program that accept 3 nums from the user and print the largest number
        int x,y,z;
        System.out.print("give value for the 1st number: ");
        x = input.nextInt();
        System.out.print("give value for the 2nd number: ");
        y = input.nextInt();
        System.out.print("give value for the 3rd number: ");
        z = input.nextInt();

        if (x>y && x>z){
            System.out.println(x+" is the largest among them");
        } else if (y>x && y>z) {
            System.out.println(y+" is the largest among them");
        }else {
            System.out.println(z+" is the largest among them");
        }
        input.nextLine();
        // Q-2 java program that accpet a String and a number from the user then print the character in given index

        System.out.print("please write any word you want: ");
        String word = input.nextLine();
        System.out.print("give me a number from 0 to "+(word.length()-1)+": ");
        int index = input.nextInt();
        System.out.println("the letter that`s in the index "+index+" is "+word.charAt(index));

        // Q-3 java program to enter the numbers till the user wants and at the end it should display the sum entered
        int x3 = 0;
        String ans = "";
        for (; ;){
            System.out.print("please enter an integer value: ");
            x3 += input.nextInt();
            input.nextLine();
            System.out.print("do you want to continue? (y/n): ");
            ans = input.nextLine();
            if(ans.equals("y") || ans.equals("yes")){

            }else {
                System.out.println("the sum of all of these values is: "+x3);
                break;
            }
        }

        // Q-4 java program to find positive and negative numbers of a given array

        int[] arr4 = {10,-21,30,31,-25};
        for (int i = 0; i<arr4.length;i++){
            if(arr4[i] > 0){
                System.out.println(arr4[i]+" is a positive value");
            }if(arr4[i] < 0){
                System.out.println(arr4[i]+" is a negative value");
            }
        }

        // Q-5 java program to find the shortest word of a given array
        String[] arr5 = {"Tuwaiq", "BootCamp", "Student","JAVA"};
        int valueHolder = 1000;
        String shortWord = "";
        for(int i = 0; i < arr5.length;i++){
            if(arr5[i].length() < valueHolder){
                valueHolder = arr5[i].length();
                shortWord = arr5[i];
            }

        }
        System.out.println(shortWord);
    }

}