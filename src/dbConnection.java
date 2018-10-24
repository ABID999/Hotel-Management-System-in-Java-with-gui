
import java.sql.Connection;
import java.sql.DriverManager;


public class dbConnection {
     public Connection connect() {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:H:\\Program Files\\NetBeans 8.2\\projects\\HotelProject1\\hoteldb1.sqlite");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
      return con;
    }
}
