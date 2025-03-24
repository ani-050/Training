package encapsulation;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle getDia() {
		System.out.println("Diameter:"+getRadius()*2);
		return this;
	}
	public Circle getPeri() {
		System.out.println("Perimeter:"+2*Math.PI*getRadius());
		return this;
	}
	public Circle getArea() {
		System.out.println("Area:"+Math.PI*Math.pow(getRadius(), 2));
		return this;
	}

}
