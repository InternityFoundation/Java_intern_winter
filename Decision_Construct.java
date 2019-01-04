
public class Decision_Construct {

	public static void main(String[] args) {
		func1();
	}
		
		public static void func1() {
			//If Statements
			int a = 20;
        if (a < 30)
        System.out.println("20 is less than 30");
		}

        public static void func2() {
        	//If-else Statements
        	  int a = 10;
        	     if (a < 15)
        	     System.out.println("a is smaller than 15");
        	    else
        	    System.out.println("a is greater than 15");
        }
        public static void func3() {
        	//Nested If-Else
        	int a = 10;
            if (a == 10)
              {
                // First if statement
                if (a < 15)
                System.out.println("a is smaller than 15");
                // Nested - if statement Will only be executed if statement above it is true
                if (a < 12)
                System.out.println("a is smaller than 12 too");
            else
            System.out.println("a is greater than 15");
              }
        }
        public static void func4() {
        	//If-elseif Statements
        	int a = 20;
            if (a == 10)
            System.out.println("a is 10");
            else if (a == 15)
            System.out.println("a is 15");
            else if (a == 20)
            System.out.println("a is 20");
          else
          System.out.println("a is not present");
        }
        public static void func5() {
        	//Switch-case
        	 int a = 9;
        	    switch (a)
        	      {
        	      case 0:
        	      System.out.println("a is zero.");
        	      break;
        	      case 1:
        	      System.out.println("a is one.");
        	      break;
        	      case 2:
        	      System.out.println("a is two.");
        	      break;
        	      default:
        	      System.out.println("a is greater than 2.");
        	      }
        }
}


