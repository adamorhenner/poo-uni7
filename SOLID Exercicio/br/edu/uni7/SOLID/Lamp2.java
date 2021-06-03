package br.edu.uni7.SOLID;

public class Lamp2 extends Cor implements Button2{
	public boolean state;
	
	public void turnOn() {
		state = true;​​​
		System.out.println("Lamp turned on");
	}​​​
	public void turnOff() {
		state = false;​​​
		System.out.println("Lamp turned off");
	}​​​

	public void toggle() {
		if (state = true) {
			turnOff();
		} else {
			turnOn();
		}
	}
}
