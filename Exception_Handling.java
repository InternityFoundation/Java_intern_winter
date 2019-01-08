
public class Exception_Handling {

	public static void main(String[] args) {
			  try {
			   int d = 1;
			   int n = 20;
			   int fraction = n / d;
			   int a[] = {1,2};
			   a[5] = 50;
			  }
			  catch (ArithmeticException e) {
			   System.out.println("In the catch block due to Exception = " + e);
			  } catch (ArrayIndexOutOfBoundsException e) {
			   System.out.println("In the catch block due to Exception1 = " + e);
			  }
			  System.out.println("End Of Main");
			 }
	}


