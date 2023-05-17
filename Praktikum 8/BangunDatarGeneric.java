/**
 * File : BangunDatarGeneric.java
 * Nama : Agustina Mita Amalia
 * NIM : 24060121130058
 * Deskripsi : kelas kontruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
	private T1 bangunDatar;
	
	public void set(T1 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T1 get(){
		return bangunDatar;
	}

	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

/** Ketika T diganti dengan T1, program masih bisa tetap berjalan dan hasilnya tetap sama**/