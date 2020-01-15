import java.sql.*;

import javax.swing.*;
public class sqlLiteConnection {
	Connection conn = null;
	
	public static Connection dbConnector(){
		try {
			Class.forName("org.sqlite.JDBC");
			//Connects to path where database is located//
			Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\CodeRespository\\Bank App\\BankInfo.db");
			//If connected show message//
			//JOptionPane.showMessageDialog(null,"Connection Successful");
			return conn;
		}catch(Exception e)
		{	//If not connected print the exception//
			System.out.print(e);
		  	return null;
		}	
	}

}
