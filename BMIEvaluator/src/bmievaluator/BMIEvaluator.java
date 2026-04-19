/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmievaluator;
import java.util.Scanner;
/**
 *
 * @author kihar
 */
public class BMIEvaluator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        System.out.println("Enter Your Weight");
        double W = w.nextDouble();
            Scanner h = new Scanner(System.in);
                System.out.println("Enter Your Height");
                double H = h.nextDouble();
                
        double BMI = (W/(H*H));
        if (BMI<18.5)
        {
            System.out.println("UnderWeight");
        }
        else if (BMI<=25)
        {
            System.out.println("Normal");
        }
        else if (BMI<=30)
        {
            System.out.println("Overweight");
        }
        else 
        {
            System.out.println("Obese");
        }
        // TODO code application logic here
    }
    
}
