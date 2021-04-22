package ro.ase.cts.seminar9.Flyweight;

public class ScreenData {
	private String color;
	private double x,y,z;
	
	public ScreenData(String color, double x, double y, double z) {
		super();
		this.color = color;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getColor() {
		return color;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}
	
	
	
}
