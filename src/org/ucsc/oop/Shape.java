package org.ucsc.oop;

public class Shape {
	private int numberOfLines;
	private int numberOfAngels;
	
	

	public int getNumberOfLines() {
		return numberOfLines;
	}



	public void setNumberOfLines(int numberOfLines) {
		System.out.println("Number of lines"+ " "+numberOfLines);
		this.numberOfLines = numberOfLines;
	}



	public int getNumberOfAngels() {
		
		return numberOfAngels;
	}



	public void setNumberOfAngels(int numberOfAngels) {
		System.out.println("Number of Angle"+" "+numberOfAngels);
		this.numberOfAngels = numberOfAngels;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
