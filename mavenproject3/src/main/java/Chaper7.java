/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trey-
 */
public class Chaper7 {
    
public static void main (String[] args) throws java.lang.Exception

{
   try{

        int[] arr1 = {1,-9,10,2,4,-2,7};

      int num1=2;

      System.out.println("Numbers greater than "+num1+" in the 1st array are :");
     
      fun(arr1,num1);

      int[] arr2 = {11, 18, 150, 9};

      int num2 = 10;

      System.out.println("Numbers greater than "+num2+" in the 2nd array are :");

      fun(arr2, num2);

   }catch(Exception ex){
}

}

public static void fun(int[] arr,int n)

  {

  for(int i=0; i<arr.length; i++)

  {
      if (arr[i]>n)

          System.out.print(arr[i]+" ");
  }

  System.out.println();
}

}

