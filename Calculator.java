import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);

	        System.out.println("Calculator");

	        System.out.println("\n Calculator Functions:");
	        System.out.println("\n 1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Division");
	        System.out.println("4. Multiplication");

	        System.out.print("\n Enter your choice: ");
	        int choice = s.nextInt();
	        System.out.println();


	        if (choice == 1){
	            addition();
	        }
	        else if (choice == 2){
	            subtraction();
	        }
	        else if (choice == 3){
	            division();
	        }
	        else if (choice == 4){
	            multiplication();
	        }

	        System.out.println();
	        s.close();
	    }

	    public static void addition(){

	        int n1, n2;
	        Scanner s = new Scanner(System.in);

	        System.out.println("Addition");

	        System.out.print("\nFirst Number: ");
	        n1 = s.nextInt();

	        System.out.print("\nSecond Number: ");
	        n2 = s.nextInt();

	        s.close();
	        System.out.println("\nSum: " + n1 + " + " + n2 + " = " + (n1 + n2));
	    }

	    public static void subtraction(){
	        int n1, n2;
	        Scanner s = new Scanner(System.in);

	        System.out.println("Subtraction");

	        System.out.print("\nFirst Number: ");
	        n1 = s.nextInt();

	        System.out.print("\nSecond Number: ");
	        n2 = s.nextInt();

	        s.close();
	        System.out.println("\nSum: " + n1 + " - " + n2 + " = " + (n1 - n2));
	    }

	    public static void division(){
	        int n1, n2;
	        Scanner s = new Scanner(System.in);

	        System.out.println("Division");

	        System.out.print("\nFirst Number: ");
	        n1 = s.nextInt();

	        System.out.print("\nSecond Number: ");
	        n2 = s.nextInt();

	        s.close();
	        System.out.println("\nSum: " + n1 + " / " + n2 + " = " + (n1 / n2));
	    }

	    public static void multiplication(){
	        int n1, n2;
	        Scanner s = new Scanner(System.in);

	        System.out.println("Multiplication");

	        System.out.print("\nFirst Number: ");
	        n1 = s.nextInt();

	        System.out.print("\nSecond Number: ");
	        n2 = s.nextInt();

	        s.close();
	        System.out.println("\nSum: " + n1 + " x " + n2 + " = " + (n1 * n2));
	    }
	}


