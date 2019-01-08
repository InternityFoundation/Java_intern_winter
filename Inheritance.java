
class ParentClass{
		   //Parent class
		   ParentClass(){
			System.out.println("Parent Constructor");
		   }
		   void disp(){
			System.out.println("Parent Method");
		   }
		}
		
		  
public class Inheritance extends ParentClass {
	
	 Inheritance(){
			System.out.println("Child Constructor");
		   }
		   void disp(){
			System.out.println("Child Method");
			super.disp(); //Parent Constructor Called
		   }
		   public static void main(String args[]){
			Inheritance obj = new Inheritance(); //Object of Child Class
			obj.disp();
		   }
		}

