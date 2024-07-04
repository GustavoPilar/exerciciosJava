package entities;

import entities.enums.Color;

// classe abstrata
public abstract class Shape {
	
	private Color color;

	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// método abistrato
	public abstract Double area();
	
}
