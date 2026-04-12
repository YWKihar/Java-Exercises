/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eelu;
import java.util.Scanner;
/**
 *
 * @author YWKihar
 */
public class EELU {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Lev = new Scanner(System.in);
        System.out.print("Enter Your Level : ");
        int L = Lev.nextInt();
        
        Scanner Sem = new Scanner(System.in);
        System.out.print("Enter Your Semester : ");
        int S = Sem.nextInt();
        
       switch (L)                                                              {
           case 1 :
               switch (S){
                   case 1 :
                       System.out.println("Your Courses are:");
                       System.out.println("Electronics");
                       System.out.println("Mathematics1");
                       System.out.println("Technical Report Writing");
                       System.out.println("Human Rights");
                       System.out.println("Discrete Math");
                       System.out.println("Introduction to Computers");
                       break ;
                   case 2 :
                       System.out.println("Your Courses are:");
                       System.out.println("Probability and Statistics-1");
                       System.out.println("Creative and Scientific Thinking");
                       System.out.println("Mathematics-2");
                       System.out.println("Micro Economics");
                       System.out.println("Logic Design");
                       System.out.println("Programming Language");
                       break ;
                   default :
                       System.out.println("You can only choose between semester 1 or 2. Wrong option!");
                         }
                break ;     
            case 2 :
                switch (S){
                   case 1 :
                       System.out.println("Your Courses are:");
                       System.out.println("Object Oriented Programing");
                       System.out.println("Introduction to Database systems");
                       System.out.println("Mathematics-3");
                       System.out.println("Computer Networks Technology");
                       System.out.println("Probability and Statistics-2");
                       System.out.println("Introduction to Software Engineering");
                       break ;
                   case 2 :
                       System.out.println("Your Courses are:");
                       System.out.println("Introduction to Operation Research");
                       System.out.println("Data Structure");
                       System.out.println("Machine Learning Fundamentals");
                       System.out.println("Web Technology");
                       System.out.println("Entrepreneurship");
                       System.out.println("Networking Fundamentals lab");
                       break ;
                   default :
                       System.out.println("You can only choose between semester 1 or 2. Wrong option!");
                          }
                break ;
            case 3 :
                switch (S){
                   case 1 :
                       System.out.println("Your Courses are:");
                       System.out.println("Network Routing and Switching-Lab");
                       System.out.println("Artificial intelligence");
                       System.out.println("Operating Systems");
                       System.out.println("Digital Signal Processing");
                       System.out.println("Computer Organization");
                       System.out.println("Algorithms analysis and Design");
                       break ;
                   case 2 :
                       System.out.println("Your Courses are:");
                       System.out.println("Pattern Recognition");
                       System.out.println("Information Computer Networks Security");
                       System.out.println("op-Natural Language Processing");
                       System.out.println("Advanced Software Engineering");
                       System.out.println("Microcontroller");
                       System.out.println("Ethical Hacking-lab");
                       break ;
                   default :
                       System.out.println("You can only choose between semester 1 or 2. Wrong option!");
                           }
                break ;
            case 4 :
                switch (S){
                   case 1 :
                       System.out.println("Your Courses are:");
                       System.out.println("Selected labs in Software Engineering");
                       System.out.println("Embedded Systems");
                       System.out.println("Computer Graphics");
                       System.out.println("Advanced Computer Networks");
                       System.out.println("Project (1)");
                       System.out.println("Communication Technology");
                       break ;
                   case 2 :
                       System.out.println("Your Courses are:");
                       System.out.println("Cloud Computing Networking");
                       System.out.println("Semantic Web and ontology");
                       System.out.println("Wireless and Mobile Networks");
                       System.out.println("Fundamental of Management");
                       System.out.println("Project (2)");
                       System.out.println("Selected labs in AI");
                       break ;
                   default :
                       System.out.println("You can only choose between semester 1 or 2. Wrong option!");
                           }
                break ;
        
                                                                               }
    }
                
    
}          

        
   

    

