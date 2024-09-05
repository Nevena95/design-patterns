package structural.facade;

import java.sql.*;


/**
 *  Usage:
 *  For complex APIs, simplify usage and encapsulate logic.
 */
public class DatabaseApi {

    void executeUpdateQuery(String query) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/database";
        String username = "root";
        String password = "12345";
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();

            int m = st.executeUpdate(query);
            if (m != 1) {
                System.out.println("insertion failed");
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }
}
