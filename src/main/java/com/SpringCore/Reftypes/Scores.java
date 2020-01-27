package com.SpringCore.Reftypes;

public class Scores {
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", english=" + english + ", physics=" + physics + "]";
	}

	private double maths;
	private double english;
	private double physics;

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

}
