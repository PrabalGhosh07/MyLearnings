package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ScrollebleRSex1 {

	public static void main(String[] args) throws  SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		Driver d=(Driver)(Class.forName("com.mysql.cj.jdbc.Driver").newInstance());
		Properties p = new Properties();
		p.put("user", "root");
		p.put("password", "Prabal@07");
		Connection cn = d.connect("jdbc:mysql://localhost:3306/MyLearning",p);
		Statement st= cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		/*TYPE_SCROLL_INSENSITIVE -> This represents is a scrollable ResultSet i.e.
		 *  the cursor moves in forward or backward directions.*/
		/*CONCUR_READ_ONLY --> In general, you will pass this as a value to the createStatement() method as a value of ResultSet 
		 * Concurrency type.Statement createStatement(int resultSetType, int resultSetConcurrency)This type 
		 * of result set is not updatable.
		 */
		ResultSet rs= st.executeQuery("Select * from table1");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2)+"\t");
			System.out.println(rs.getDate(3)+"\t");
		}
		System.out.println("Reading the data,moving the cursor in backward direction\n");
		while(rs.previous()) {
			System.out.println(rs.getInt(1)+"\t");
			System.out.println(rs.getString(2)+"\t");
			System.out.println(rs.getDate(3)+"\t");
		}
		cn.close();
		rs.close();
	}

}
