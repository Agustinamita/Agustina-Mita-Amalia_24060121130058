/**
 * File : Pegawai.java (03/05/2023)
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program polimorfisme inclusion
**/

public class Pegawai{
	private String nama;
	private int gajiPokok = 5000000;
	
	public void setNama(String nama){
		this.nama = nama;
	}

	public void tampilData(){
		System.out.printf("Nama: %s, Gaji Pokok: %d", nama, gajiPokok);
	}
}