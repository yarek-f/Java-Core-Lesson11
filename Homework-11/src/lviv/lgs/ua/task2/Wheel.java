package lviv.lgs.ua.task2;

public class Wheel {
	
	private int diameter;
	private String material;

	public Wheel(int diameter, String material) {
		super();
		this.diameter = diameter;
		this.material = material;
	}

	public int getDiameter() {
		return diameter;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", material=" + material + "]";
	}

}
