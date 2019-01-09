

	import java.sql.Connection;
	import java.sql.DriverManager;

	public class JDBC {

		public static void main(String[] args) {

		}
		
		public static Connection getConnection() throws Exception
		{
			try{
				String driver="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/database";
				String username="Chhavi Srivastava";
				String password="1234";
				Class.forName(driver);
				Connection conn=DriverManager.getConnection(url,username,password);
				System.out.println("connected");
				return conn;
				}catch(Exception e){System.out.println(e);}
			return null;
			
		}

	}

