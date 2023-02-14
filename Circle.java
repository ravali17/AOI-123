package Abstraction;

public class Circle  extends Shape{
	double radius;

	public Circle(String colour, double radius) {
		super(colour);
		System.out.println("the circle constructor is called");
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "circle colour is"+super.getColour()+"area is :"+area();
	}

	

}
