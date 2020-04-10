package lviv.lgs.ua.task2;

public class Auto {
	
	private int horsepower;
	private int year;
	private Wheel wheel;
	private Engine engine;

	public Auto(int horsepower, int year, Wheel wheel, Engine engine) {
		super();
		this.horsepower = horsepower;
		this.year = year;
		this.wheel = wheel;
		this.engine = engine;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public int getYear() {
		return year;
	}

	public Wheel getSteeringWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Auto [horsepower=" + horsepower + ", year=" + year + ", steeringWheel=" + wheel + ", engine=" + engine + "]";
	}


}
