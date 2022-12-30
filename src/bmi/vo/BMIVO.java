package bmi.vo;

import bmi.vo.BMIVO;

public class BMIVO {
	//필드
	private double height;
	private double weight;
	private double  bmi;
	
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi() {
		this.bmi = weight / Math.pow(height/100, 2);
	}

	
}

