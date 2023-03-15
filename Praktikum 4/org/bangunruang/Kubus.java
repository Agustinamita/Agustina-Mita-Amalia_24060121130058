/**
 * File : Kubus.java 15/03/2023
 * Penulis : Agustina Mita Amalia
 * Deskripsi : representasi dasar dari kubus
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;

	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}

	public double HitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}

	public double hitungVolume(){
		return this.HitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}