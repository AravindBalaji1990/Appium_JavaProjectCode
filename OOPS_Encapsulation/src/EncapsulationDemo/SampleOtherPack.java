package EncapsulationDemo;

import encapsulation.*;
public class SampleOtherPack {

	public static void main(String[] args) {
		encapsulation enc = new encapsulation();
		enc.setSalary(1000);
		System.out.println(enc.getSalary());
	}

}
