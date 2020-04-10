package lviv.lgs.ua.task2;

import java.util.Arrays;
import java.util.Random;

public class Aplication {
	
	public static void main(String[] args) {
		Random r = new Random();
		String[] materials = { "Alcantara", "Leather" };

		Auto[][] myAuto = new Auto[1 + r.nextInt(10)][1 + r.nextInt(10)];

		for (int i = 0; i < myAuto.length; i++) {
			for (int j = 0; j < myAuto[i].length; j++) {
				int horsepower = 50 + r.nextInt(250);
				int year = 1950 + r.nextInt(70);
				Wheel wheel = new Wheel(10 + r.nextInt(5), materials[r.nextInt(1)]);
				Engine engine = new Engine(1 + r.nextInt(11));
				myAuto[i][j] = new Auto(horsepower, year, wheel, engine);
			}
		}
		System.out.println(Arrays.deepToString(myAuto));
		int horsepower = 50 + r.nextInt(250);
		int year = 1950 + r.nextInt(70);
		Wheel wheel = new Wheel(10 + r.nextInt(5), materials[r.nextInt(1)]);
		Engine engine = new Engine(1 + r.nextInt(11));
		Auto defaultAuto = new Auto(horsepower, year, wheel, engine);

		for (Auto[] row : myAuto) {
			Arrays.fill(row, defaultAuto);
		}
		System.out.println(Arrays.deepToString(myAuto));
	}

}
