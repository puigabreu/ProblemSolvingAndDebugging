
public class BuggyParty {

	private int guestNumber;
	private String[] guests;
	private int timeElapsed;


	// A constructor for a Party. Assumes that guests.length = capacity and that
	// there are no null entries.
	public BuggyParty(String[] guests) {
		this.guests = guests;
		this.timeElapsed = 0;
		this.guestNumber = guests.length;
	}

	// Getters
	public int getCapacity() {
		return this.guests.length;
	}

	public int getGuestNumber() {
		return this.guestNumber;
	}

	public String[] getGuests() {
		return this.guests;
	}

	public int getTimeElapsed() {
		return this.timeElapsed;
	}

	// Causes an hour to pass in the party. Each hour, a guest leaves.
	// Once half the capacity of hours have passed, everyone leaves.
	public void timePasses() {
		this.timeElapsed++;
		this.guestNumber--;
		this.guests[guestNumber] = null;

		if(this.timeElapsed > this.guests.length/2)
			this.guests = new String[this.guests.length]; 
		this.guestNumber = 0;
	}

	// Helper method to print arrays
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length && arr[i] != null; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// After successfully debugging the code, implement some methods!

	// A method to create a deep copy of an array
	public static String[] copy() {
		return null;
	}

	//Returns true if the guest is in the party
	public boolean containsGuest(String guest) {
		return false; 
	}
	
	// If there is space in the party, add the guest
	public void addGuest(String guest) {

	}

	// Returns true if there are no guests
	public boolean isOver() {
		return false;
	}





	public static void main(String[] args) {
		String[] guests = {"Maria", "Jorge", "Fatima", "Orlando", "Carola", "Alex"};
		printArray(guests);
		BuggyParty party = new BuggyParty(guests);
		party.timePasses();
		printArray(guests);
	}

}
