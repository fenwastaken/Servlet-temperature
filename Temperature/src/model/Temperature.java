package model;

public class Temperature {

	private double celsius;
	
	public Temperature(Double valeurCelsius){
		celsius = valeurCelsius;
	}

	public Double setCelsius(double celsius){
		return this.celsius = celsius;
	}
	
	public Double getCelsius(){
		return this.celsius;
	}

	public Double getFahrenheit(){
		return (this.celsius * 9/5) + 32;
	}
	
}
