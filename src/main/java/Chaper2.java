
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

public class Chaper2 {
    public static void main(String[] args) {
       
     
    Scanner keyboard = new Scanner(System.in);
    System.out.print(" What is the Purchase Amount?");
        double purchaseAmount = keyboard.nextDouble( );

        double stateSalesTax = 0.04 * purchaseAmount;
        double countySalesTax = 0.02 * purchaseAmount;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalSale = totalSalesTax + purchaseAmount;


    System.out.println( " Purchase " + purchaseAmount);
    System.out.println( " State Tax " + stateSalesTax);
    System.out.println( " County Tax " + countySalesTax );
    System.out.println( " Total Tax " + totalSalesTax +"\n_________");
    System.out.println( " Total Sale " + totalSale);
   
    }
    
  
}
