package ro.ase.cts.seminar9.Flyweight;

import java.util.ArrayList;
import java.util.Random;

public class Model3DFlyweight implements ModelFlyweightInterface {

	String name;
	ArrayList<Double> modelPoints=new ArrayList<>();
	
	
	public Model3DFlyweight(String name) {
		super();
		this.name = name;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.modelPoints=new ArrayList<Double>(new Random().nextInt(1000));
	}


	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("%s at coordinates (%f,%f,%f0) with color %s",
				this.name,data.getX(),data.getY(),data.getZ(),data.getColor()));
		
	}

}
