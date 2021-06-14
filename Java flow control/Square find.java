package Java;

import java.util.Scanner;

public class Squa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of Length: ");
        int L = input.nextInt();

        System.out.print("Enter the value of Breadth: ");
        int b = input.nextInt();

        if (L == b){
            System.out.println("The given Measuremets shows it is a Square beacuse all sides are equal");
            System.out.println("The figure looks like");
            System.out.println("     "+ b +"   ");
            System.out.println(" _________");
            System.out.println("|         |");
            System.out.println("|         |"+ L);
            System.out.println("|         |");
            System.out.println("|_________|");
        }
        else{
            System.out.println("The given Measuremets shows it is a Rectangle beacuse only opposite sides are equal");
            System.out.println("The figure looks like");
            System.out.println("        "+ b +"     ");
            System.out.println(" ___________________");
            System.out.println("|                   |");
            System.out.println("|                   |"+ L);
            System.out.println("|                   |");
            System.out.println("|___________________|");
    
        }   
    }
  
}
