/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package voul_letter_check;

import java.util.Scanner;

/**
 *
 * @author kihar
 */
public class Voul_Letter_Check {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your letter (lowercase only):");

        char LT = input.next().charAt(0);

        if (Character.isLetter(LT)) {
            switch (LT) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("This is a vowel");
                    break;

                default:
                    System.out.println("This is not a vowel letter");
            }
        } 
        else {
            System.out.println("You can enter letters only");
        };
        // TODO code application logic here
    }

}
