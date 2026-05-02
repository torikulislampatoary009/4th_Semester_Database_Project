package cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbctoIT {

    Connection c;
    Statement s;
    JdbctoIT(){
          try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              c=DriverManager.getConnection("jdbc:mysql://localhost:3306/it_company","root","12Qw34er@#");
              s = c.createStatement();
          } catch (Exception e) {
            e.printStackTrace();
          }
    }
}