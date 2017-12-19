/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_world;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author PML
 */
public class Hello_world {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        
        funny();
        funny();
        funny();
       
     //general output
        System.out.println(good.length());
        System.out.println(good.substring(2,10));
        boolean equalsmaybemaybe = "hahaha".equals("hahaha");
        System.out.println(equalsmaybemaybe);
        
// arrays
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums[5]);
        
        int[] newArr = Arrays.copyOfRange(nums, 5, 8); 
        System.out.println(newArr);
     
    // user input
        Scanner input = new Scanner(System.in);
         System.out.println("Enter number ");
         int myint = input.nextInt();
         System.out.printf("You entered %d", myint);
         
    }
    public static void funny() { 
        System.out.println("hello worldness");
        
    }
    
    
    public static String good = "test this string";

    
}
