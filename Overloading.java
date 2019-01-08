
class Sum { 
	    public int sum(int a, int b) 
	    { 
	        return (a + b); 
	    } 
	    public int sum(int a, int b, int c) 
	    { 
	        return (a + b + c); 
	    } 
	    public double sum(double a, double b) 
	    { 
	        return (a + b); 
	    } 
	  
	} 

public class Overloading {
  
	
	public static void main(String[] args) {
		
	    { 
	        Sum s = new Sum(); 
	        System.out.println(s.sum(20, 30)); 
	        System.out.println(s.sum(20, 30, 40)); 
	        System.out.println(s.sum(20.5, 30.5)); 
	    } 


	}

}
