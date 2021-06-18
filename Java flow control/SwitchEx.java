package Java;

import java.util.Scanner;

public class SwitchEx {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = input.nextInt();
 
      String Message;
  
      // switch statement to check size
      switch (number) {
  
        case 1:
          Message = "Hello";
          break;
  
        case 2:
          Message = "Welcome to";
          break;
  
        case 3:
          Message = "Solutiongigs";
          break;
        
        default:
          Message = "Sorry please try another Numbers";
          break;
  
      }
    System.out.println("Message: " + Message);
  }
}

