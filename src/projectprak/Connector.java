package projectprak;
import java.sql.*;
/**
 *
 * @author user
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/projectPBO?serverTimezone=UTC";
    String DBusername = "root";
    String DBpassword = "";
    public Connection koneksi;
    public Statement statement;
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
