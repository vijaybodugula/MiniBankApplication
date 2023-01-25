package Banking;


import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/BANK",
            "postgres", "1729gsem");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }

public static Connection getConnection() {
	// TODO Auto-generated method stub
	return null;
}





}