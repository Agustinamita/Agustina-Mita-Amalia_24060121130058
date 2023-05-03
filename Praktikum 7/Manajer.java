/**
 * File : Manajer.java (03/05/2023)
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program polimorfisme inclusion
**/

public class Manajer extends Pegawai{
	private int tunjangan = 700000;

	Manajer(String nama){
		setNama(nama);
	}

	public void tampilData(){
		super.tampilData();
		System.out.printf(", Tunjangan : %d%n", tunjangan);
	}
}