/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trianglevalidator;
import java.util.Scanner;
/**
 *
 * @author kihar
 */
public class TriangleValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter The Trinangle Frist Side");
        double S1 = s1.nextDouble();
        
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter The Trinangle Second Side");
            double S2 = s2.nextDouble();
            
                    Scanner s3 = new Scanner(System.in);
                    System.out.println("Enter The Trinangle Third Side");
                    double S3 = s3.nextDouble();
                    
                    
                    if ((S1+S2>S3)&&(S1+S3>S2)&&(S2+S3>S1))
                        System.out.println("This Is Valid Triangle");
                    else
                        System.out.println("This Is Wrong Triangle Sides");
        // TODO code application logic here
    }
    
}
