package data.demo.mariadbdemo;

/**
 * Hello world!
 *
 */
import java.sql.*;
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost:3306/demo?user=geminid&password=");
    		Statement mystat=con.createStatement();
    		ResultSet rs= mystat.executeQuery("Select * from detail");
    		while(rs.next()) {
    		System.out.println(rs.getString("name"));
    		}
    	}
    	catch(Exception e) {
    		System.out.println("error"+e);
    	}
    }
}
