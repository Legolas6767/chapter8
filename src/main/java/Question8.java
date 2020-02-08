
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
public class Question8 {
     public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
 
    System.out.print("how many cookies did you eat: ");
 
    int cookieCount = sc.nextInt();
 
    int servingSize = 40/10;
    int caloriesPerCookie = 300/servingSize;
    int totalCalories = cookieCount * caloriesPerCookie;
 
    System.out.println("Total calories: " + totalCalories);
}
}