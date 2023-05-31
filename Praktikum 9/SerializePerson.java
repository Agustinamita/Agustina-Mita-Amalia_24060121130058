/**
 * File : SerializePerson.java 31/05/2023
 * Nama/NIM : Agustina Mita Amalia/24060121130058
 * Deskripsi : program untuk realisasi objek person
**/

import java.io.*;
class Person implements Serializable{
	private String name;
	public Person(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}

public class SerializePerson{
	public static void main(String[] args){
		Person person = new Person("Panji");
		try{
			FileOutputStream f = new FileOutputStream("person.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(person);
			System.out.println("selesai menulis objek person");
			s.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}