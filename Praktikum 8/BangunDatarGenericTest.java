/**
 * File : BangunDatarGenericTest.java
 * Nama : Agustina Mita Amalia
 * NIM : 24060121130058
 * Deskripsi : main class untuk generic bangun datar
*/

public class BangunDatarGenericTest{
	public static void main (String[] args){
		Lingkaran l = new Lingkaran(2);
		BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
		bdg.set(l);
		System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
		System.out.println("tipe generic : "+bdg.get().getClass().getName());

		Segitiga s = new Segitiga(3,2,5);
		BangunDatarGeneric<Segitiga> bdgs = new BangunDatarGeneric<Segitiga>();
		bdgs.set(s);
		System.out.println("keliling segitiga : "+bdgs.hitungKeliling());
		System.out.println("tipe generic : "+bdgs.get().getClass().getName());
	}
}