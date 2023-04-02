/**
 * File : Asersi2.java
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 * jari-jari lingkaran yang bernilai 0
**/

class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}

/**
 * Jawaban Pertanyaan *
 * Secara konsep, program tersebut kurang tepat dikarenakan variabel jariJari diinisialisasi
 * dengan nilai 0, kemudian dilakukan assertion dengan kondisi jariJari > 0. Akan tetapi, nilai
 * variabel jariJari tidak pernah diubah dari nilai awal 0 sehingga assertion selalu gagal dan
 * program akan berhenti. Selain itu, dalam sebuah lingkaran, jari-jari tidak boleh bernilai negatif. 
 * Oleh karena itu, assertion seharusnya menggunakan kondisi jariJari >= 0 agar nilai jariJari 
 * dapat bernilai 0, dan menghindari pesan AssertionError saat nilai jari-jari bernilai 0.
**/