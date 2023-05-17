/**
 * File : Lingkaran.java
 * Nama : Agustina Mita Amalia
 * NIM : 24060121130058
 * Deskripsi : implementasi lingkaran sebagai BangunDatar
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}

