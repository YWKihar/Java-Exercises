/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectanglearea                           ;
import java.util.Scanner                                      ; // Import the Scanner class to get user input
/**
 *
 * @author kihar
 */
public class RectangleArea {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner input = new Scanner(System.in)                ;

        
        // Define variables to store dimensions and calculated area
        double  Length , Width, Area                           ;

        
        // Prompt the user and read the rectangle length from the keyboard
        System.out.println ("Enter Your Rectangle Length")     ;
        Length = input.nextDouble ()                           ;

        
        // Display a prompt message and take the width input on the same line
        System.out.println ("Enter Your Rectangle Width")     ;
        Width = input.nextDouble ()                           ;

        
        // Calculate the area by multiplying length and width
        Area = Length * Width                                  ;
        
        // Display the result using formatted output
        System.out.printf("The Rectangle Area Is %.2f", Area) ;

        
    }
}
