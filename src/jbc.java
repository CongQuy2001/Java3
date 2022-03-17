
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class jbc {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stament = null;
        ResultSet rs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String dbusername = "sa",
                    dbdulpass = "12345678",
                    dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=demojdbc";
            DriverManager.getConnection(dbUrl, dbusername, dbdulpass);
            conn = DriverManager.getConnection(dbUrl, dbusername, dbdulpass);
            String spl = "select * from dbo.name";
            stament = conn.createStatement();
            rs = stament.executeQuery(spl);
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "_" + rs.getString("tên") + "+" + rs.getString("mark"));
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(jbc.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(jbc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (stament != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(jbc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (rs != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(jbc.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
