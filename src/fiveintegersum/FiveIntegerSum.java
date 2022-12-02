/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fiveintegersum;

/**
 *
 * @author ernestine. Add five integers (numbers) and display their sum. 
 */
public class FiveIntegerSum {  //Save as FiveIntegerSum.java

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int number1 = 11; //declare 5 interger variables and assign a value
         int number2 = 22;
         int number3 = 33;
         int number4 = 44;
         int number5 = 55;
         int sum; //declare an integer variable called sum to hold the sum
         sum = number1 + number2 + number3 + number4 + number5;  //compute sum
         System.out.print("The sum is ");  //Print a descriptive string
                                              //Cursor stays after the printed string
         System.out.println(sum); //Print the value stored in variable sum
                                    //cursor advances to the beginning of next line
    }
    
}
