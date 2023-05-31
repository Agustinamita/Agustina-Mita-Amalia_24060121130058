/**
 * File : MainDAO.java 31/05/2023
 * Nama : Agustina Mita Amalia
 * NIM  : 24060121130058
 * Deskripsi : main program untuk akses DAO
**/

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indra");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}