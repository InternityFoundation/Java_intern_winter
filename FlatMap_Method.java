	import java.util.*; 
	import java.util.stream.Stream;
	
public class FlatMap_Method { 
	    public static void main(String[] args) 
	    { 
	  
	        // Creating a List of Strings 
	        List<String> list = Arrays.asList("5.6", "7.4", "4", 
	                                          "1", "2.3"); 
	  
	        // Using Stream flatMap 
	        list.stream().flatMap(num -> Stream.of(num)). 
	                         forEach(System.out::println); 
	    } 
	}

