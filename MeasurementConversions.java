/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package measurementconversions;

/**
 *
 * @author user
 */

import java.util.Scanner;
public class MeasurementConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a new Java application called “MeasurementConversions” (without the quotation marks) that prompts the user for 
       // a measurement in meters as a double value. Convert this measurement 3 separate times into miles, feet, and inches.
    Scanner scnr = new Scanner(System.in);
    double meters; //user input of meters
    double miles;  //user input of miles
    double feet;   //user input of feet
    double inches;  //user input of inches
    
    
    System.out.println("Enter a measurement in meters: ");  //promts the user
    meters = scnr.nextDouble();
    //meter conversions are below
      miles   = meters / 1609.34; 
      feet = meters * 3.281;
      inches = meters * 39.36;
      
        System.out.println("There is " + miles + " miles in " + meters + " meters");
        System.out.println("There is " + feet + " feet in " + meters + " meters");
        System.out.println("There is " + inches + " inches in " + meters + " meters");
      
      

    
    }
    
}
