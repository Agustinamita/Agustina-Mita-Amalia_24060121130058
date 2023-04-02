/**
 * Nama file : BangunDatar.java 02/04/2023
 * Penulis : Agustina Mita Amalia
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
**/

public abstract class BangunDatar{
	protected double luas;

	public abstract double hitungLuas(double sisi);

	protected void setLuas(double Luas){
		this.luas = Luas;
	}

	public double getLuas(){
		return luas;
	}
}