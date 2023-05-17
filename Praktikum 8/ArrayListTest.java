/**
 * File : ArrayListTest.java
 * Nama : Agustina Mita Amalia
 * NIM : 24060121130058
 * Deskripsi : program penggunaan objek ArrayList sebagai collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		strings.remove("praktikum");
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}