/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package greatestnumberfinder;
import java.util.Scanner;
/**
 *
 * @author kihar
 */
public class GreatestNumberFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner f1 = new Scanner(System.in);
        System.out.println("Enter Your Frist Number");
        double F1 = f1.nextDouble();
        
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter Your Second Number");
            double S2 = s2.nextDouble();
        
                Scanner t3 = new Scanner(System.in);
                System.out.println("Enter Your Second Number");
                double T3 = t3.nextDouble();
                
        if (F1>S2)
        {
        if (F1>T3)
                System.out.println("A");
        else
                System.out.println("C");
        
        }
        else{
                if(S2>T3)
                    System.out.println("B");
                else
                    System.out.println("C");
                };
        // TODO code application logic here
    }
    
}
