
public class BuggyDice {
	
	private int sides;
	private int sideUp;
	
	public BuggyDice(int sides) {
		this.sides = sides;
		this.sideUp = (int)(Math.random() * sides);
	}
	
	// getters
	public int getSides() {
		return this.sides;
	}
	
	public int getSideUp() {
		return this.sideUp;
	}
	
	
	// A method to roll the dice
	public int roll() {
		this.sideUp = (int)(Math.random() * sides);
		return this.sideUp;
	}
	
	// A method to roll the dice until a given side is up. Returns -1 if it is an
	// invalid side
	public int timesToRoll(int side) {
		if(side > this.sides)
			return -1;
		int count = 0;
		while(this.sideUp != side) {
			this.roll();
			count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		BuggyDice dice = new BuggyDice(6);
		System.out.println(dice.timesToRoll(5));
	}

}
