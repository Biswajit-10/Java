package serialiseAndDeseralise;

import java.io.Serializable;

public class Human implements Serializable {
	
	String color;
	int hands;
	String blood;
	
	public Human(String color,int hands,String blood){
		this.blood=blood;
		this.hands=hands;
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHands() {
		return hands;
	}

	public void setHands(int hands) {
		this.hands = hands;
	}

	public String getBlood() {
		return blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}
	
}
