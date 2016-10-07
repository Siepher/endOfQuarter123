/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.util.Scanner;


/**
 *
 * @author student
 */
public class EndOfQuarter {
    private static Object MathFuntions;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        for(int i = 1; i < 11; i++)
          System.out.println("Enter number: "+i);
    
        int i = 10;
          
        Scanner input = new Scanner(System.in);
        System.out.print("Enter another number: ");

        
        int n = input.nextInt();
        
        
               if (n < 0) {
    // negative 
               

                } else {
                   double root = Math.sqrt(n);
                   double absolute = Math.abs(n); 
                           System.out.print("");

                   
   // it's a positive
               }        
          
//               MathFuntions.SuquareRootAndAddThree(); 

    
    }
    
    
    
}
