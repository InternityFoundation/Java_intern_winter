
public class Iterations {

	public static void main(String[] args) {
		fun1(); //while loop
		fun2(); //Do-while loop
		fun3(); //For Loop
		fun4(); //ForEach Loop
		fun5(); //Exit Statement
		fun6(); //Return 
		fun7(); //Continue
		

	}
	public static void fun1() {
		//while loop 
		int num = 7;
         while (num > 0)
{
             System.out.println("Num " + num);
             num--;
         }
	}
	
	public static void fun2() {
		//Do-while loop
		 int num = 7;
         do
{
             System.out.println("num " + num);
             num--;
         } while (num > 0);
	}
	
	public static void fun3() {
		//For loop
		 int num;
         for (num = 5; num > 0; num--);
           System.out.println("num " + num);
	}
	
	public static void fun4() {
		//ForEach Loop
		 int arr[]={1,2,3,4};  
		   for(int i:arr)
		{  
		     System.out.println(i);  
		   }  
	}
	
	public static void fun5() {
		//Exit Statements
		for (int i = 0; i < 10; i++)
	      {
	        if (i == 5)
	        break;
	        System.out.println("i: " + i);
	      }
	    System.out.println("Loop complete.");
	}
	
	public static void fun6() {
		//Return Statement
		 boolean t = true;
		    System.out.println("Before the return.");
		    if (t)
		    return;
		    System.out.println("This won't execute.");
	}
	
	public static void fun7() {
		//Continue Statements
		 for (int i = 0; i < 10; i++)
	      {
	      // If the number is even skip and continue
	      if (i%2 == 0)
	      continue;
	      // If number is odd, print it
	      System.out.print(i + " ");
	}

	}
}
