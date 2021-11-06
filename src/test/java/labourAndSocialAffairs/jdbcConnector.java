/*package labourAndSocialAffairs;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class jdbcConnector {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String host = "localhost";
		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/credentials?useSSL=false","root","newrootpassword");
		java.sql.Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from demo where scenario='zerobalanced'");
		
		while(rs.next())
		{
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		System.out.println(rs.getString("scenario"));
		}
	}

}*/