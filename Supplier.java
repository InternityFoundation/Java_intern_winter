import java.util.function.IntSupplier;
public class Supplier {
	    public static void main(String[] args) {
	        int n = 3;
	        display(() -> n + 10);
	        display(() -> n + 100);
	    

		static void display(Supplier<Integer> arg);
		{
	        System.out.println(arg.get());
	    }
	    }
	}

