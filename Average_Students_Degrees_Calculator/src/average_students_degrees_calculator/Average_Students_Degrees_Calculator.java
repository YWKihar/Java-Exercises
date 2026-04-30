/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average_students_degrees_calculator;
import java.util.Scanner;
/**
 *
 * @author kihar
 */
public class Average_Students_Degrees_Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double counter = 1 , grade = 0 , sum = 0;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter The Number Of Student");
        double SN = Input.nextDouble();
        while (counter<=SN)
        {
            System.out.println("Enter The Grade Of Student Nom."+counter);
            grade = Input.nextDouble();
            sum +=grade;
            counter++;
        };
        counter--;
        System.out.println("The Average Of Grades Is :"+(sum/counter));
        
        
        // TODO code application logic here
    }
    
}
