/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

/**
 *
 * @author jasonfujii
 */
import java.util.*;
public class Program2 {

    
    /*This program takes 3 numbers which were input by the user, then sorts them in increasing order
    and outputs that order.
    */
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 >= num2 && num1 >= num3){ //num1 is the largest
            if(num2 >= num3)
                System.out.println("From least to greatest: " +num3+ ", " +num2+ ", " +num1);
            else if(num2 <= num3)
                System.out.println("From least to greatest: " +num2+ ", " +num3+ ", " +num1);
        }
        else if(num2 >= num1 && num2 >= num3){ //num2 is the largest
            if(num1 >= num3)
                System.out.println("From least to greatest: " +num3+ ", " +num1+ ", " +num2);
            else if(num1 <= num3)
                System.out.println("From least to greatest: " +num1+ ", " +num3+ ", " +num2);
        }
        else if(num3 >= num2 && num3 >= num1){ //num3 is the largest
            if(num2 >= num1)
                System.out.println("From least to greatest: " +num1+ ", " +num2+ ", " +num3);
            else if(num2 <= num1)
                System.out.println("From least to greatest: " +num2+ ", " +num1+ ", " +num3);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey user! Please input 3 numbers (one at a time) and I'll sort them from least to greatest.");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    
}
