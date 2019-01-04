
public class Java_Operators {

	public static void main(String[] args) {
		    func1(); // operators, operands and expressions
	        func2(); // arithmetic operators and operator precedence
	        func3(); // Increment and Decrement
	        func4(); // Shift 
	        func5(); // Comparison 
	        func6(); // Logical 
	        func7(); // Other
	      	}
public static void func1() {

   // [infix]
   int a = 2 * 2;

   // [prefix]
   System.out.println(-a); // -4
   System.out.println(++a); // 5; increment a directly

   // [post fix]
   System.out.println(a--); // 5;first get the value of a,then decrement
   System.out.println(a); // 4
}

public static void func2() {
	
    int num = 3,a = 2,b = 1, sum , sub , mul, div;   
     //code for modulo
    if (num % 2 == 0) {
        System.out.println("Number is even");
    }
    else {
        System.out.println("Number is odd");
    }
    //code for addition 
    sum = a+b;
    //subtraction
    sub = a-b;
    //multiplication
    mul = a*b;
    //division
    div = a/b;
    //Precedence operator
    int x = 3;
    int y = ++x * 5 / x-- + --x;
    // same as y = 4 * 5 / 4 + -2
    System.out.println("x is " + x);
    System.out.println("y is " + y);
}

public static void func3() {

    for(int i = 0; i < 5; i++) {
        System.out.println();
    }

    for(int j = 5; j > 0; j--) {
        System.out.println(j);
    }

    int k = 4;
    System.out.println(++k); // 5; increment k, then get value
    System.out.println(k--); // 5; get value of k, then decrement
    System.out.println(k); // 4

    if(k++ > 4) {
        System.out.println("Number is > 4");
    }
    else {
        System.out.println("Number is not > 4"); // this will run
    }
    if(++k > 5) {
        System.out.println("Number is > 5"); // this will run
    }
    else {
        System.out.println("Number is not > 5");
    }
    int[] x = {0,1,2,3};
    int idx = 0;
    System.out.println("Value is " + (x[idx++] >= 0 && idx > 0));

    short t = 10, u = 0;
    u = ++t;
}

public static void func4() {
    //Shift operators
    System.out.println(1 << 1); // 2, move 1 to next left binary column
    System.out.println(1 << 2); // 4
    System.out.println(32 >> 2); // 8
}

public static void func5() {
    //Comparison operator
    Integer a1 = new Integer(12345);
    Integer a2 = new Integer(12345);
    System.out.println((a1 == a2));

    Integer a3 = 1;
    Integer a4 = 1;
    System.out.println((a3 == a4)); 
}

public static void func6() {
 //Logical Operator
	int a = 3;
    boolean b = (a >= 3) || (++a <= 9);
    System.out.println(a);
}

public static void func7() {
	//Other operators
	 Integer iobj = new Integer(99);
     boolean isObject = iobj instanceof Object ? true : false; // true
     System.out.println(isObject);
     boolean isObject2 = null instanceof Object ? true : false; // false
     System.out.println(isObject2);
     boolean isNumber = iobj instanceof Number ? true : false; // true
     System.out.println(isNumber);
}
}