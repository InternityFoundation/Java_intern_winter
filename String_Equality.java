
public class String_Equality {

	public static void main(String[] args) {
		String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);       // true
        System.out.println(str1.equals(str2));  // true
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4);       // false
        System.out.println(str3.equals(str4));  // true
        StringBuilder strb1 = new StringBuilder("Hello");
        StringBuilder strb2 = new StringBuilder("Hello");
        System.out.println(strb1 == strb2);        // false
        System.out.println(strb1.equals(strb2));   // false
	}

}
