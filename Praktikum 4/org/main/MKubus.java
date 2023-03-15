/**
 * File : MKubus.java 15/03/2023
 * Penulis : Agustina Mita Amalia
 * Deskripsi : main dari kubus
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan : " +bujurSangkar.hitungLuas());

		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Volume kubus dengan panjang sisi 4 satuan : " +kubus.hitungVolume());
	}
}