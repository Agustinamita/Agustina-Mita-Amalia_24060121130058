/**
 * File : MPoligon.java 08/03/2023
 * Penulis : Agustina Mita Amalia
 * Deskripsi : driver class untuk poligon dan persegi panjang
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());

		Segitiga s1 = new Segitiga(4, 15, 3);
		s1.printInfo();
		System.out.println("Luas Segitiga : "+s1.hitungLuas());
	}

}