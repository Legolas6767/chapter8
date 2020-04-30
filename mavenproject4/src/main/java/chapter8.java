import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class CHAPTER8 {
    private double tractLength;
    private double tractWidth;
    private double area;

	    public CHAPTER8()
	    {

	        area = 0.0;
	    }
	    public CHAPTER8(double length, double width)

	    {

	        tractLength = length;

	        tractWidth = width;

	    }
	    public double getLength(double length)

	    {

	    return length;

	    }

	    public double getWidth(double width)

	    {
	    return width;

	    }
	    public double getArea(double area, double length, double width)

	    {

	        area = length * width;

	        return area;

	    }

	    public boolean equals(LandTract tract2)

	    {

	    return this.area == tract2.area;

	    }
	     
	    public String toString(int area)

	    {

	        return "Area: " + area;

	    }

	   static {
	      public static void main(String[] args)

	      {

	        double length;         

	         double width;       

	          

	       

	         Scanner keyboard = new Scanner(System.in);

	       

	       

	         System.out.print("Enter the length of Tract 1: ");

	         length = keyboard.nextDouble();

	            System.out.print("Enter the width of Tract 1: ");

	         width = keyboard.nextDouble();

	       

	       

	         LandTract tract1 = new LandTract(length, width);

	       

	       

	         System.out.print("Enter the length of tract 2: ");

	         length = keyboard.nextDouble();

            System.out.print("Enter the width of tract 2: ");

	         width = keyboard.nextDouble();

	       

	       

	         LandTract tract2 = new LandTract(length, width);

	       

	       

	         System.out.println("\nTract 1 Area: " + tract1);

	         System.out.println("Tract 2 Area: " + tract2 + "\n");

	       

	      // Determine whether the two tracts are equal

	         if (tract1.equals(tract2))

	            System.out.println("The tracts are the same size");

	         else

            System.out.println("The tracts are NOT the same size");

	      }

	   }