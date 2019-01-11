import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Unary_Interface {
		  public static void main(String[] args) {

		      UnaryOperator<Integer> unary = v -> v * 10;
		      // This means the same as the UnaryOperator above.
		      Function<Integer, Integer> function = v -> v * 10;

		      System.out.println(unary.apply(10));
		      System.out.println(function.apply(10));
		  }
		}
