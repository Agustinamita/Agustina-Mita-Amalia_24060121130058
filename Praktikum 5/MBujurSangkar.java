/**
 * Nama file : MBujurSangkar.java 02/04/2023
 * Penulis : Agustina Mita Amalia
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
**/

import java.util.Scanner;

class MBujurSangkar{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan sisi bujur sangkar : ");
		double sisi = scan.nextDouble();
		scan.close();
		System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));	
	}
}