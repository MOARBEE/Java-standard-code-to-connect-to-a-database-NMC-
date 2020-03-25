import java.sql.*;
public class JavaDatabase1 {

        public static void main(String[] args) {
            try {
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2", "root",""); //by test2 you put whatever the databases name is, in this case the database name is test2
                System.out.println("Connection Successful");
                Statement stmt = conn.createStatement();
            }
            catch (SQLException ex){

                ex.printStackTrace();
            }

            catch (Exception e) {
                System.out.println("Connection failed" + e);
            }
        }
}
