import java.util.*; 
class Point 
	{ 
	    Integer x, y; 
	    Point(Integer x, Integer y) { 
	        this.x = x; 
	        this.y = y; 
	    } 
	      
	    public String toString() {  
	        return this.x + ", "+ this.y; 
	    }  
	} 
public class Sorting_using_streamAPI {
	public static void main(String[] args) 
	    { 
	  
	        List<Point> aList = new ArrayList<>(); 
	        aList.add(new Point(10, 20)); 
	        aList.add(new Point(5, 10)); 
	        aList.add(new Point(1, 100)); 
	        aList.add(new Point(50, 2000)); 
	  
	        // displaying the elements 
	        // sorting
	        aList.stream() 
	        .sorted((p1, p2)->p1.x.compareTo(p2.x)) 
	        .forEach(System.out::println); 
	    } 
	} 

