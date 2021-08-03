package com.company;

import java.util.Locale;

public class Automobile {
	private String brand;
	private int year;
	private int countOfOwners;

	public Automobile(String brand, int year, int owners){
		this.setBrand(brand);
		this.setYear(year);
		this.setCountOfOwners(countOfOwners);
	}

	public String setBrand(String brand){
		brand = brand.strip();
		this.brand = brand.substring(0,1).toUpperCase(Locale.ROOT) + brand.substring(1).toLowerCase(Locale.ROOT);
		return brand;
	}
	public int setYear(int year){
		if(year < 1800 || year > 2021){
			this.year = -1;
		}
		return this.year;
	}
	public int setCountOfOwners(int countOfOwners){
		if(countOfOwners < 0){
			this.countOfOwners = -1;
		}
		return this.countOfOwners;
	}
	public String getBrand(String brand){
		return this.brand;
	}
	public int getYear(int year){
		return this.year;
	}
	public int getCountOfOwners(int countOfOwners){
		return this.countOfOwners;
	}
	public String toString(){
		return "\n Бренд: " + this.brand + "\nГод: " + this.year + "\nКол-во владельцев: " + this.countOfOwners;
	}
}
