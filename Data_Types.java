
public class Data_Types {

	public static void main(String[] args) {
		 //  byte data type 
        byte c = 1; 
  
        // wrapping around Byte object 
        Byte byteobj = new Byte(c); 
  
        // int data type 
        int b = 10; 
  
        //wrapping around Integer object 
        Integer intobj = new Integer(b); 
  
        // float data type 
        float a = 18.6f; 
  
        // wrapping around Float object 
        Float floatobj = new Float(a); 
  
        // double data type 
        double d = 250.5; 
  
        // Wrapping around Double object 
        Double doubleobj = new Double(d); 
  
        // char data type 
        char e='x'; 
  
        // wrapping around Character object 
        Character charobj=e; 
  
        //  printing the values from objects 
        System.out.println("Values of Wrapper objects (printing as objects)"); 
        System.out.println("Byte byteobj:  " + byteobj); 
        System.out.println("Integer intobj:  " + intobj); 
        System.out.println("Float floatobj:  " + floatobj); 
        System.out.println("Double doubleobj:  " + doubleobj); 
        System.out.println("Character charobj:  " + charobj); 
  
        // objects to data types (retrieving data types from objects) 
        // unwrapping objects to primitive data types 
        byte by = byteobj; 
        int it = intobj; 
        float fl = floatobj; 
        double db = doubleobj; 
        char ch = charobj; 
  
        // printing the values from data types 
        System.out.println("Unwrapped values"); 
        System.out.println("byte value, bv: " + by); 
        System.out.println("int value, iv: " + it); 
        System.out.println("float value, fv: " + fl); 
        System.out.println("double value, dv: " + db); 
        System.out.println("char value, cv: " + ch); 

	}

}
