package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbcDemo {
	@Test
	public void script() throws SQLException
	{
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/credentials", "root", "prem");
		Statement s = con.createStatement();
		ResultSet se = s.executeQuery("select* from tequilla where username='admin';");
		se.next();
		System.out.println(se.getString("username"));
		System.out.println(se.getString("passwor"));
	}

}
