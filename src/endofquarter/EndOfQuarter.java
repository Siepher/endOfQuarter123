/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endofquarter;

import java.util.ArrayList;
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

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int e = reader.nextInt();

        for(int i = 1; e >= i; i++) 
        {     
            System.out.println(i);
        }
          
        Scanner input = new Scanner(System.in);
        System.out.print("Enter another number: ");

        
        int Number1 = input.nextInt();
        
        ArrayList<Double> lstArray = new ArrayList<Double>();
                           
        if (Number1 < 0) 
        {
             // negative don't do nothing lol
        } else 
        {
             // it's a positive
             double x;
             x = MathFunctions.SquareRootAndAddThree(Number1);
             if ( x <= 1000 )
             {
                lstArray.add(x);
             }
        }       
        double total = 0;
        for (Double item : lstArray) {
            total += item;
        }
        
        System.out.print("The Sum is " + total) ;    
    }
}
