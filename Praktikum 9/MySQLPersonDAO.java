import java.sql.*;
/**
 * File : MySQLPersonDAO.java 31/05/2023
 * Nama : Agustina Mita Amalia
 * NIM  : 24060121130058
 * Deskripsi : implementasi PersonDAO untuk MYSQL
**/

public class MySQLPersonDAO implements PersonDAO{
	public void savePerson(Person person) throws Exception{
		String name = person.getName();
		//membuat koneksi, nama db, user, password menyesuaikan
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/pbo","root","");
		//kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES ('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
		//tutup koneksi database
		con.close();
	}
}