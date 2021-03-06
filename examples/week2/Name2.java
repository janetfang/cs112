public class Name2 {

	//data members
	private String first;
	private String last;
	private char middle;

	//getters
	public String getFirst() {
		return this.first;
	}

	public String getLast() {
		return this.last;
	}
	
	public char getMiddle() {
		return this.middle;
	}

	//setters
	public void setLast(String last) {
		this.last = last;
	}

	//other methods
	public String toString() {
		return "First: " + this.first + 
				" Middle: " + this.middle + 
				" Last: " + this.last;
	}

	//constructor(s)
	public Name2(String first, String last, char middle) {
		this.first = first;
		this.last = last;
		this.middle = middle;
	}

}
