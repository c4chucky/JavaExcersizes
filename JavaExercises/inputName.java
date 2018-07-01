/**
 * 
 */
/**
 * @author CBrown
 * Date 26/06/2018
 *
 *Source: https://www.w3resource.com/java-exercises/basic/index.php
 *
 */
package JavaExercises;

import java.util.Scanner;

public class inputName {
  @SuppressWarnings("resource")
public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Input your first name: ");
    String fname = input.next();
    System.out.print("Input your last name: ");
    String lname = input.next();
    System.out.println();
    System.out.println("Hello \n"+fname+" "+lname+"\nWelcome to Java!");
  }	
}

