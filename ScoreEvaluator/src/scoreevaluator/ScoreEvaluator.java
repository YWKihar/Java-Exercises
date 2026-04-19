/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scoreevaluator;
import java.util.Scanner;
/**
 *
 * @author kihar
 */
public class ScoreEvaluator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Your Score");
        double score = S.nextDouble();
        if (score>=90)
               
            System.out.println("A");
               
        else if(score>=80)
                
                System.out.println("B");
                
        else if(score>=70)
                
                System.out.println("C");
                
        else if(score>=60)
                
                System.out.println("D");
                
        else
        System.out.println("F");
        // TODO code application logic here
    }
    
}
