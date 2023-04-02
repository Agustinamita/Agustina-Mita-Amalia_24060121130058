/**
 * File : AngkaSial.java
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program penggunaan exception buatan sendiri. pengenalan clausa 'throw' dan 'throws'
**/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			//methode getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/**
 * Jawab Pertanyaan *
 ** Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Jawab : Tidak, baris ke-12 tidak akan dieksekusi jika eksepsi terjadi pada saat menjalankan 
 * as.cobaAngka(13) pada baris ke-12. Hal tersebut terjadi karena ketika eksepsi AngkaSialException 
 * di lemparkan pada baris ke-5, program akan keluar dari blok try dan melanjutkan ke blok catch, 
 * sehingga baris ke-12 tidak akan dieksekusi. Selanjutnya program akan mengeksekusi blok catch untuk 
 * menangani eksepsi yang terjadi.
 ** Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
 * Jawab : Ya, catch dapat dieksekusi jika eksepsi AngkaSialException terjadi pada saat menjalankan 
 * as.cobaAngka(13) pada baris ke-19. Setelah itu, program akan masuk ke blok catch yang akan menangani 
 * eksepsi dan menjalankan perintah pada blok catch tersebut. Dalam kasus ini, program akan mencetak pesan 
 * "hati-hati memasukkan angka!!!" pada baris ke-24 dan pesan yang diperoleh dari pemanggilan metode 
 * getMessage() pada objek AngkaSialException pada baris ke-23.
**/



