
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

     public Connection connect() {
     Connection con = null;
      try {
         Class.forName("org.sqlite.JDBC");
         con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Anwar\\Google Drive\\Courses\\Java\\sqllite\\studentinfo.sqlite");
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      
      return con;
    }
    
}
