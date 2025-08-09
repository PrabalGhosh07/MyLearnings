package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectWIthDB_JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found "+e);
		}
		int no_of_rows=0;
		String url = "jdbc:mysql://localhost:3306/MyLearning";
		String username = "root";
		String password="Prabal@07";
		try {
			Connection con = DriverManager.getConnection(url,username,password); 
			Statement st = con.createStatement();
			ResultSet rs= st.executeQuery("Select * from table1");
			while(rs.next()) {
				no_of_rows++;
				System.out.println("id "+rs.getString(1)+"\tname "+rs.getString(2)+"\tHired at "+rs.getDate(3));
			}
			System.out.println("There are "+no_of_rows+" records in the table");
			con.close();
		} catch (SQLException e) {
			System.out.println("SQL exception "+e);
		}

	}

}
