/**
 * File : Pegawai.java (03/05/2023)
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program polimorfisme inclusion
**/

public class Programmer extends Pegawai{
	private int bonus = 450000;

	Programmer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.printf(", Bonus : %d%n", bonus);
	}
}