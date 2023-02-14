package Abstraction;

abstract class Shape {
	String colour;
	abstract double area();
	public abstract String toString();
	public Shape(String colour) {
		super();
		System.out.println("the constructor is called");
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	
	
	

}
