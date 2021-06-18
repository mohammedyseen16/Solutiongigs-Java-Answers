package Java;

import java.util.Scanner;

class switchStr{
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter ");
        String str = input.nextLine();
        
        switch (str){ 
            case "java":
                System.out.println("Java is a best programming language");
                break;
            case "java string":
                System.out.println("This is an example for Java Switch using String");
                break;
            default:
                System.out.println("Hello please enter the different word");
                break;
        }
    }
}