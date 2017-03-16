/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopyplanet;
import java.util.Scanner;
/**
 *
 * @author Nan Kani
 */
public class Loopyplanet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    Scanner scan = new Scanner(System.in); 
    
        try {
        
        System.out.println("\t"+"\t"+"Menu of the Planets");
        System.out.println("\t"+"\t"+"== == == == == == ==");
        System.out.println("\t"+"\t"+"1. Jupiter, 2. Mars, 3. Mercury, 4. Neptune, 5. Pluto, 6. Saturn, 7. Uranus, 8. Venus, 9. <Quit>");
        
        System.out.println(" Enter your menu choice:"+"\t");
        int s = scan.nextInt();
        System.out.println(" Enter your weight on earth:"+"\t");
        int p = scan.nextInt();
        double d = (double)p;
        
        double factor = 0;
        
        String planet ="";
        
        
        while (s!=9)
        {
                while(s<1 || s>9)
                {
                    System.out.println("Please enter one of the digits from 1-9"+"\n");
                    s = scan.nextInt();
                }
        
       
        
         if (s!=9)    
        {
   
            if (s==1)
            {
                factor = 2.64;
                planet = "Jupiter";
         
            }
            if (s==2)
            {
                factor = 0.38;
                planet = "Mars";
         
            }
            if (s==3)
            {
                factor = 0.37;
                planet = "Mercury";
         
            }
            if (s==4)
            {
                factor = 1.12;
                planet = "Neptune";
         
            }
            if (s==5)
            {
                factor = 0.04;
                planet = "Pluto";
         
            }
            if (s==6)
            {
                factor = 1.15;
                planet = "Saturn";
         
            }   
            if (s==7)
            {
                factor = 1.15;
                planet = "Uranus";
         
            }
            if (s==8)
            {
                factor = 0.88;
                planet = "Venus";
         
            }
        
            double newWeight = factor*d;
        
        
                
            System.out.println(" Your weight of " + p + " pounds on Earth would be "+ newWeight +" pounds on "+planet+"\t"+"\n");
            
            System.out.println(" Enter your menu choice:"+"\t");
            s = scan.nextInt();
            
        
        }
         
        if (s==9)
        {
            System.out.println("Okay! Have a great day! Goodbye");
        }
        
        }
        
        }
            
        
        catch ( Exception err ) {
            System.out.println( err.getMessage( ) );
            }
            
            
            
            
    }
    

    }
    

