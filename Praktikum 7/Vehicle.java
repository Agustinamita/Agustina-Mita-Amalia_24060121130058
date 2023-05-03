/**
 * File : Vehicle.java (03/05/2023)
 * Nama : Agustina Mita Amalia
 * Deskripsi : Program polimorfisme inclusion
**/

public class Vehicle{
	void calRent(int distance, float price){
		float fare = distance*price;
		System.out.println("vehicle price = "+fare);
	}
}