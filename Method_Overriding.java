
class MethodOverridingExample{      //Parent Class
			public void add(int n1,int n2){
				int res1=n1+n2;
				System.out.println("Result of parent class method is "+res1);
			}
		}

		class OverriddenMethod{           //Overriding Method
				public void add(int n1,int n2){
					int res2=n1-n2;
					System.out.println("Result of overridden method is "+res2);
			}
		}

public class Method_Overriding {

	public static void main(String[] args) {

			MethodOverridingExample obj1= new MethodOverridingExample();
			obj1.add(2,4);
			OverriddenMethod obj2=new OverriddenMethod();
			obj2.add(9,7);
			}
		}

	


