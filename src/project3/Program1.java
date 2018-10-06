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
    public class Program1 {
    final static int MAX_NUMBER = 8;
    final static int MIN_NUMBER = 1;
    static int image_Number = 1;
    
    public static int forward(int current_Number){ //Takes the current image_Number and advances it by 1.
        current_Number++;                          //If that number becomes greater than MAX_NUMBER, the number will 
        if(current_Number > MAX_NUMBER)            //loop back to MIN_NUMBER and start there.
            current_Number = MIN_NUMBER;
        System.out.println("you just advanced the number");
        return current_Number;
    }
    
    public static int backward(int current_Number){ //Takes the current image_Number and decreases it by 1
        if(current_Number > MIN_NUMBER)             //if the number is greater than MIN_NUMBER. If the number is
            current_Number--;                       //equal to or less than MIN_NUMBER, backward() returns MIN_NUMBER.
        else
            current_Number = MIN_NUMBER;
        return current_Number;
    }
    
    public static String createFileName(int current_Number){ //returns a string: "pictureX.gif" where
        return "picture" +current_Number+ ".gif";            //X is current_Number
    }
    
    public static String createRandomName(){ //returns a string: "pictureX.gif" where X is a randomly
        int x = (int)(Math.random()*8)+1;    //generated integer between MIN_NUMBER and MAX_NUMBER
        return "picture" +x+ ".gif";
    }
    
    /*This method is the interface the user interacts with. It displays all the options available and allows the 
    user to choose which method they want. Using a while loop and a switch statement, I call all other methods through this 
    methods and display the current image_Number. */
    public static void showMenu(){ 
        Scanner sc = new Scanner(System.in);
        int userChoice;
        boolean x = true;
        while(x){                
            System.out.println("The current image number is: " +image_Number);
            System.out.println("Enter the number of the operation you wish to happen.");
            System.out.println("1. Go forward one image");
            System.out.println("2. Go back one image");
            System.out.println("3. Find the image's file name");
            System.out.println("4. Find a random image's file name");
            System.out.println("5. Exit this program");
            userChoice = sc.nextInt();
            switch(userChoice){
                case 1: image_Number = forward(image_Number);
                        break;
                case 2: image_Number = backward(image_Number);
                        break;
                case 3: System.out.println(createFileName(image_Number));
                        break;
                case 4: System.out.println(createRandomName());
                        break;
                case 5: x = false;
                        break;
            }
        }
    }
    // Main method to call showMenu()
    public static void main(String[] args) {
        showMenu();
    }
    
}
